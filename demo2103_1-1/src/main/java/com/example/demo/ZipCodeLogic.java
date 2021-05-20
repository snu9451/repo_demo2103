package com.example.demo;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZipCodeLogic {
	
	Logger logger = LogManager.getLogger(ZipCodeLogic.class);
	
	@Autowired(required=false)
	private ZipCodeDao zipCodeDao = null;
	
	public List<Map<String, Object>> getZipCodeList(){
		logger.info("getZipCodeList 호출 성공");
		List<Map<String, Object>> zipList = null;
		zipList = zipCodeDao.getZipCodeList();
		
		return zipList;
	}
}
