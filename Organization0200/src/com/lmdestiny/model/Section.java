package com.lmdestiny.model;

import java.util.List;

/**
 * 科室信息表
 * @author wangbin
 *
 */
public class Section {

	private String	id;//科室ID
	private Organization organization;//机构
	private String 	orgNo;//机构编码
	private String 	divCode;//科室编码
	private String 	divNameCode;//科室名称编码
	private String	divName;//可是名称
	private String	ifSub;//是否为分所
	private String	dutyTel;//电话号码
	private String fax;//传真号码
	private String divRoomNo;//门号
	private String exeType;//行政类别
	private List<Stuff> stuffs;//人员表
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Organization getOrganization() {
		return organization;
	}
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
	public String getOrgNo() {
		return orgNo;
	}
	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}
	public String getDivCode() {
		return divCode;
	}
	public void setDivCode(String divCode) {
		this.divCode = divCode;
	}
	public String getDivNameCode() {
		return divNameCode;
	}
	public void setDivNameCode(String divNameCode) {
		this.divNameCode = divNameCode;
	}
	public String getDivName() {
		return divName;
	}
	public void setDivName(String divName) {
		this.divName = divName;
	}
	public String getIfSub() {
		return ifSub;
	}
	public void setIfSub(String ifSub) {
		this.ifSub = ifSub;
	}
	public String getDutyTel() {
		return dutyTel;
	}
	public void setDutyTel(String dutyTel) {
		this.dutyTel = dutyTel;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getDivRoomNo() {
		return divRoomNo;
	}
	public void setDivRoomNo(String divRoomNo) {
		this.divRoomNo = divRoomNo;
	}
	public String getExeType() {
		return exeType;
	}
	public void setExeType(String exeType) {
		this.exeType = exeType;
	}
	
}
