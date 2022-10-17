package com.ibm.portalserver.service.impl;

import com.ibm.portalserver.domain.DeptJpa;
import com.ibm.portalserver.domain.RoleJpa;
import com.ibm.portalserver.repository.DeptJpaRepository;
import com.ibm.portalserver.repository.RoleJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeptJpaService {
    @Autowired
    DeptJpaRepository deptJpaRepository;
    public void setDeptJpaRepository(DeptJpaRepository deptJpaRepository) {
        this.deptJpaRepository = deptJpaRepository;
    }


    public List<DeptJpa> getall() {
        return deptJpaRepository.findAll();
    }

    public List<DeptJpa> delectdept(String id) {
        deptJpaRepository.deleteById(id);
        return deptJpaRepository.findAll();
    }

    public List<DeptJpa> savedept(DeptJpa deptJpa) {
        deptJpaRepository.save(deptJpa);
        return deptJpaRepository.findAll();
    }

    public List<DeptJpa> updateDept(DeptJpa deptJpa) {
        Optional<DeptJpa> _deptJpa = deptJpaRepository.findById(deptJpa.getDeptId());
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
