package com.lmdestiny.model;

/**
 * 机构附属信息表
 * 
 * @author wangbin
 *
 */
public class Orgattached {
	private String id;
	private Organization organization;//组织机构
	private String orgName;
	private String orgNo;
	private String orgCode;
	private Integer onworkerNum;//在职人数
	private Integer supervisorNum;//卫生监督员数
	private Integer zbbNum;//编制人数
	private String ifPublicmanage;//是否参公管理
	private Integer retireNum;//离退休人数
	private Integer officeBuildarea;//办公用房建筑面积
	private String buildingOwnership;//房屋所有权
	private Integer officeBuildingarea;//办公用房在建面积
	private Integer businessDivCount;//业务科室数
	private Integer funDivCount;//职能科室数
	private Integer orgCount;//派出机构数
	private Integer equ3Count;//1万元～10万元
	private Integer equ2Count;//≥10万元监测仪器设备台数
	private Integer equ1Count;//＜1万元监测仪器设备台数
	private Integer busCount;//汽车数
	private Integer rapidtestvehicleCount;//快速检测车数
	private Integer motorCount;//摩托车数
	private Integer cameraCount;//照相机数
	private Integer videoCount;//摄像机数
	private Integer copycatNum;//复印机数
	private Integer computerNum;//台式电脑数
	private Integer notepadNum;//笔记本电脑数
	private Integer serverCount;//服务器数
	private Integer pbxCount;//交换机数
	private Integer faxCount;//传真机数
	private Integer ohpCount;//投影仪数
	private String yearly;//年份
	private Integer vrCount;//录音笔数
	
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
	public Integer getOnworkerNum() {
		return onworkerNum;
	}
	public void setOnworkerNum(Integer onworkerNum) {
		this.onworkerNum = onworkerNum;
	}
	public Integer getSupervisorNum() {
		return supervisorNum;
	}
	public void setSupervisorNum(Integer supervisorNum) {
		this.supervisorNum = supervisorNum;
	}
	public Integer getZbbNum() {
		return zbbNum;
	}
	public void setZbbNum(Integer zbbNum) {
		this.zbbNum = zbbNum;
	}
	public String getIfPublicmanage() {
		return ifPublicmanage;
	}
	public void setIfPublicmanage(String ifPublicmanage) {
		this.ifPublicmanage = ifPublicmanage;
	}
	public Integer getRetireNum() {
		return retireNum;
	}
	public void setRetireNum(Integer retireNum) {
		this.retireNum = retireNum;
	}
	public Integer getOfficeBuildarea() {
		return officeBuildarea;
	}
	public void setOfficeBuildarea(Integer officeBuildarea) {
		this.officeBuildarea = officeBuildarea;
	}
	public String getBuildingOwnership() {
		return buildingOwnership;
	}
	public void setBuildingOwnership(String buildingOwnership) {
		this.buildingOwnership = buildingOwnership;
	}
	public Integer getOfficeBuildingarea() {
		return officeBuildingarea;
	}
	public void setOfficeBuildingarea(Integer officeBuildingarea) {
		this.officeBuildingarea = officeBuildingarea;
	}
	public Integer getBusinessDivCount() {
		return businessDivCount;
	}
	public void setBusinessDivCount(Integer businessDivCount) {
		this.businessDivCount = businessDivCount;
	}
	public Integer getFunDivCount() {
		return funDivCount;
	}
	public void setFunDivCount(Integer funDivCount) {
		this.funDivCount = funDivCount;
	}
	public Integer getOrgCount() {
		return orgCount;
	}
	public void setOrgCount(Integer orgCount) {
		this.orgCount = orgCount;
	}
	public Integer getEqu3Count() {
		return equ3Count;
	}
	public void setEqu3Count(Integer equ3Count) {
		this.equ3Count = equ3Count;
	}
	public Integer getEqu2Count() {
		return equ2Count;
	}
	public void setEqu2Count(Integer equ2Count) {
		this.equ2Count = equ2Count;
	}
	public Integer getEqu1Count() {
		return equ1Count;
	}
	public void setEqu1Count(Integer equ1Count) {
		this.equ1Count = equ1Count;
	}
	public Integer getBusCount() {
		return busCount;
	}
	public void setBusCount(Integer busCount) {
		this.busCount = busCount;
	}
	public Integer getRapidtestvehicleCount() {
		return rapidtestvehicleCount;
	}
	public void setRapidtestvehicleCount(Integer rapidtestvehicleCount) {
		this.rapidtestvehicleCount = rapidtestvehicleCount;
	}
	public Integer getMotorCount() {
		return motorCount;
	}
	public void setMotorCount(Integer motorCount) {
		this.motorCount = motorCount;
	}
	public Integer getCameraCount() {
		return cameraCount;
	}
	public void setCameraCount(Integer cameraCount) {
		this.cameraCount = cameraCount;
	}
	public Integer getVideoCount() {
		return videoCount;
	}
	public void setVideoCount(Integer videoCount) {
		this.videoCount = videoCount;
	}
	public Integer getCopycatNum() {
		return copycatNum;
	}
	public void setCopycatNum(Integer copycatNum) {
		this.copycatNum = copycatNum;
	}
	public Integer getComputerNum() {
		return computerNum;
	}
	public void setComputerNum(Integer computerNum) {
		this.computerNum = computerNum;
	}
	public Integer getNotepadNum() {
		return notepadNum;
	}
	public void setNotepadNum(Integer notepadNum) {
		this.notepadNum = notepadNum;
	}
	public Integer getServerCount() {
		return serverCount;
	}
	public void setServerCount(Integer serverCount) {
		this.serverCount = serverCount;
	}
	public Integer getPbxCount() {
		return pbxCount;
	}
	public void setPbxCount(Integer pbxCount) {
		this.pbxCount = pbxCount;
	}
	public Integer getFaxCount() {
		return faxCount;
	}
	public void setFaxCount(Integer faxCount) {
		this.faxCount = faxCount;
	}
	public Integer getOhpCount() {
		return ohpCount;
	}
	public void setOhpCount(Integer ohpCount) {
		this.ohpCount = ohpCount;
	}
	public String getYearly() {
		return yearly;
	}
	public void setYearly(String yearly) {
		this.yearly = yearly;
	}
	public Integer getVrCount() {
		return vrCount;
	}
	public void setVrCount(Integer vrCount) {
		this.vrCount = vrCount;
	}
	@Override
	public String toString() {
		return "Orgattached [id=" + id + ", organization=" + organization + ", orgName=" + orgName + ", orgNo=" + orgNo
				+ ", orgCode=" + orgCode + ", onworkerNum=" + onworkerNum + ", supervisorNum=" + supervisorNum
				+ ", zbbNum=" + zbbNum + ", ifPublicmanage=" + ifPublicmanage + ", retireNum=" + retireNum
				+ ", officeBuildarea=" + officeBuildarea + ", buildingOwnership=" + buildingOwnership
				+ ", officeBuildingarea=" + officeBuildingarea + ", businessDivCount=" + businessDivCount
				+ ", funDivCount=" + funDivCount + ", orgCount=" + orgCount + ", equ3Count=" + equ3Count
				+ ", equ2Count=" + equ2Count + ", equ1Count=" + equ1Count + ", busCount=" + busCount
				+ ", rapidtestvehicleCount=" + rapidtestvehicleCount + ", motorCount=" + motorCount + ", cameraCount="
				+ cameraCount + ", videoCount=" + videoCount + ", copycatNum=" + copycatNum + ", computerNum="
				+ computerNum + ", notepadNum=" + notepadNum + ", serverCount=" + serverCount + ", pbxCount=" + pbxCount
				+ ", faxCount=" + faxCount + ", ohpCount=" + ohpCount + ", yearly=" + yearly + ", vrCount=" + vrCount
				+ "]";
	}
}
