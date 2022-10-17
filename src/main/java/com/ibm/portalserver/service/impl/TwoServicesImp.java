package com.ibm.portalserver.service.impl;

import com.ibm.portalserver.domain.DeptEntity;
import com.ibm.portalserver.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TwoServicesImp implements TwoServices {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<DeptEntity> getList() {
        return null;
    }

    @Override
    public Integer addDept(DeptEntity deptEntity) {
        return null;
    }

    @Override
    public Integer updateDept(DeptEntity deptEntity) {
        return null;
    }

    @Override
    public Integer deleteDept(Long deptId) {
        return null;
    }

    @Override
    public List<DeptEntity> getOneDeptList(Long deptId) {
        return null;
    }

    @Override
    public List<DeptEntity>getTwo(Long deptId , String deptName){return deptMapper.getTwo(deptId,deptName);}
}
