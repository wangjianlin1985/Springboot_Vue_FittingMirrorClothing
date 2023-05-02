package com.design.mirror.controller;

import com.design.mirror.entity.SysUser;
import com.design.mirror.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sysUser")
@CrossOrigin("http://localhost:3000")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/logon")
    public SysUser logon(@RequestBody SysUser sysUser) {
        return sysUserService.logon(sysUser);
    }
}
