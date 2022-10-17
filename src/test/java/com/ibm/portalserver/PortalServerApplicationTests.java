//package com.ibm.portalserver;
//
//import com.ibm.portalserver.domain.RoleEntity;
//import com.ibm.portalserver.mapper.RoleMapper;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.io.InputStream;
//import java.time.LocalDateTime;
//import java.util.Date;
//import java.util.List;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//class PortalServerApplicationTests {
//
//
//	@Test
//	public void testAdd() {
//		 String roleName="common";
//		 String roleKey="common";
//		 Integer roleSort=2;
//		 Integer dataScope=3;
//		 Integer status=1;
//		 Integer delFlag=0;
//		 String createBy="lixuruts@cn.ibm.com";
//		 Date createTime= new Date();
//		 String updateBy="lixuruts@cn.ibm.com";
//		 Date updateTime=new Date();
//		 String remark="this is the third remark";
//
//		RoleEntity roleEntity = new RoleEntity();
//		roleEntity.setRoleName(roleName);
//		roleEntity.setRoleKey(roleKey);
//		roleEntity.setRoleSort(roleSort);
//		roleEntity.setDataScope(dataScope);
//		roleEntity.setStatus(status);
//		roleEntity.setDelFlag(delFlag);
//		roleEntity.setCreateBy(createBy);
//		roleEntity.setCreateTime(createTime);
//		roleEntity.setUpdateBy(updateBy);
//		roleEntity.setUpdateTime(updateTime);
//		roleEntity.setRemark(remark);
//	}
//
//}
