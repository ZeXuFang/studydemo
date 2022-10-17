package com.ibm.portalserver.controller;

import com.ibm.portalserver.domain.DeptJpa;
import com.ibm.portalserver.domain.UserEntity;
import com.ibm.portalserver.domain.UserJpa;
import com.ibm.portalserver.repository.UserJpaReposiory;
import com.ibm.portalserver.service.impl.UserJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user2")
public class UserJpaCtl {
    @Autowired
    UserJpaService userJpaService;
    @CrossOrigin
    @GetMapping("/list")
    public List<UserJpa> getList() {
        return userJpaService.getAll();
    }




    @CrossOrigin
    @RequestMapping("/addUser")
    public List<UserJpa> addUser(@RequestBody UserJpa userJpa) {
        return userJpaService.saveUser(userJpa);
    }

    @CrossOrigin
    @PutMapping("/updateUser")
    public  List<UserJpa> updateUser(@RequestBody UserJpa userJpa) {
        return userJpaService.updateUser(userJpa);
    }

    @CrossOrigin
    @DeleteMapping("/deleteUser")
    public  List<UserJpa> deleteUser(@RequestParam("userId") String userId) {
        return userJpaService.deleteUser(userId);
    }

}
