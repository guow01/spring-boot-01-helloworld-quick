package com.highp.springboot.model;

import java.io.Serializable;

public class Account implements Serializable {

    private static final long serialVersionUID = 2271546773431965955L;
    private Long id;

    /**
     * 登录用户名
     */
    private String username;

    /**
     * 登录密码, 接入统一登录平台后,此字段无效
     */
    private String password;

    /**
     * 状态, 代表有效还是无效 ActivationEnum
     */
    private String status;


    /**
     * 账户角色
     */
    private String role;


    /* 员工信息 */

    /**
     * 当用户角色是招商人员时, 此EMP_ID 代表招商人员编号, 除此之外, 此字段无效
     */
    private String empId;

    /**
     * 用户名称
     */
    private String empName;

    /**
     * 乡镇部门编号, 代表他是哪个乡镇的
     * <p>
     * 如果角色是市领导,或者是投资产业中心领导的话,此字段无效
     */
    private Long departmentId;

    /* 移动端登录信息 */

    private String token;

    private String device;

    private String deviceCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }
}
