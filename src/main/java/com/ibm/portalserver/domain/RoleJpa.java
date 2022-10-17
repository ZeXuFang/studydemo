package com.ibm.portalserver.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="kcd86049.SYS_ROLE")
public class RoleJpa {

    @Id
    @Column(name = "ROLE_ID")
    private String roleId;
    @Column(name = "ROLE_NAME")
    private String roleName;
    @Column(name = "ROLE_KEY")
    private String roleKey;
    @Column(name = "ROLE_SORT")
    private Integer roleSort;
    @Column(name = "DATA_SCOPE")
    private Integer dataScope;
    @Column(name = "STATUS")
    private Character status;
    @Column(name = "DEL_FLAG")
    private Character delFlag;
    @Column(name = "CREATE_BY")
    private String createBy;
    @Column(name = "CREATE_TIME")
    private Date createTime;
    @Column(name = "UPDATE_BY")
    private String updateBy;
    @Column(name = "UPDATE_TIME")
    private Date updateTime;
    @Column(name = "REMARK")
    private String remark;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleKey() {
        return roleKey;
    }

    public void setRoleKey(String roleKey) {
        this.roleKey = roleKey;
    }

    public Integer getRoleSort() {
        return roleSort;
    }

    public void setRoleSort(Integer roleSort) {
        this.roleSort = roleSort;
    }

    public Integer getDataScope() {
        return dataScope;
    }

    public void setDataScope(Integer dataScope) {
        this.dataScope = dataScope;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Character getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Character delFlag) {
        this.delFlag = delFlag;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public RoleJpa(){}

    @Override
    public String toString() {
        return "RoleJpa{" +
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

    public RoleJpa(String roleId, String roleName, String roleKey, Integer roleSort, Integer dataScope, Character status, Character delFlag, String createBy, Date createTime, String updateBy, Date updateTime, String remark) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleKey = roleKey;
        this.roleSort = roleSort;
        this.dataScope = dataScope;
        this.status = status;
        this.delFlag = delFlag;
        this.createBy = createBy;
        this.createTime = createTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
        this.remark = remark;
    }

}

