package com.design.mirror.service;

import com.design.mirror.entity.AppUser;
import com.design.mirror.mapper.AppUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUserService {

    @Autowired
    private AppUserMapper appUserMapper;

    public int saveAppUser(AppUser appUser) {
        return appUserMapper.insert(appUser);
    }

    public AppUser selectById(int id) {
        return appUserMapper.selectByPrimaryKey(id);
    }

    public int updateById(AppUser user) {
        return appUserMapper.updateByPrimaryKeySelective(user);
    }

    public AppUser logon(AppUser appUser) {
        return appUserMapper.logon(appUser);
    }

    public List<AppUser> selectByPage(int currPage) {
        int start = 10 * (currPage - 1);
        return appUserMapper.selectByPage(start, 10);
    }

    public long selectCount() {
        return appUserMapper.selectCount();
    }

    public AppUser selectByPhone(AppUser appUser) {
        return appUserMapper.selectByPhone(appUser);
    }
}
