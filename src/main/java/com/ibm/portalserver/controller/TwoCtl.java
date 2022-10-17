package com.ibm.portalserver.controller;

import com.ibm.portalserver.domain.DeptEntity;
import com.ibm.portalserver.service.impl.TwoServicesImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dept3")
public class TwoCtl {
    @Autowired
    TwoServicesImp twoServices;
    @GetMapping("/list")
    public List<DeptEntity> getTwo(long deptId,String deptName){
        return twoServices.getTwo(deptId,deptName);

    }
}
