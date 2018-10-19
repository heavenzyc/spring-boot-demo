package com.heaven.springbootdemo.entity;

import java.util.Date;

public class User {
    private Long id;

    private String userName;

    private String badgeNo;

    private Long depId;

    private Long jobsId;

    private Long orgId;

    private Integer userType;

    private Integer userStatus;

    private String mobile;

    private String email;

    private String userAddr;

    private String gender;

    private String idCard;

    private String direction;

    private Integer yn;

    private Date created;

    private Long lastUpdUser;

    private Date lastUpdTime;

    private String directorPhoneNo;

    private Integer venderType;

    private Integer userOrigin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getBadgeNo() {
        return badgeNo;
    }

    public void setBadgeNo(String badgeNo) {
        this.badgeNo = badgeNo == null ? null : badgeNo.trim();
    }

    public Long getDepId() {
        return depId;
    }

    public void setDepId(Long depId) {
        this.depId = depId;
    }

    public Long getJobsId() {
        return jobsId;
    }

    public void setJobsId(Long jobsId) {
        this.jobsId = jobsId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr == null ? null : userAddr.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction == null ? null : direction.trim();
    }

    public Integer getYn() {
        return yn;
    }

    public void setYn(Integer yn) {
        this.yn = yn;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Long getLastUpdUser() {
        return lastUpdUser;
    }

    public void setLastUpdUser(Long lastUpdUser) {
        this.lastUpdUser = lastUpdUser;
    }

    public Date getLastUpdTime() {
        return lastUpdTime;
    }

    public void setLastUpdTime(Date lastUpdTime) {
        this.lastUpdTime = lastUpdTime;
    }

    public String getDirectorPhoneNo() {
        return directorPhoneNo;
    }

    public void setDirectorPhoneNo(String directorPhoneNo) {
        this.directorPhoneNo = directorPhoneNo == null ? null : directorPhoneNo.trim();
    }

    public Integer getVenderType() {
        return venderType;
    }

    public void setVenderType(Integer venderType) {
        this.venderType = venderType;
    }

    public Integer getUserOrigin() {
        return userOrigin;
    }

    public void setUserOrigin(Integer userOrigin) {
        this.userOrigin = userOrigin;
    }
}