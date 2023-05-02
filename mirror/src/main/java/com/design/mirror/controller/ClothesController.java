package com.design.mirror.controller;

import com.design.mirror.entity.Clothes;
import com.design.mirror.entity.UserCollection;
import com.design.mirror.service.ClothesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/clothes")
@CrossOrigin("http://localhost:3000")
public class ClothesController {

    @Autowired
    private ClothesService clothesService;

    @RequestMapping("/saveClothes")
    public int saveClothes(@RequestBody Clothes clothes) {
        return clothesService.saveClothes(clothes);
    }

    @RequestMapping("/uploadClothesPicture/{id}")
    public int uploadClothesPicture(@RequestParam("file") MultipartFile file, @PathVariable("id") int id) {
        String fileName = UUID.randomUUID().toString() + file.getOriginalFilename().substring(file.getOriginalFilename().indexOf("."));
        File dest = new File(System.getProperty("user.dir") + "/src/main/resources/static/upload/picture/" + fileName);
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }

        Clothes clothes = clothesService.selectById(id);
        clothes.setPicture(fileName);
        clothesService.updateById(clothes);

        return 1;
    }

    @RequestMapping("/uploadClothesVideo/{id}")
    public int uploadClothesVideo(@RequestParam("file") MultipartFile file, @PathVariable("id") int id) {
        String fileName = UUID.randomUUID().toString() + file.getOriginalFilename().substring(file.getOriginalFilename().indexOf("."));
        File dest = new File(System.getProperty("user.dir") + "/src/main/resources/static/upload/video/" + fileName);
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }

        Clothes clothes = clothesService.selectById(id);
        clothes.setVideo(fileName);
        clothesService.updateById(clothes);

        return 1;
    }

    @RequestMapping("/updateClothes")
    public int updateClothes(@RequestBody Clothes clothes) {
        return clothesService.updateById(clothes);
    }

    @RequestMapping("/deleteClothes")
    public int deleteClothes(@RequestParam("id") int id) {
        return clothesService.deleteById(id);
    }

    @RequestMapping("/deleteVideo")
    public int deleteVideo(@RequestParam("id") int id) {
        Clothes clothes = clothesService.selectById(id);
        clothes.setVideo(null);

        return clothesService.updateById(clothes);
    }

    @RequestMapping("/selectByName")
    public List<Clothes> selectByName(@RequestParam("name") String name) {
        return clothesService.selectByName(name);
    }

    @RequestMapping("/selectByHeightAndWeight")
    public List<Clothes> selectByHeightAndWeight(@RequestBody Clothes clothes) {
        List<Clothes> clothesList = clothesService.selectByHeightAndWeight(clothes);
        for (Clothes clothes1 : clothesList) {
            clothes1.setPicture("http://localhost:8080/upload/picture/" + clothes1.getPicture());
        }
        return clothesList;
    }

    @RequestMapping("/selectById")
    public Clothes selectById(@RequestParam("id") int id) {
        return clothesService.selectById(id);
    }

    @RequestMapping("/selectUserCollection")
    public List<Clothes> selectUserCollection(@RequestParam("userId") int userId) {
        return clothesService.selectUserCollection(userId);
    }

    @RequestMapping("/deleteUserCollection")
    public int deleteUserCollection(@RequestParam("id") int id) {
        return clothesService.deleteUserCollection(id);
    }

    @RequestMapping("/saveUserCollection")
    public int saveUserCollection(@RequestBody UserCollection userCollection) {
        List<Clothes> clothesList = clothesService.selectUserCollection(userCollection.getAppUserId());
        for (Clothes clothes : clothesList) {
            if (clothes.getId() == userCollection.getClothesId()) {
                return 2;
            }
        }
        return clothesService.saveUserCollection(userCollection);
    }
}
