package com.ibm.portalserver.controller;

import com.ibm.portalserver.domain.LinkEntity;
import com.ibm.portalserver.domain.UserEntity;
import com.ibm.portalserver.service.IUserService;
import com.ibm.portalserver.service.impl.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class UserCtl {
    @Autowired
    IUserService userService;

    @CrossOrigin
    @GetMapping("/list")
    public List<UserEntity> getList() {
        return userService.getList();
    }

//    @GetMapping("getUsers")
//    public List<Map<String,String>> getUser(){
//        return linkService.linkUser();
//    }

    @CrossOrigin
    @GetMapping("/getOneUserList")
    public List<UserEntity> getOneUserList( long userId) {
        return userService.getOneUserList(userId);
    }

    @CrossOrigin
    @RequestMapping("/addUser")
    public Integer addDept(@RequestBody UserEntity userEntity) {
        return userService.addUser(userEntity);
    }

    @CrossOrigin
    @PutMapping("/updateUser")
    public Integer updateUser(@RequestBody UserEntity userEntity) {
        return userService.updateUser(userEntity);
    }

    @CrossOrigin
    @DeleteMapping("/deleteUser")
    public Integer deleteUser(@RequestParam("userId") Long userId) {
        return userService.deleteUser(userId);
    }
}
