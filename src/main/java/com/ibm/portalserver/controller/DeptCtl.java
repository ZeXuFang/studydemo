package com.ibm.portalserver.controller;

import com.ibm.portalserver.domain.DeptEntity;
import com.ibm.portalserver.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/dept")
public class DeptCtl {
    @Autowired
    IDeptService deptService;
    //wrote by lixuru - show all list dept
    @CrossOrigin
    @GetMapping("/list")
    public List<DeptEntity> getList(){
        return deptService.getList();
    }

    @CrossOrigin
    @PostMapping("/addDept")
    public Integer addDept(@RequestBody DeptEntity deptEntity){
       return deptService.addDept(deptEntity);
       //return roleService.doRole(roleEntity);
    }

    @CrossOrigin
    @PutMapping("/updateDept")
    public Integer updateDept(@RequestBody DeptEntity deptEntity){
        Integer result = deptService.updateDept(deptEntity);
        return result;
        //return roleService.doRole(roleEntity);
    }
    @CrossOrigin
    @DeleteMapping(path = "/deleteDept")
    public Integer deleteDept(@RequestParam("deptId") Long deptId){
        return deptService.deleteDept(deptId);
        //return roleService.doRole(roleEntity);
    }

    @CrossOrigin
    @GetMapping("/getOneDeptList")
    public List<DeptEntity> getOneDeptList(@RequestParam("deptId") Long deptId){
        return deptService.getOneDeptList(deptId);
        //return roleService.doRole(roleEntity);
    }

    @GetMapping("/FieldName2")
    public  List<Map<String,String>>  selectByFieldName2(@RequestParam("fieldName") String fieldName) throws Exception {
        return deptService.selectByFieldName2(fieldName);
    }

    @CrossOrigin
    @GetMapping("/getUserByDeptId")
    public List<DeptEntity> getUserByDeptId( Long deptId){
        return deptService.selectAllUserInDept(deptId);
    }
}
