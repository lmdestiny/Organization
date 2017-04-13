package com.lmdestiny.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lmdestiny.dao.OrgattachedDao;
import com.lmdestiny.model.Organization;
import com.lmdestiny.model.Orgattached;
import com.lmdestiny.service.OrgattachedService;

/**
 * ∏Ω Ù–≈œ¢service
 * @author wangbin
 *
 */
@Service("orgattachedService")
public class OrgattachedServiceImpl implements OrgattachedService{
	@Resource(name="orgattachedDao")
	private OrgattachedDao orgattachedDao;
	//±£¥Ê
	public void saveOrgattached(Orgattached orgattached) {
		this.orgattachedDao.saveOrgattached(orgattached);
	}
	
	
}
