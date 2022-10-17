package com.ibm.portalserver.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * for test only
 * //    role_id bigint NOT NULL ,
 * //--  role_name varchar(30) NOT NULL ,
 * //--  role_key varchar(100) NOT NULL ,
 * //--  role_sort int NOT NULL ,
 * //--  data_scope char(1) DEFAULT '1' ,
 * //--  status char(1) NOT NULL ,
 * //--  del_flag char(1) DEFAULT '0' ,
 * //--  create_by varchar(64) DEFAULT '' ,
 * //--  create_time datetime DEFAULT NULL ,
 * //--  update_by varchar(64) DEFAULT '' ,
 * //--  update_time datetime DEFAULT NULL ,
 * //--  remark varchar(500) DEFAULT NULL ,
 * //--  PRIMARY KEY (role_id)
 * //--)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor // 尽量不要单独使用 @AllArgsConstructor
public class RoleEntity {
    //    private String id; annotated by lixuru
//    private String name;  annotated by lixuru
//    private String address;  annotated by lixuru
    //wrote by lixuru
    private Long roleId;
    private String roleName;
    private String roleKey;
    private Integer roleSort;
    private Integer dataScope;
    private Character status;
    private Character delFlag;
    private String createBy;
    private Date createTime;
    private String updateBy;
    private Date updateTime;
    private String remark;

    public Long getRoleId() {
        return roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getRoleKey() {
        return roleKey;
    }

    public Integer getRoleSort() {
        return roleSort;
    }

    public Integer getDataScope() {
        return dataScope;
    }

    public Character getStatus() {
        return status;
    }

    public Character getDelFlag() {
        return delFlag;
    }

    public String getCreateBy() {
        return createBy;
    }


    public String getUpdateBy() {
        return updateBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public String getRemark() {
        return remark;
    }


    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void setRoleKey(String roleKey) {
        this.roleKey = roleKey;
    }

    public void setRoleSort(Integer roleSort) {
        this.roleSort = roleSort;
    }

    public void setDataScope(Integer dataScope) {
        this.dataScope = dataScope;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void setDelFlag(Character delFlag) {
        this.delFlag = delFlag;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "RoleEntity{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", roleKey='" + roleKey + '\'' +
                ", roleSort=" + roleSort +
                ", dataScope=" + dataScope +
                ", status=" + status +
                ", delFlag=" + delFlag +
                ", createBy='" + createBy + '\'' +
                ", createTime=" + createTime +
                ", updateBy='" + updateBy + '\'' +
                ", updateTime=" + updateTime +
                ", remark='" + remark + '\'' +
                '}';
    }
}
