package com.design.mirror.mapper;

import com.design.mirror.entity.AppUser;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AppUser record);

    int insertSelective(AppUser record);

    AppUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AppUser record);

    int updateByPrimaryKey(AppUser record);

    AppUser logon(AppUser appUser);

    List<AppUser> selectByPage(@Param(value = "start") int start, @Param(value = "pageSize")int pageSize);

    long selectCount();

    AppUser selectByPhone(AppUser appUser);
}