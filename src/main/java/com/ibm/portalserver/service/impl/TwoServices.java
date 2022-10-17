package com.ibm.portalserver.service.impl;

import com.ibm.portalserver.domain.DeptEntity;

import java.util.List;

public interface TwoServices {
    List<DeptEntity> getList();
    Integer addDept(DeptEntity deptEntity);
    Integer updateDept(DeptEntity deptEntity);
    Integer deleteDept(Long deptId);
    List<DeptEntity> getOneDeptList(Long deptId);

    List<DeptEntity> getTwo(Long deptId,String deptName);
}
