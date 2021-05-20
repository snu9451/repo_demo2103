package com.example.demo;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/zipcode/*")
public class ZipCodeController {
	
	Logger logger =LogManager.getLogger(ZipCodeController.class);
	
	@Autowired(required=true)
	private ZipCodeLogic zipCodeLogic = null;
	
	@RequestMapping("getZipCodeList")
	public String getZipCodeList(HttpServletRequest req) {
		logger.info("getZipCodeList 호출 성공");
		List<Map<String, Object>> zipList = null;
		zipList = zipCodeLogic.getZipCodeList();
		req.setAttribute("zipList", zipList);
//		return "forward:getZipCodeList.jsp";
		return "zipcode/getZipCodeList"; // 이때는 접미어에 .jsp를 붙이면 안 됨. 붙이면 xxx.jsp.jsp 처럼 나옴(404 Error)
	}
	@RequestMapping("getZipCodeList2")
	public ModelAndView getZipCodeList2(HttpServletRequest req) {
		logger.info("getZipCodeList2 호출 성공");
		List<Map<String, Object>> zipList = null;
		zipList = zipCodeLogic.getZipCodeList();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("zipcode/getZipCodeList"); // ViewResolver를 경유한다면 .jsp를 빼줘야 함. 접두어, 접미어 붙으므로...
		mav.addObject("zipList", zipList); // parameter에 req가 없이도 처리하는 것이 가능하다.
//		return "forward:getZipCodeList.jsp";
		return mav; // 이때는 접미어에 .jsp를 붙이면 안 됨. 붙이면 xxx.jsp.jsp 처럼 나옴(404 Error)
	}
}
