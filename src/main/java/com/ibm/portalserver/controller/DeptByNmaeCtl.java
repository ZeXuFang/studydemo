package com.ibm.portalserver.controller;

import com.ibm.portalserver.domain.DeptJpa;
import com.ibm.portalserver.domain.UserJpa;
import com.ibm.portalserver.service.impl.DeptByNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dept3")
public class DeptByNmaeCtl {
    @Autowired
    DeptByNameService deptByNameService;

    @CrossOrigin
    @RequestMapping("/getOne")
    public List<DeptJpa> getOne(String name){
        System.out.println(name);
        return deptByNameService.getOne(name);
    }

    @CrossOrigin
    @DeleteMapping("/deleteOne")
    public List<DeptJpa> deleteOne(String name) {
        //System.out.println(name);
        return deptByNameService.deleteDept(name);
    }

    @CrossOrigin
    @PutMapping("/updateDept")
    public List<DeptJpa> updateUser1(@RequestBody DeptJpa deptJpa) {
        return deptByNameService.updateDept(deptJpa);
    }
}
