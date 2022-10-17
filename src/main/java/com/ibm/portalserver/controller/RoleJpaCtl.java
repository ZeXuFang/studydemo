package com.ibm.portalserver.controller;

import com.ibm.portalserver.domain.RoleEntity;
import com.ibm.portalserver.domain.RoleJpa;
import com.ibm.portalserver.repository.RoleJpaRepository;
import com.ibm.portalserver.service.impl.RoleJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/role2")
public class RoleJpaCtl {
    @Autowired
    RoleJpaService roleJpaService;

    @GetMapping("/list")
    public List<RoleJpa> getall() {
        return roleJpaService.getall();
    }

    @CrossOrigin
    @PostMapping("/addRole")
    public List<RoleJpa> addRole(@RequestBody RoleJpa roleJpa) {
        return roleJpaService.saverole(roleJpa);
        //return roleService.doRole(roleEntity);
    }

    @CrossOrigin
    @PutMapping("/updateRole")
    public List<RoleJpa> updateRole(@RequestBody RoleJpa roleJpa) {
        return roleJpaService.updaterole(roleJpa);
        //return roleService.doRole(roleEntity);
    }

    @CrossOrigin
    @DeleteMapping("/deleteRole")
    public List<RoleJpa> deletedept(@RequestParam("roleId") String roleId) {
        return roleJpaService.delectrole(roleId);

    }

}
