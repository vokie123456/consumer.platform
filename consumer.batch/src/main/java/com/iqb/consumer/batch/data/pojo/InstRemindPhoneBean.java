package com.iqb.consumer.batch.data.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Description:
 * 
 * @author haojinlong
 * @version 1.0
 * 
 * <pre>
 * Modification History: 
 * Date         			Author      	Version     Description 
------------------------------------------------------------------
 * 2018年4月25日下午3:22:53 	haojinlong   	1.0        	1.0 Version 
 * </pre>
 */
public class InstRemindPhoneBean {
    /** 订单号 **/
    private String orderId;
    /** 姓名 **/
    private String realName;
    /** 手机号码 **/
    private String regId;
    /** 商户号 **/
    private String merchantNo;
    /** 商户名称 **/
    private String merchantName;
    /** 当前期数 **/
    private int curItems;
    /** 总期数 **/
    private int orderItems;
    /** 最迟还款日 **/
    private String lastRepayDate;
    /** 本期应还 **/
    private BigDecimal curRepayAmt;
    /** 预计逾期金额 **/
    private BigDecimal perOverdueAmt;
    /** 逾期天数 **/
    private int overdueDays;
    /** 电催结果 **/
    private String mobileCollection;
    /** 电催处理意见 **/
    private String mobileDealOpinion;
    /** 通话结果 **/
    private String telRecord;
    /** 失败原因 **/
    private String failReason;
    /** 处理意见 **/
    private String dealOpinion;
    /** 账单日 **/
    private String billDate;
    /** 处理状态 1,未处理，2处理中，3，处理完毕 **/
    private String status;
    /** 1,电话提醒 2，电催管理 **/
    private int flag;
    /** 指定用户 **/
    private String assignedName;
    /** 违约金 **/
    private BigDecimal overdueAmt;
    private int version; // 版本
    private Date createTime = new Date();
    private Date updateTime = new Date();
    private int billInfoStatus;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public int getCurItems() {
        return curItems;
    }

    public void setCurItems(int curItems) {
        this.curItems = curItems;
    }

    public int getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(int orderItems) {
        this.orderItems = orderItems;
    }

    public String getLastRepayDate() {
        return lastRepayDate;
    }

    public void setLastRepayDate(String lastRepayDate) {
        this.lastRepayDate = lastRepayDate;
    }

    public BigDecimal getCurRepayAmt() {
        return curRepayAmt;
    }

    public void setCurRepayAmt(BigDecimal curRepayAmt) {
        this.curRepayAmt = curRepayAmt;
    }

    public BigDecimal getPerOverdueAmt() {
        return perOverdueAmt;
    }

    public void setPerOverdueAmt(BigDecimal perOverdueAmt) {
        this.perOverdueAmt = perOverdueAmt;
    }

    public int getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(int overdueDays) {
        this.overdueDays = overdueDays;
    }

    public String getMobileCollection() {
        return mobileCollection;
    }

    public void setMobileCollection(String mobileCollection) {
        this.mobileCollection = mobileCollection;
    }

    public String getMobileDealOpinion() {
        return mobileDealOpinion;
    }

    public void setMobileDealOpinion(String mobileDealOpinion) {
        this.mobileDealOpinion = mobileDealOpinion;
    }

    public String getTelRecord() {
        return telRecord;
    }

    public void setTelRecord(String telRecord) {
        this.telRecord = telRecord;
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public String getDealOpinion() {
        return dealOpinion;
    }

    public void setDealOpinion(String dealOpinion) {
        this.dealOpinion = dealOpinion;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getAssignedName() {
        return assignedName;
    }

    public void setAssignedName(String assignedName) {
        this.assignedName = assignedName;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public BigDecimal getOverdueAmt() {
        return overdueAmt;
    }

    public void setOverdueAmt(BigDecimal overdueAmt) {
        this.overdueAmt = overdueAmt;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getBillInfoStatus() {
        return billInfoStatus;
    }

    public void setBillInfoStatus(int billInfoStatus) {
        this.billInfoStatus = billInfoStatus;
    }

}
