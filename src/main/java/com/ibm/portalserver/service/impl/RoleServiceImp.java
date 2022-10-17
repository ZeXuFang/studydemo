package com.ibm.portalserver.service.impl;

import com.ibm.portalserver.domain.RoleEntity;
import com.ibm.portalserver.mapper.RoleMapper;
import com.ibm.portalserver.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class RoleServiceImp implements IRoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<RoleEntity> doRole() {
        return roleMapper.getList();
    }

    @Override
    public Integer addRole(RoleEntity roleEntity2) {
        List<RoleEntity> jsonObj = roleMapper.getList();//json对象[{},{},{}]
        Long roleID[] = new Long[jsonObj.size()];
        for (int i = 0; i < jsonObj.size(); i++) {
            roleID[i] = jsonObj.get(i).getRoleId();
        }
        if(Arrays.asList(roleID).contains(roleEntity2.getRoleId())){
            System.out.println("this roleID repeat so it cannot add to db.");
            return 0;
        }else{
            return roleMapper.addRole(roleEntity2);
        }
    }


    @Override
    public Integer updateRole(RoleEntity roleEntity) {
        return roleMapper.updateRole(roleEntity);
    }

    @Override
    public Integer deleteRole(Long roleId) {
        return roleMapper.deleteRole(roleId);
    }

    @Override
    public List<RoleEntity> getOneRoleList(Long roleId) {
        return roleMapper.getOneRoleList(roleId);
    }
}
