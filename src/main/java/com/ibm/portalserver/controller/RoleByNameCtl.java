package com.ibm.portalserver.controller;

import com.ibm.portalserver.domain.RoleJpa;
import com.ibm.portalserver.domain.UserJpa;
import com.ibm.portalserver.service.impl.RoleByNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/role3")
public class RoleByNameCtl {
    @Autowired
    RoleByNameService roleByNameService;

    @CrossOrigin
    @RequestMapping("/getOne")
    public List<RoleJpa> getOne(String name){
        System.out.println(name);
        return roleByNameService.getOne(name);
    }


    @DeleteMapping("/deleteOne")
    public List<RoleJpa> deleteOne(String name)  {
        System.out.println(name);
        return roleByNameService.deleteRole(name);
    }
    @CrossOrigin
    @PutMapping("/updateRole")
    public  List<RoleJpa> updateUser1(@RequestBody RoleJpa roleJpa) {
        return roleByNameService.updateRole(roleJpa);
    }
}

