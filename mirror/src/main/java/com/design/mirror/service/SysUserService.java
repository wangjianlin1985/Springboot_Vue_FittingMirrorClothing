package com.design.mirror.service;

import com.design.mirror.entity.SysUser;
import com.design.mirror.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    public SysUser logon(SysUser sysUser) {
        return sysUserMapper.logon(sysUser);
    }
}
