package com.design.mirror.service;

import com.design.mirror.entity.Clothes;
import com.design.mirror.entity.UserCollection;
import com.design.mirror.mapper.ClothesMapper;
import com.design.mirror.mapper.UserCollectionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClothesService {

    @Autowired
    private ClothesMapper clothesMapper;

    @Autowired
    private UserCollectionMapper userCollectionMapper;

    public int saveClothes(Clothes clothes) {
        return clothesMapper.insert(clothes);
    }

    public Clothes selectById(int id) {
        return clothesMapper.selectByPrimaryKey(id);
    }

    public int updateById(Clothes clothes) {
        return clothesMapper.updateByPrimaryKey(clothes);
    }

    public int deleteById(int id) {
        return clothesMapper.deleteByPrimaryKey(id);
    }

    public List<Clothes> selectByName(String name) {
        return clothesMapper.selectByName(name);
    }

    public List<Clothes> selectByHeightAndWeight(Clothes clothes) {
        return clothesMapper.selectByHeightAndWeight(clothes);
    }

    public List<Clothes> selectUserCollection(int userId) {
        List<UserCollection> userCollectionList = userCollectionMapper.selectByUserId(userId);
        List<Clothes> clothesList = new ArrayList<>();
        Clothes clothes = new Clothes();
        for (UserCollection userCollection : userCollectionList) {
            clothes = new Clothes();
            clothes = clothesMapper.selectByPrimaryKey(userCollection.getClothesId());

            clothesList.add(clothes);
        }

        return clothesList;
    }

    public int deleteUserCollection(int id) {
        return userCollectionMapper.deleteByPrimaryKey(id);
    }

    public int saveUserCollection(UserCollection userCollection) {
        return userCollectionMapper.insert(userCollection);
    }
}
