package com.ibm.portalserver.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ibm.portalserver.domain.UserJpa;
import com.ibm.portalserver.repository.UserJpaReposiory;
import com.ibm.portalserver.service.impl.UserByNaemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/user3")
public class UserByNameCtl {

    @Autowired
    UserByNaemServices userByNaemServices;

    @CrossOrigin
    @RequestMapping("/getOne")
    public List<UserJpa> getOne(String name){
        System.out.println(name);
        return userByNaemServices.getOne(name);
    }


    @DeleteMapping("/deleteOne")
    public List<UserJpa> deleteOne(String name)  {
        System.out.println(name);
        return userByNaemServices.deleteUser(name);
    }
    @CrossOrigin
    @PutMapping("/updateUser")
    public Map<String, Object> updateUser(@RequestBody UserJpa userJpa) {
        return userByNaemServices.updateUser(userJpa);
    }
    @CrossOrigin
    @PutMapping("/updateUser1")
    public  List<UserJpa> updateUser1(@RequestBody UserJpa userJpa) {
        return userByNaemServices.updateUser1(userJpa);
    }
}
