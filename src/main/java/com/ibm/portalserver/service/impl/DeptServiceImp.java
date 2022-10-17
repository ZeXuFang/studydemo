package com.ibm.portalserver.service.impl;

import com.ibm.portalserver.domain.DeptEntity;
import com.ibm.portalserver.mapper.DeptMapper;
import com.ibm.portalserver.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class DeptServiceImp implements IDeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<DeptEntity> getList() {
        return deptMapper.getList();
    }

    @Override
    public  List<Map<String,String>> selectByFieldName2(String fieldName)  {
        List<Map<String,String>> mapList = new ArrayList<>();
        List<Map<String,String>> deptEntities = deptMapper.selectByFieldName2(fieldName);
        for (Map<String,String> map : deptEntities){
            if(map!=null){
                mapList.add(map);
            }
        }
        return mapList;
    }

    public static String lineToHump(String str) {
        str = str.toLowerCase();
        Pattern linePattern = Pattern.compile("_(\\w)");
        Matcher matcher = linePattern.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }


    @Override
    public Integer addDept(DeptEntity deptEntity) {
        List<DeptEntity> jsonObj = deptMapper.getList();//把当前deptEntity中的东西都取到(是json对象的形式[{},{},{}])
        Long deptID[] = new Long[jsonObj.size()];  //新建一个数组，存deptEntity中的deptID
        for(int i = 0; i < jsonObj.size(); i++){
            deptID[i] = jsonObj.get(i).getDeptId();//循环遍历deptEntity这是json对象，取到ID
        }
        //把数组转化成list集合
        if(Arrays.asList(deptID).contains(deptEntity.getDeptId())){
            System.out.println("this deptID repeat so it cannot add to db");
            return 0;
        }else{
            return deptMapper.addDept(deptEntity);
        }
    }

    @Override
    public Integer updateDept(DeptEntity deptEntity) {
        return deptMapper.updateDept(deptEntity);
    }

    @Override
    public Integer deleteDept(Long deptId) {
        return deptMapper.deleteDept(deptId);
    }

    @Override
    public List<DeptEntity> getOneDeptList(Long deptId) {
        return deptMapper.getOneDeptList(deptId);
    }


}
