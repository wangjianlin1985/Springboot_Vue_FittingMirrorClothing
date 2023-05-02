package com.design.mirror.controller;

import com.design.mirror.entity.AppUser;
import com.design.mirror.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/appUser")
@CrossOrigin("http://localhost:3000")
public class AppUserController {

    @Autowired
    private AppUserService appUserService;

    @RequestMapping("/saveAppUser")
    public int saveAppUser(@RequestBody AppUser appUser) {
        return appUserService.saveAppUser(appUser);
    }

    @RequestMapping("/uploadHeader/{id}")
    public String uploadClothesPicture(@RequestParam("file") MultipartFile file, @PathVariable("id") int id) {
        String fileName = UUID.randomUUID().toString() + file.getOriginalFilename().substring(file.getOriginalFilename().indexOf("."));
        File dest = new File(System.getProperty("user.dir") + "/src/main/resources/static/upload/header/" + fileName);
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }

        AppUser appUser = appUserService.selectById(id);
        appUser.setHeader(fileName);
        appUserService.updateById(appUser);


        return fileName;
    }

    @RequestMapping("/updatePassword")
    public int updatePassword(@RequestBody AppUser appUser) {
        String newPwd = appUser.getPassword();
        appUser.setPassword(appUser.getOldPassword());
        AppUser appUser1 = appUserService.logon(appUser);
        if (appUser1 == null) {
            return 2;
        }
        appUser.setPassword(newPwd);
        return appUserService.updateById(appUser);
    }

    @RequestMapping("/resetPassword")
    public int resetPassword(@RequestParam String phone) {
        AppUser appUser = new AppUser();
        appUser.setPhone(phone);

        appUser = appUserService.selectByPhone(appUser);
        if (appUser == null) {
            return 2;
        }

        String newPwd = String.valueOf(Math.random()).substring(2,8);

        appUser.setPassword(newPwd);
        appUserService.updateById(appUser);

        return 1;
    }

    @RequestMapping("/selectById")
    public AppUser selectById(@RequestParam("id") int id) {
        return appUserService.selectById(id);
    }

    @RequestMapping("/logon")
    public AppUser logon(@RequestBody AppUser appUser) {
        return appUserService.logon(appUser);
    }

    @RequestMapping("/selectByPage")
    public Map selectByPage(@RequestParam("currPage") int currPage) {
        Map map = new HashMap();
        map.put("data", appUserService.selectByPage(currPage));
        map.put("total", appUserService.selectCount());

        return map;
    }
}
