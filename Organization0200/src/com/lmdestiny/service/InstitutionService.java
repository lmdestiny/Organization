package com.lmdestiny.service;

import java.util.List;

import com.lmdestiny.model.Organization;
import com.lmdestiny.util.PageModel;

public interface InstitutionService {
	public void saveOrganizarion(Organization organization);
	//得到所有,分页查找
	public List<Organization> getAllOrganization(PageModel pageModel);
	
}
