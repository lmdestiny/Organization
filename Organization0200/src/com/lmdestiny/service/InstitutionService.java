package com.lmdestiny.service;

import java.util.List;

import com.lmdestiny.model.Organization;
import com.lmdestiny.util.PageModel;

public interface InstitutionService {
	public void saveOrganizarion(Organization organization);
	//�õ�����,��ҳ����
	public List<Organization> getAllOrganization(PageModel pageModel);
	
}
