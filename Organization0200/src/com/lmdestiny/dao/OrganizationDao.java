package com.lmdestiny.dao;

import java.util.List;

import com.lmdestiny.model.Organization;

/**
 * ��֯����dao
 * @author wangbin
 *
 */
public interface OrganizationDao {
	public void saveOrganizarion(Organization organization);
	public List<Organization> getAllOrganization(Integer pageNo, Integer pageSize);
	public Integer getTotalNumber();
}
