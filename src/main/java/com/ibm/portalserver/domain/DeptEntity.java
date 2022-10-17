package com.ibm.portalserver.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 *     dept_id bigint NOT NULL  ,
 * --  parent_id bigint DEFAULT '0' ,
 * --  ancestors varchar(50) DEFAULT '' ,
 * --  dept_name varchar(30) DEFAULT '' ,
 * --  order_num int DEFAULT '0' ,
 * --  leader varchar(20) DEFAULT NULL ,
 * --  phone varchar(11) DEFAULT NULL ,
 * --  email varchar(50) DEFAULT NULL ,
 * --  status char(1) DEFAULT '0' ,
 * --  del_flag char(1) DEFAULT '0' ,
 * --  create_by varchar(64) DEFAULT '' ,
 * --  create_time datetime DEFAULT NULL ,
 * --  update_by varchar(64) DEFAULT '' ,
 * --  update_time datetime DEFAULT NULL ,
 * --  PRIMARY KEY (dept_id)
 * //--)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor // 尽量不要单独使用 @AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeptEntity {
    //wrote by lixuru
   @JsonProperty("DEPT_ID")
   private Long deptId;
    @JsonProperty("PARENT_ID")
    private Long parentId;
    @JsonProperty("ANCESTORS")
    private String ancestors;
    @JsonProperty("DEPT_NAME")
    private String deptName;
    @JsonProperty("ORDER_NUM")
    private Integer orderNum;
    @JsonProperty("LEADER")
    private String leader;
    @JsonProperty("PHONE")
    private String phone;
    @JsonProperty("EMAIL")
    private String email;
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

    public Long getDeptId() {
        return deptId;
    }

    public Long getParentId() {
        return parentId;
    }

    public String getAncestors() {
        return ancestors;
    }

    public String getDeptName() {
        return deptName;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public String getLeader() {return leader;}

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
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


    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public void setAncestors(String ancestors) {
        this.ancestors = ancestors;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
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

    @Override
    public String toString() {
        return "DeptEntity{" +
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
}
