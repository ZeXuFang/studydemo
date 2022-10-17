package com.ibm.portalserver.service.impl;

import com.ibm.portalserver.domain.DeptJpa;
import com.ibm.portalserver.domain.UserJpa;
import com.ibm.portalserver.repository.DeptJpaRepository;
import com.ibm.portalserver.repository.RoleJpaRepository;
import com.ibm.portalserver.repository.UserJpaReposiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DeptByNameService {
    @Autowired
    DeptJpaRepository deptJpaRepository;
    public void setDeptJpaRepository(DeptJpaRepository deptJpaRepository) {
        this.deptJpaRepository = deptJpaRepository;
    }

    public List<DeptJpa> getOne(String name) {
        List<DeptJpa> deptJpaList = deptJpaRepository.findBydeptName(name);
        return deptJpaList;
    }

    public List<DeptJpa> deleteDept(String name) {
        DeptJpa deptJpa1;
        List<DeptJpa> deptJpaList = deptJpaRepository.findBydeptName(name);
        deptJpa1 = deptJpaList.get(0);
        deptJpaRepository.deleteById(deptJpa1.getDeptId());
        String res[] = deptJpaList.toString().substring(9).split(",");
        HashMap<String, String>map = new HashMap<>();
        String arr[] = new String[2* res.length];
        for(int i=0;i< res.length;i++){
            String[] split = res[i].split("=");
            arr[2*i] = split[0];
            arr[2*i+1] = split[1];

        }
        for(int j=1;j< arr.length;j++){
            System.out.println(arr[j]);
            map.put("key"+arr[j-1],"value"+arr[j]);
        }

        System.out.println(map);
        Map<String, String> stringStringMap = deptJpa1.toMap();
        System.out.println(stringStringMap);
        return deptJpaRepository.findAll();
    }
    public List<DeptJpa> updateDept(DeptJpa deptJpa) {
        String name = "";
        name = deptJpa.getDeptName();
        List<DeptJpa> deptJpaList = deptJpaRepository.findBydeptName(name);
        DeptJpa deptJpa1;
        deptJpa1 = deptJpaList.get(0);
        Optional<DeptJpa> _deptJpa = deptJpaRepository.findById(deptJpa1.getDeptId());
        _deptJpa.get().setAncestors(deptJpa.getAncestors());
        _deptJpa.get().setCreateTime(deptJpa.getCreateTime());
        _deptJpa.get().setCreateBy(deptJpa.getCreateBy());
        _deptJpa.get().setDeptName(deptJpa.getDeptName());
        _deptJpa.get().setDelFlag(deptJpa.getDelFlag());
        _deptJpa.get().setStatus(deptJpa.getStatus());
        _deptJpa.get().setEmail(deptJpa.getEmail());
        _deptJpa.get().setLeader(deptJpa.getLeader());
        _deptJpa.get().setOrderNum(deptJpa.getOrderNum());
        _deptJpa.get().setParentId(deptJpa.getParentId());
        _deptJpa.get().setUpdateBy(deptJpa.getUpdateBy());
        _deptJpa.get().setUpdateBy(deptJpa.getUpdateBy());
        deptJpaRepository.save(_deptJpa.get());
        return deptJpaRepository.findAll();
    }
}
