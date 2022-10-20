package com.ibm.portalserver.service;

import com.ibm.portalserver.domain.UserEntity;

import java.util.List;

public interface IUserService {
    List<UserEntity> getList();
    List<UserEntity> getOneUserList(Long userId);
    Integer addUser(UserEntity userEntity);
    Integer updateUser(UserEntity userEntity);
    Integer deleteUser(Long userId);



}
