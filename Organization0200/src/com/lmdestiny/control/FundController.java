package com.lmdestiny.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fund")
public class FundController {

	@RequestMapping("/toSaveFundPage")
	public String  toSaveFundPage(){
		return "/";
	}
}
