package com.design.mirror.mapper;

import com.design.mirror.entity.Clothes;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClothesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Clothes record);

    int insertSelective(Clothes record);

    Clothes selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Clothes record);

    int updateByPrimaryKey(Clothes record);

    List<Clothes> selectByName(String name);

    List<Clothes> selectByHeightAndWeight(Clothes clothes);
}