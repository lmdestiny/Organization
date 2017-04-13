package com.lmdestiny.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lmdestiny.model.Organization;
import com.lmdestiny.service.InstitutionService;

public class TSaveOrganization {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:beans.xml");
		InstitutionService is = (InstitutionService)ac.getBean("institutionService");
		Organization o = new Organization();
		o.setId("123434");
		is.saveOrganizarion(o);
		
		
		
	}

}
