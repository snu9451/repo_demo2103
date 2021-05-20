package com.example.demo;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//public class MapController extends AbstractController {
@Controller
//@RequestMapping("/di/*")
public class MyController {
	
//	private Map<String, String> mapBean = null;
//	
//	public void setMapBean(Map<String, String> mapBean) {
//		this.mapBean = mapBean;
//	}
//	@RequestMapping("mapTest")
//	public String mapTest() {
//		System.out.println(mapBean.get("prop1"));
//		return "redirect:mapTest.jsp";
//	}
	@GetMapping("/{name}.html")
	public String page(@PathVariable String name, Model model) {
		model.addAttribute("pageName", name);
		return "page";
	}
}
