package com.ibm.portalserver.mapper;

import com.ibm.portalserver.domain.DeptEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface DeptMapper {
    List<DeptEntity> getList();

    Integer addDept(DeptEntity deptEntity);

    Integer updateDept(DeptEntity deptEntity);

    Integer deleteDept(Long deptId);

    List<DeptEntity> getOneDeptList(Long deptId);

    List<Map<String,String>> selectByFieldName2(String name);

    List<DeptEntity> getTwo(Long deptId, String deptName);

}
