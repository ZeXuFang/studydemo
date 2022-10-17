package com.ibm.portalserver.service.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.portalserver.domain.DeptEntity;
import com.ibm.portalserver.domain.LinkEntity;
import com.ibm.portalserver.domain.UserEntity;
import com.ibm.portalserver.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class LinkService {

    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<LinkEntity> linkUser() {
        List<LinkEntity> list = new ArrayList<>();
        List<Map<String, String>> usersWithDept = userMapper.getList1();
        ObjectMapper objectMapper = new ObjectMapper();
        for (Map<String, String> map : usersWithDept) {
            UserEntity userEntity = objectMapper.convertValue(map, UserEntity.class);
            DeptEntity deptEntity = objectMapper.convertValue(map, DeptEntity.class);
            LinkEntity linkEntity = new LinkEntity();
            linkEntity.setUserEntity(userEntity);
            linkEntity.setDeptEntity(deptEntity);
            list.add(linkEntity);
        }
        return list;


    }
}
