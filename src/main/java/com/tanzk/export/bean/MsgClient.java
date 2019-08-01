/**
 * Copyright (C), 2012-2019, www.shopin.net
 * FileName: MsgClient
 * Author:   pengweiqiang
 * Date:     2019/7/31 17:31
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tanzk.export.bean;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.util.Date;

/**
 * TODO 添加类的描述 
 *
 * @author pengweiqiang
 * @version V1.0 2019/7/31
 */
public class MsgClient {

    @Excel(name = "生日")
    private Date birthday;
    @Excel(name = "名称")
    private String clientName;
    @Excel(name = "手机号")
    private String clientPhone;
    @Excel(name = "创建人")
    private String createBy;
    @Excel(name = "Id")
    private String id;
    @Excel(name = "备注")
    private String remark;

    @Excel(name = "姓名", orderNum = "0")
    private String name;
    @Excel(name = "证件类型", replace = {"身份证_1"}, orderNum = "1")
    private String identifyType;
    @Excel(name = "证件号码", orderNum = "2")
    private String identifyNo;
    @Excel(name = "手机号1", orderNum = "3")
    private String phoneA;
    @Excel(name = "手机号2", orderNum = "4")
    private String phoneB;
    @Excel(name = "手机号3", orderNum = "5")
    private String phoneC;
    @Excel(name = "固定电话", orderNum = "6")
    private String telephone;
    @Excel(name = "电子邮箱", orderNum = "7")
    private String email;
    @Excel(name = "身份证地址", orderNum = "8")
    private String idcardAdress;
    @Excel(name = "户籍地址", orderNum = "9")
    private String householdAddress;
    @Excel(name = "居住地址", orderNum = "10")
    private String liveAddress;
    @Excel(name = "工作地址", orderNum = "11")
    private String workAddress;

    @Excel(name = "分组")
    private MsgClientGroup group;


    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public MsgClientGroup getGroup() {
        return group;
    }

    public void setGroup(MsgClientGroup group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentifyType() {
        return identifyType;
    }

    public void setIdentifyType(String identifyType) {
        this.identifyType = identifyType;
    }

    public String getIdentifyNo() {
        return identifyNo;
    }

    public void setIdentifyNo(String identifyNo) {
        this.identifyNo = identifyNo;
    }

    public String getPhoneA() {
        return phoneA;
    }

    public void setPhoneA(String phoneA) {
        this.phoneA = phoneA;
    }

    public String getPhoneB() {
        return phoneB;
    }

    public void setPhoneB(String phoneB) {
        this.phoneB = phoneB;
    }

    public String getPhoneC() {
        return phoneC;
    }

    public void setPhoneC(String phoneC) {
        this.phoneC = phoneC;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdcardAdress() {
        return idcardAdress;
    }

    public void setIdcardAdress(String idcardAdress) {
        this.idcardAdress = idcardAdress;
    }

    public String getHouseholdAddress() {
        return householdAddress;
    }

    public void setHouseholdAddress(String householdAddress) {
        this.householdAddress = householdAddress;
    }

    public String getLiveAddress() {
        return liveAddress;
    }

    public void setLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }
}