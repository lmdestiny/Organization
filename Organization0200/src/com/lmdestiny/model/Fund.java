package com.lmdestiny.model;
/**
 * ���������
 * @author wangbin
 *
 */
public class Fund {
	private String id;
	private Organization organization;	//����
	private String orgName;
	private String orgNo;
	private String orgCode;
	private String yearly;//���
	private Integer preFund;//��Ա����
	private Integer businessFund;//ҵ�񾭷�
	private Integer dutyFund;//�����
	private Integer buildFund;//���������ʽ�
	
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
	public String getYearly() {
		return yearly;
	}
	public void setYearly(String yearly) {
		this.yearly = yearly;
	}
	public Integer getPreFund() {
		return preFund;
	}
	public void setPreFund(Integer preFund) {
		this.preFund = preFund;
	}
	public Integer getBusinessFund() {
		return businessFund;
	}
	public void setBusinessFund(Integer businessFund) {
		this.businessFund = businessFund;
	}
	public Integer getDutyFund() {
		return dutyFund;
	}
	public void setDutyFund(Integer dutyFund) {
		this.dutyFund = dutyFund;
	}
	public Integer getBuildFund() {
		return buildFund;
	}
	public void setBuildFund(Integer buildFund) {
		this.buildFund = buildFund;
	}
	

}
