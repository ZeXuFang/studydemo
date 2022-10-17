package com.ibm.portalserver.controller;

import com.ibm.portalserver.domain.RoleEntity;
import com.ibm.portalserver.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/role") //annotated by lixuru
public class RoleCtl {
    @Autowired
    IRoleService roleService;
//    @GetMapping   annotated by lixuru
//    public ResponseEntity<List<TestEntity>> doTest(TestEntity testEntity){
//       return ResponseEntity.ok(testService.doTest(testEntity));
//       annotated by lixuru
//    }
    //wrote by lixuru - show all list role
    @GetMapping("/list")
    public List<RoleEntity> doRole(){
        return roleService.doRole();
    }

    @CrossOrigin
    @PostMapping("/addRole")
    public Integer addRole(@RequestBody RoleEntity roleEntity){
       return roleService.addRole(roleEntity);
       //return roleService.doRole(roleEntity);
    }

    @CrossOrigin
    @PutMapping("/updateRole")
    public Integer updateRole(@RequestBody RoleEntity roleEntity){
        return roleService.updateRole(roleEntity);
        //return roleService.doRole(roleEntity);
    }
    @CrossOrigin
    @DeleteMapping(path = "/deleteRole")
    public Integer deleteRole(@RequestParam("roleId") Long roleId){
        return roleService.deleteRole(roleId);
        //return roleService.doRole(roleEntity);
    }

    @CrossOrigin
    @GetMapping("/getOneRoleList")
    public List<RoleEntity> getOneRoleList(@RequestParam("roleId") Long roleId){
        return roleService.getOneRoleList(roleId);
        //return roleService.doRole(roleEntity);
    }
}
