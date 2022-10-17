package com.ibm.portalserver.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name="kcd86049.SYS_DEPT")
public class DeptJpa {

    @Id
    @Column(name="DEPT_ID")
    private String deptId;
    @Column(name="PARENT_ID")
    private Long parentId;
    @Column(name="ANCESTORS")
    private String ancestors;
    @Column(name="DEPT_NAME")
    private String deptName;
    @Column(name="ORDER_NUM")
    private Integer orderNum;
    @Column(name="LEADER")
    private String leader;
    @Column(name="PHONE")
    private String phone;
    @Column(name="EMAIL")
    private String email;
    @Column(name="STATUS")
    private Character status;
    @Column(name="DEL_FLAG")
    private Character delFlag;

    @Column(name="CREATE_BY")
    private String createBy;
    @Column(name="CREATE_TIME")
    private Date createTime;
    @Column(name="UPDATE_BY")
    private String updateBy;
    @Column(name="UPDATE_TIME")
    private Date updateTime;

    public DeptJpa() {
    }

    public DeptJpa(String deptId, Long parentId, String ancestors, String deptName, Integer orderNum, String leader, String phone, String email, Character status, Character delFlag, String createBy, Date createTime, String updateBy, Date updateTime) {
        this.deptId = deptId;
        this.parentId = parentId;
        this.ancestors = ancestors;
        this.deptName = deptName;
        this.orderNum = orderNum;
        this.leader = leader;
        this.phone = phone;
        this.email = email;
        this.status = status;
        this.delFlag = delFlag;
        this.createBy = createBy;
        this.createTime = createTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "DeptJpa{" +
                "deptId=" + deptId +
                ", parentId=" + parentId +
                ", ancestors='" + ancestors + '\'' +
                ", deptName='" + deptName + '\'' +
                ", orderNum=" + orderNum +
                ", leader='" + leader + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", delFlag=" + delFlag +
                ", createBy='" + createBy + '\'' +
                ", createTime=" + createTime +
                ", updateBy='" + updateBy + '\'' +
                ", updateTime=" + updateTime +
                '}';
    }

    public String getDeptId() {
        return deptId;
    }

    public Map<String,String> toMap(){
        Map<String,String> map = new HashMap<>();
        map.put("key= "+"deptId","value= "+deptId);
        map.put("key= "+"deptName","value= "+deptName);
        map.put("key= "+"delFlag", "value= "+String.valueOf(delFlag));
        map.put("key= "+"parentId", "value= "+String.valueOf(parentId));
        map.put("key= "+"ancestors","value= "+ancestors);
        map.put("key= "+"orderNum", "value= "+String.valueOf(orderNum));
        map.put("key= "+"leader","value= "+leader);
        map.put("key= "+"phone","value= "+phone);
        map.put("key= "+"email","value= "+email);
        map.put("key= "+"status", "value= "+String.valueOf(status));
        map.put("key= "+"createBy","value= "+createBy);
        map.put("key= "+"createTime", "value= "+String.valueOf(createTime));
        map.put("key= "+"updateBy","value= "+updateBy);
        map.put("key= "+"updateTime","value= "+String.valueOf(updateTime));
       return map;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getAncestors() {
        return ancestors;
    }

    public void setAncestors(String ancestors) {
        this.ancestors = ancestors;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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


}
