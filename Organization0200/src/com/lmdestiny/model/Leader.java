package com.lmdestiny.model;

import java.util.Date;

/**
 * 领导名录表
 * @author wangbin
 *
 */
public class Leader {
	private String id;
	private Organization organization;//组织机构
	private String orgName;//机构名称
	private String orgNo;//机构编码
	private String orgCode;//机构代码
	private String formFillingMan;//填表人
	private String linkTel;//填报人联系电话
	private String leaderName;//领导人姓名
	private String gender;//性别
	private String folk;//民族
	private Date birthDate;//出生年月
	private String pol;//政治面貌
	private String edu;//学历
	private String degree;//学位
	private String manageJob;//职务
	private String title;//职称
	private String memo;//备注
	private Date serDate;//任职日期
	private Date leaveDate;//离职日期
	private String yearly;//年份
	
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
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getOrgNo() {
		return orgNo;
	}
	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getFormFillingMan() {
		return formFillingMan;
	}
	public void setFormFillingMan(String formFillingMan) {
		this.formFillingMan = formFillingMan;
	}
	public String getLinkTel() {
		return linkTel;
	}
	public void setLinkTel(String linkTel) {
		this.linkTel = linkTel;
	}
	public String getLeaderName() {
		return leaderName;
	}
	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFolk() {
		return folk;
	}
	public void setFolk(String folk) {
		this.folk = folk;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getPol() {
		return pol;
	}
	public void setPol(String pol) {
		this.pol = pol;
	}
	public String getEdu() {
		return edu;
	}
	public void setEdu(String edu) {
		this.edu = edu;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getManageJob() {
		return manageJob;
	}
	public void setManageJob(String manageJob) {
		this.manageJob = manageJob;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Date getSerDate() {
		return serDate;
	}
	public void setSerDate(Date serDate) {
		this.serDate = serDate;
	}
	public Date getLeaveDate() {
		return leaveDate;
	}
	public void setLeaveDate(Date leaveDate) {
		this.leaveDate = leaveDate;
	}
	public String getYearly() {
		return yearly;
	}
	public void setYearly(String yearly) {
		this.yearly = yearly;
	}
	
}
