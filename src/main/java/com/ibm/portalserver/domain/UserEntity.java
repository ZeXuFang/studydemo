package com.ibm.portalserver.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserEntity {
    @JsonProperty("USER_ID")
    private Long userId;
    @JsonProperty("DEPT_ID")
    private Long deptId;
    @JsonProperty("USER_NAME")
    private String userName;
    @JsonProperty("NICK_NAME")
    private String nickName;
    @JsonProperty("USER_TYPE")
    private String userType;
    @JsonProperty("EMAIL")
    private String email;
    @JsonProperty("PHONENUMBER")
    private String phonenumber;
    @JsonProperty("SEX")
    private Character sex;
    @JsonProperty("AVATAR")
    private String avatar;
    @JsonProperty("PASSWORD")
    private String password;
    @JsonProperty("STATUS")
    private Character status;
    @JsonProperty("DEL_FLAG")
    private Character delFlag;
    @JsonProperty("CREATE_BY")
    private String createBy;
    @JsonProperty("CREATE_TIME")
    private Date createTime;
    @JsonProperty("UPDATE_BY")
    private String updateBy;
    @JsonProperty("UPDATE_TIME")
    private Date updateTime;
    @JsonProperty("REMARK")
    private String remark;

    public Long getUserId() {
        return userId;
    }

    public Long getDeptId() {
        return deptId;
    }

    public String getUserName() {
        return userName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getUserType() {
        return userType;
    }

    public String getEmail() {
        return email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public Character getSex() {
        return sex;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getPassword() {
        return password;
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

    public Date getCreateTime() {
        return createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public void setDelFlag(Character delFlag) {
        this.delFlag = delFlag;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    @Override
    public String toString() {
        return "UserEntity{" +
                "userId=" + userId +
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
