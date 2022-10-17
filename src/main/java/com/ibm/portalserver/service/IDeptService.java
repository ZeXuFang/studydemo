package com.ibm.portalserver.service;

import com.ibm.portalserver.domain.DeptEntity;

import java.util.List;
import java.util.Map;

public interface IDeptService {
    public List<DeptEntity> getList();
    public Integer addDept(DeptEntity deptEntity);
    public Integer updateDept(DeptEntity deptEntity);
    public Integer deleteDept(Long deptId);
    List<DeptEntity> getOneDeptList(Long deptId);

    List<Map<String,String>> selectByFieldName2(String fieldName)throws Exception;
}
