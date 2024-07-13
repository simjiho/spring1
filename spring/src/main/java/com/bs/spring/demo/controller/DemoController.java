package com.bs.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	
		@RequestMapping("/demo/demo.do")
		public String parameterTestPage() {
			return "demo/demo";
		}
		
		//클라이언트가 보낸 데이터는 매핑메소드의 매개변수를 선언해서 처리함
		
		
		@RequestMapping("/demo/demo1.do")
		public String demo1() {
			return "demo/demo1";
		}
}
