package com.lmdestiny.model;

import java.util.Date;
import java.util.List;

/**
 * ��֯������
 * @author wangbin
 *
 */
public class Organization {
	
	private String id;//ʹ��uuid�������� 
	private String orgNo;//��������
	private String orgCode;	//��������
	private String orgName;//��������
	private String exeType;//�������
	private String areaCode;//��������
	private String linkAdd;//��ַ
	private Date listingDate;//��������
	private Date standaloneDate;//������������
	private String areaType;//���������
	private Date zbbdocDate;//�����������
	private String orgLevel;//������������
	private String orgPro;//��������
	private String zipCode;//��������
	private List<Section> sections;//������Ϣ
	private List<Fund> funds;//��������
	private List<Leader> leaders;//�쵼
	private List<Orgattached> orgattacheds;//����������Ϣ
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getExeType() {
		return exeType;
	}
	public void setExeType(String exeType) {
		this.exeType = exeType;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getLinkAdd() {
		return linkAdd;
	}
	public void setLinkAdd(String linkAdd) {
		this.linkAdd = linkAdd;
	}
	public Date getListingDate() {
		return listingDate;
	}
	public void setListingDate(Date listingDate) {
		this.listingDate = listingDate;
	}
	public Date getStandaloneDate() {
		return standaloneDate;
	}
	public void setStandaloneDate(Date standaloneDate) {
		this.standaloneDate = standaloneDate;
	}
	public String getAreaType() {
		return areaType;
	}
	public void setAreaType(String areaType) {
		this.areaType = areaType;
	}
	public Date getZbbdocDate() {
		return zbbdocDate;
	}
	public void setZbbdocDate(Date zbbdocDate) {
		this.zbbdocDate = zbbdocDate;
	}
	public String getOrgLevel() {
		return orgLevel;
	}
	public void setOrgLevel(String orgLevel) {
		this.orgLevel = orgLevel;
	}
	public String getOrgPro() {
		return orgPro;
	}
	public void setOrgPro(String orgPro) {
		this.orgPro = orgPro;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public List<Section> getSections() {
		return sections;
	}
	public void setSections(List<Section> sections) {
		this.sections = sections;
	}
	public List<Fund> getFunds() {
		return funds;
	}
	public void setFunds(List<Fund> funds) {
		this.funds = funds;
	}
	public List<Leader> getLeaders() {
		return leaders;
	}
	public void setLeaders(List<Leader> leaders) {
		this.leaders = leaders;
	}
	public List<Orgattached> getOrgattacheds() {
		return orgattacheds;
	}
	public void setOrgattacheds(List<Orgattached> orgattacheds) {
		this.orgattacheds = orgattacheds;
	}
	@Override
	public String toString() {
		return "Organization [id=" + id + ", orgNo=" + orgNo + ", orgCode=" + orgCode + ", orgName=" + orgName
				+ ", exeType=" + exeType + ", areaCode=" + areaCode + ", linkAdd=" + linkAdd + ", listingDate="
				+ listingDate + ", standaloneDate=" + standaloneDate + ", areaType=" + areaType + ", zbbdocDate="
				+ zbbdocDate + ", orgLevel=" + orgLevel + ", orgPro=" + orgPro + ", zipCode=" + zipCode + ", sections="
				+ sections + ", funds=" + funds + ", leaders=" + leaders + ", orgattacheds=" + orgattacheds + "]";
	}
	
}
