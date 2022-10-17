package com.ibm.portalserver.controller;

import com.ibm.portalserver.domain.DeptJpa;
import com.ibm.portalserver.domain.RoleJpa;
import com.ibm.portalserver.service.impl.DeptJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/dept2")
public class DeptJpaCtl {
    @Autowired
    DeptJpaService deptJpaService;
    @CrossOrigin
    @GetMapping("/list")
    public List<DeptJpa> getall() {
        return deptJpaService.getall();
    }


    @CrossOrigin
    @PostMapping("/addDept")
    public List<DeptJpa> adddept(@RequestBody DeptJpa deptJpa) {
        return deptJpaService.savedept(deptJpa);
        //return roleService.doRole(roleEntity);
    }

    @CrossOrigin
    @PutMapping("/updateDept")
    public List<DeptJpa> updatedept(@RequestBody DeptJpa deptJpa) {
        return deptJpaService.updateDept(deptJpa);
        //return roleService.doRole(roleEntity);
    }

    @CrossOrigin
    @DeleteMapping("/deleteDept")
    public List<DeptJpa> deleteRole(@RequestParam("deptId") String deptId) {
        return deptJpaService.delectdept(deptId);

    }

}
