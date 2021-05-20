package com.example.demo;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
public class RestDeptController {

	Logger logger = LogManager.getLogger(RestController.class);
	
	@Autowired	// 이 annotation을 사용하면 알아서 객체주입을 해준다.
	DeptLogic deptLogic = null;
	
	@RequestMapping("dept/responsePage")
	public String responsePage() {
		logger.info("responsePage 호출 성공");		
		return "한글 페이지";
	}
	@RequestMapping("dept/jsonDeptList")
	public String jsonDeptList() {
		logger.info("jsonDeptList 호출 성공");
		List<Map<String, Object>> deptList = null;
		deptList = deptLogic.getJsonDeptList();
		Gson g = new Gson();
		String param = g.toJson(deptList);
		return param;
	}
	
}
