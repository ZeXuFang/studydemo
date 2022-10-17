package com.ibm.portalserver.service.impl;

import com.ibm.portalserver.domain.RoleEntity;
import com.ibm.portalserver.domain.RoleJpa;
import com.ibm.portalserver.repository.RoleJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class RoleJpaService {
@Autowired
    private RoleJpaRepository roleJpaRepository;


    public void setRoleJpaRepository(RoleJpaRepository roleJpaRepository) {
        this.roleJpaRepository = roleJpaRepository;
    }


    public List<RoleJpa> getall() {
        return roleJpaRepository.findAll();
    }

    public List<RoleJpa> delectrole(String id) {
        roleJpaRepository.deleteById(id);
        return roleJpaRepository.findAll();
    }

    public List<RoleJpa> saverole(RoleJpa roleJpa) {
        roleJpaRepository.save(roleJpa);
        return roleJpaRepository.findAll();
    }

    public List<RoleJpa> updaterole(RoleJpa roleJpa) {
        Optional<RoleJpa> _roleJpa = roleJpaRepository.findById(roleJpa.getRoleId());
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
