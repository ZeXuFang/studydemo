package com.ibm.portalserver.service.impl;

import com.ibm.portalserver.domain.UserEntity;
import com.ibm.portalserver.mapper.UserMapper;
import com.ibm.portalserver.service.IUserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImp implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<UserEntity> getList() {
        return null;
    }

    @Override
    public List<UserEntity> getOneUserList(Long userId) {
        return userMapper.getOneUserList(userId);
    }


    @Override
    public Integer addUser(UserEntity userEntity) {
        /*List<UserEntity> jsonObj = userMapper.getList();
        Long userId[] = new Long[jsonObj.size()];
        for(int i = 0; i<jsonObj.size(); i++){
            userId[i]=jsonObj.get(i).getUserId();
        }
        if(Arrays.asList(userId).contains(userEntity.getUserId())){
            System.out.println("This userId exists and cannot add into db.");
            return 0;
        }*/
        return 0;
    }

    @Override
    public Integer updateUser(UserEntity userEntity) {
        return userMapper.updateUser(userEntity);
    }

    @Override
    public Integer deleteUser(Long userId) {
        return userMapper.deleteUser(userId);
    }
}

