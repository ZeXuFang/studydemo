package com.ibm.portalserver.service;

import com.ibm.portalserver.domain.RoleEntity;

import java.util.List;

public interface IRoleService {
    public List<RoleEntity> doRole();
    public Integer addRole(RoleEntity roleEntity);
    public Integer updateRole(RoleEntity roleEntity);
    public Integer deleteRole(Long roleId);
    List<RoleEntity> getOneRoleList(Long roleId);
}
