package com.ibm.portalserver.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name="kcd86049.SYS_USER")
public class UserJpa {
    @Id
    @Column(name = "USER_ID")
    private String userId;
    @Column(name = "DEPT_ID")
    private Long deptId;
    @Column(name = "USER_NAME")
    private String userName;
    @Column(name = "NICK_NAME")
    private String nickName;
    @Column(name = "USER_TYPE")
    private String userType;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PHONENUMBER")
    private String phonenumber;
    @Column(name = "SEX")
    private Character sex;
    @Column(name = "AVATAR")
    private String avatar;
    @Column(name = "PASSWORD")
    private String password;
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

    public UserJpa() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public UserJpa(String userId, Long deptId, String userName, String nickName, String userType, String email, String phonenumber, Character sex, String avatar, String password, Character status, Character delFlag, String createBy, Date createTime, String updateBy, Date updateTime, String remark) {
        this.userId = userId;
        this.deptId = deptId;
        this.userName = userName;
        this.nickName = nickName;
        this.userType = userType;
        this.email = email;
        this.phonenumber = phonenumber;
        this.sex = sex;
        this.avatar = avatar;
        this.password = password;
        this.status = status;
        this.delFlag = delFlag;
        this.createBy = createBy;
        this.createTime = createTime;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "UserJpa{" +
                "userId='" + userId + '\'' +
                ", deptId=" + deptId +
                ", userName='" + userName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", userType='" + userType + '\'' +
                ", email='" + email + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", sex=" + sex +
                ", avatar='" + avatar + '\'' +
                ", password='" + password + '\'' +
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
