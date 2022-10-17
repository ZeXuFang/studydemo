package com.ibm.portalserver.service.impl;

import com.ibm.portalserver.domain.RoleJpa;
import com.ibm.portalserver.domain.UserJpa;
import com.ibm.portalserver.repository.RoleJpaRepository;
import com.ibm.portalserver.repository.UserJpaReposiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserJpaService {
    @Autowired
    UserJpaReposiory userJpaReposiory;
    public void setUserJpaReposiory(UserJpaReposiory userJpaReposiory) {
        this.userJpaReposiory = userJpaReposiory;
    }


    public List<UserJpa> getAll() {
        return userJpaReposiory.findAll();
    }




    public List<UserJpa> deleteUser(String id) {
        userJpaReposiory.deleteById(id);
        return userJpaReposiory.findAll();
    }

    public List<UserJpa> saveUser(UserJpa userJpa) {
        userJpaReposiory.save(userJpa);
        return userJpaReposiory.findAll();
    }

    public List<UserJpa> updateUser(UserJpa userJpa) {
        Optional<UserJpa> _userJpa = userJpaReposiory.findById(userJpa.getUserId());
        _userJpa.get().setUserId(userJpa.getUserId());
        _userJpa.get().setCreateTime(userJpa.getCreateTime());
        _userJpa.get().setCreateBy(userJpa.getCreateBy());
        _userJpa.get().setEmail(userJpa.getEmail());
        _userJpa.get().setDelFlag(userJpa.getDelFlag());
        _userJpa.get().setStatus(userJpa.getStatus());
        _userJpa.get().setRemark(userJpa.getRemark());
        _userJpa.get().setUpdateBy(userJpa.getUpdateBy());
        _userJpa.get().setAvatar(userJpa.getAvatar());
        _userJpa.get().setSex(userJpa.getSex());
        _userJpa.get().setUpdateTime(userJpa.getUpdateTime());
        _userJpa.get().setUserType(userJpa.getUserType());
        _userJpa.get().setNickName(userJpa.getNickName());
        _userJpa.get().setPhonenumber(userJpa.getPhonenumber());
        _userJpa.get().setPassword(userJpa.getPassword());
        _userJpa.get().setDeptId(userJpa.getDeptId());
        _userJpa.get().setUserName(userJpa.getUserName());
        userJpaReposiory.save(_userJpa.get());
        return userJpaReposiory.findAll();


    }
}
