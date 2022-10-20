package com.ibm.portalserver.mapper;

import com.ibm.portalserver.domain.LinkEntity;
import com.ibm.portalserver.domain.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
    List<Map<String,String>> getList1();

    List<UserEntity> getlist();
    /*@Select("Select a.dept_id, a.parent_id, a.ancestors, a.dept_name, a.order_num, a.leader,\n" +
            "        a.phone, a.email, a.status, a.del_flag, a.create_by, a.create_time, a.update_by, a.update_time,b.user_id,  b.dept_id,  b.user_name,  b.nick_name,  b.user_type,  b.email,\n" +
            "        b.phonenumber, b.sex, b.avatar, b.password, b.status, b.del_flag,\n" +
            "        b.create_by,  b.create_time,  b.update_by,  b.update_time, b.remark from KCD86049.SYS_DEPT as a , KCD86049.SYS_USER  as b where a.DEPT_ID = b.DEPT_ID")
    List<Map<String,String>> getUsersWithDept();*/
    List<UserEntity> getOneUserList(Long userId);
    Integer addUser(UserEntity userEntity);
    Integer updateUser(UserEntity userEntity);
    Integer deleteUser(Long userId);

    List<UserEntity> getUserByDeptId(Long deptid);

}
