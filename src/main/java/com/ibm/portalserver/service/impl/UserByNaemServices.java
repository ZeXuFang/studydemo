package com.ibm.portalserver.service.impl;

import com.ibm.portalserver.domain.UserJpa;
import com.ibm.portalserver.repository.UserJpaReposiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class UserByNaemServices {
    @Autowired
    UserJpaReposiory userJpaReposiory;

    public void setUserJpaReposiory(UserJpaReposiory userJpaReposiory) {
        this.userJpaReposiory = userJpaReposiory;
    }

    public List<UserJpa> getOne(String name) {
        List<UserJpa> userJpaList = userJpaReposiory.findByuserName(name);
        //return userJpaReposiory.findAll();
        return userJpaList;
    }

    public List<UserJpa> deleteUser(String name) {
       // Object j = new Object();
        String j = null;
        List<UserJpa> userJpaList = userJpaReposiory.findByuserName(name);
        for (UserJpa userJpa : userJpaList) {
            j = userJpa.getUserId();
        }
        userJpaReposiory.deleteById(j);
        return userJpaReposiory.findAll();
    }


    public  List<UserJpa> updateUser1(UserJpa userJpa) {
        String j = "";
        String name = userJpa.getUserName();
        List<UserJpa> userJpaList = userJpaReposiory.findByuserName(name);
        for (UserJpa userJpaList1 : userJpaList) {
            j = userJpaList1.getUserId();
        }
        Optional<UserJpa> _userJpa = userJpaReposiory.findById(j);
        //_userJpa.get().setUserId(userJpa.getUserId());
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
        //_userJpa.get().setUserName(userJpa.getUserName());
        userJpaReposiory.save(_userJpa.get());
        return userJpaReposiory.findAll();

    }
    public Map<String,Object> updateUser(UserJpa userJpa) {
        Map<String,Object> res = new HashMap<>();
        res.put("userJpaName",userJpa.getUserName());
        List<UserJpa> _userJpa = userJpaReposiory.findByuserName(userJpa.getUserName());
        res.put("_userJpa",_userJpa);
        for (UserJpa u : _userJpa) {
            u.setUserId(userJpa.getUserId());
            u.setCreateTime(userJpa.getCreateTime());
            u.setCreateBy(userJpa.getCreateBy());
            u.setEmail(userJpa.getEmail());
            u.setDelFlag(userJpa.getDelFlag());
            u.setStatus(userJpa.getStatus());
            u.setRemark(userJpa.getRemark());
            u.setUpdateBy(userJpa.getUpdateBy());
            u.setAvatar(userJpa.getAvatar());
            u.setSex(userJpa.getSex());
            u.setUpdateTime(userJpa.getUpdateTime());
            u.setUserType(userJpa.getUserType());
            u.setNickName(userJpa.getNickName());
            u.setPhonenumber(userJpa.getPhonenumber());
            u.setPassword(userJpa.getPassword());
            u.setDeptId(userJpa.getDeptId());
            res.put("u",u);
            userJpaReposiory.save(u);
        }
        // _userJpa.get(i).setUserName(userJpa.getUserName());
        res.put("findAll",userJpaReposiory.findAll());
        return res;

    }
}
