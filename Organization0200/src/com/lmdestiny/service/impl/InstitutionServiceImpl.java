package com.lmdestiny.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lmdestiny.dao.OrganizationDao;
import com.lmdestiny.model.Organization;
import com.lmdestiny.service.InstitutionService;
import com.lmdestiny.util.PageModel;

@Service("institutionService")
public class InstitutionServiceImpl implements InstitutionService {
	@Resource(name="organizationDao")
	private OrganizationDao organizationDao;

	public void saveOrganizarion(Organization organization) {
		this.organizationDao.saveOrganizarion(organization);
	}

	public List<Organization> getAllOrganization(PageModel pageModel) {
		//得到总记录数
		pageModel.setTotalNo(this.organizationDao.getTotalNumber());
		//得到总页数
		pageModel.setTotalPage((int)Math.ceil((double)pageModel.getTotalNo()/pageModel.getPageSize()));
		if(pageModel.getPageNo()<=1){
			pageModel.setPageNo(1);
		}
		if(pageModel.getPageNo()>=pageModel.getTotalPage()){
			pageModel.setPageNo(pageModel.getTotalPage());
		}
		return this.organizationDao.getAllOrganization((pageModel.getPageNo()-1)*pageModel.getPageSize(),pageModel.getPageSize());
	}

}
