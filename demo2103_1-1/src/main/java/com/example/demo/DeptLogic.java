package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class DeptLogic {
	Logger logger = LogManager.getLogger(DeptLogic.class);
	public List<Map<String, Object>> getJsonDeptList(){
		
		logger.info("jsonDeptList 호출 성공");
		
		List<Map<String, Object>> deptList = null;
		deptList = new ArrayList<>();
		Map<String, Object> rmap = new HashMap<>();
		rmap.put("deptno", 10);
		rmap.put("dname", "영업부");
		rmap.put("loc", "대전");
		deptList.add(rmap);
		rmap.clear();
		rmap.put("deptno", 20);
		rmap.put("dname", "개발부1");
		rmap.put("loc", "서울");
		deptList.add(rmap);
		rmap.clear();
		rmap.put("deptno", 30);
		rmap.put("dname", "개발부2");
		rmap.put("loc", "제주");
		deptList.add(rmap);
//		Gson g = new Gson();
//		String param = g.toJson(deptList);
		return deptList;
	}
}
