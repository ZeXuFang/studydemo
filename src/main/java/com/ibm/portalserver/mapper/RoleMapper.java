package com.ibm.portalserver.mapper;

import com.ibm.portalserver.domain.RoleEntity;
import org.apache.ibatis.annotations.Mapper;

import javax.management.relation.Role;
import java.util.List;

@Mapper
public interface RoleMapper {
    List<RoleEntity> getList();
    Integer addRole(RoleEntity roleEntity);
    Integer updateRole(RoleEntity roleEntity);
    Integer deleteRole(Long roleId);
    List<RoleEntity> getOneRoleList(Long roleId);
}
