package com.lmdestiny.model;

import java.util.List;

/**
 * ������Ϣ��
 * @author wangbin
 *
 */
public class Section {

	private String	id;//����ID
	private Organization organization;//����
	private String 	orgNo;//��������
	private String 	divCode;//���ұ���
	private String 	divNameCode;//�������Ʊ���
	private String	divName;//��������
	private String	ifSub;//�Ƿ�Ϊ����
	private String	dutyTel;//�绰����
	private String fax;//�������
	private String divRoomNo;//�ź�
	private String exeType;//�������
	private List<Stuff> stuffs;//��Ա��
	
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
