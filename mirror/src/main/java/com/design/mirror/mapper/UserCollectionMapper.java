package com.design.mirror.mapper;

import com.design.mirror.entity.UserCollection;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserCollectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserCollection record);

    int insertSelective(UserCollection record);

    UserCollection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserCollection record);

    int updateByPrimaryKey(UserCollection record);

    List<UserCollection> selectByUserId(int userId);
}