package com.lmdestiny.control;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lmdestiny.model.Organization;
import com.lmdestiny.model.Orgattached;
import com.lmdestiny.service.InstitutionService;
import com.lmdestiny.service.OrgattachedService;
import com.lmdestiny.util.PageModel;

//机构管理/机构列表
//对机构的管理
@Controller
@RequestMapping("/institution")
public class InstitutionController {
	@Resource(name="institutionService")
	private InstitutionService  institutionService;
	@Resource(name="orgattachedService")
	private OrgattachedService orgattachedService;

	@RequestMapping("/toContentInstitutionListPage")
	public String toContentInstitutionListPage(){
		return "index";
	}
	@RequestMapping("/toIncHeaderPage")
	public String toIncHeaderPage(){
		return "inc-header";
	}
	@RequestMapping("/toWelcomePage")
	public String toWelcomePage(){
		return "welcome";
	}
	@RequestMapping("/toIncNavPage")
	public String toIncNavPage(){
		return "inc-nav"; 
	}
	//进入机构列表并查询所有机构
	@RequestMapping("/toInstitutionList/{pageNo}")
	public String toInstitutionList(@PathVariable Integer pageNo,Model model,HttpServletRequest request){

		if(pageNo == null){
			if(request.getSession().getAttribute("pageNo")==null){
				request.getSession().setAttribute("pageNo",1);
				pageNo =1;
			}else{
				pageNo =(Integer)request.getSession().getAttribute("pageNo");
			}
		}
		request.getSession().setAttribute("pageNo",pageNo);
		PageModel<Organization> pageModel =new PageModel<Organization>();
		pageModel.setPageNo(pageNo);
		pageModel.setPageSize(5);
		pageModel.setItems(this.institutionService.getAllOrganization(pageModel));
		model.addAttribute("pageModel",pageModel);
		return "content/institution-list";
	}
	//进入详情页面
	@RequestMapping("/toInstitutionViewPage/{orgId}")
	public String toInstitutionViewPage(@PathVariable String orgId,Model model){
		return "content/institution-view";
	}
	//进入新建机构页
	@RequestMapping("/toInstitutionCreatPage")
	public String toInstitutionCreatPage(HttpServletRequest request){
		return "content/institution-creat";
	}
	//插入信息
	@RequestMapping("/saveInstitution")
	public String saveInstitution(Orgattached orgattached,HttpServletRequest request){
		request.getSession().setAttribute("orgattached",null);
		orgattached.setOrgName(orgattached.getOrganization().getOrgName());
		orgattached.setOrgNo(orgattached.getOrganization().getOrgNo());
		orgattached.setOrgCode(orgattached.getOrganization().getOrgCode());
		orgattached.setId(UUID.randomUUID().toString());
		orgattached.getOrganization().setId(UUID.randomUUID().toString());
		this.institutionService.saveOrganizarion(orgattached.getOrganization());
		this.orgattachedService.saveOrgattached(orgattached);
		return "content/institution-list";
	}
	//保存信息
	@RequestMapping("/sessionInstitution")
	public String sessionInstitution(Orgattached orgattached,HttpServletRequest request){
		request.getSession().setAttribute("orgattached",orgattached);
		return "forward:toInstitutionList/1";
		
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}
}
