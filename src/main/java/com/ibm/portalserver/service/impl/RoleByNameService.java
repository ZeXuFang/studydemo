package com.ibm.portalserver.service.impl;

import com.ibm.portalserver.domain.DeptJpa;
import com.ibm.portalserver.domain.RoleJpa;
import com.ibm.portalserver.repository.RoleJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleByNameService {
    @Autowired
    RoleJpaRepository roleJpaRepository;

    public void setRoleJpaRepository(RoleJpaRepository roleJpaRepository) {
        this.roleJpaRepository = roleJpaRepository;
    }
    public List<RoleJpa> getOne(String name) {
        List<RoleJpa> roleJpaList = roleJpaRepository.findByroleName(name);
        return roleJpaList;
    }

    public List<RoleJpa> deleteRole(String name) {
        RoleJpa roleJpa ;
        RoleJpa roleJpa1;
        List<RoleJpa> roleJpaList = roleJpaRepository.findByroleName(name);
        int i = roleJpaList.size();
        System.out.println(i);
        int m = 1;
        roleJpa1 = roleJpaList.get(0);
        for (int k =0;k<i;k++) {
            roleJpa1 = roleJpaList.get(k);
            System.out.println(m);
            m++;
            System.out.println(roleJpa1.toString());
            System.out.println(k);
        }

        //System.out.println(deptJpa1.toString());
        roleJpaRepository.deleteById(roleJpa1.getRoleId());
        return roleJpaRepository.findAll();
    }
    public List<RoleJpa> updateRole(RoleJpa roleJpa) {
        String name = "";
        name = roleJpa.getRoleName();
        List<RoleJpa> roleJpaList = roleJpaRepository.findByroleName(name);
        RoleJpa roleJpa1;
        roleJpa1 = roleJpaList.get(0);
        Optional<RoleJpa> _roleJpa = roleJpaRepository.findById(roleJpa1.getRoleId());
        _roleJpa.get().setRoleName(roleJpa.getRoleName());
        _roleJpa.get().setUpdateTime(roleJpa.getUpdateTime());
        _roleJpa.get().setRoleKey(roleJpa.getRoleKey());
        _roleJpa.get().setRoleSort(roleJpa.getRoleSort());
        _roleJpa.get().setStatus(roleJpa.getStatus());
        _roleJpa.get().setDelFlag(roleJpa.getDelFlag());
        _roleJpa.get().setUpdateBy(roleJpa.getUpdateBy());
        _roleJpa.get().setRemark(roleJpa.getRemark());
        _roleJpa.get().setDataScope(roleJpa.getDataScope());
        _roleJpa.get().setCreateTime(roleJpa.getCreateTime());
        _roleJpa.get().setCreateBy(roleJpa.getCreateBy());

        roleJpaRepository.save(_roleJpa.get());
        return roleJpaRepository.findAll();
    }
}
