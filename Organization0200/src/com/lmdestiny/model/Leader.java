package com.lmdestiny.model;

import java.util.Date;

/**
 * �쵼��¼��
 * @author wangbin
 *
 */
public class Leader {
	private String id;
	private Organization organization;//��֯����
	private String orgName;//��������
	private String orgNo;//��������
	private String orgCode;//��������
	private String formFillingMan;//�����
	private String linkTel;//�����ϵ�绰
	private String leaderName;//�쵼������
	private String gender;//�Ա�
	private String folk;//����
	private Date birthDate;//��������
	private String pol;//������ò
	private String edu;//ѧ��
	private String degree;//ѧλ
	private String manageJob;//ְ��
	private String title;//ְ��
	private String memo;//��ע
	private Date serDate;//��ְ����
	private Date leaveDate;//��ְ����
	private String yearly;//���
	
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
