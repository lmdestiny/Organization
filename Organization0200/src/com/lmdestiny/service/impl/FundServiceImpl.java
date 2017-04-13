package com.lmdestiny.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lmdestiny.dao.FundDao;
import com.lmdestiny.model.Fund;
import com.lmdestiny.service.FundService;
@Service("fundService")
public class FundServiceImpl implements FundService {
	@Resource(name="fundDao")
	private FundDao fundDao; 
	
	public void saveFund(Fund fund) {
		this.fundDao.saveFund(fund);
	}

}
