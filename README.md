localhost:9090/spring/main
/WEB-INF/views/main.jsp

//localhost:9090/spring/
@RequestMapping("/")
public String mainpage() {
	System.out.println("mainpage메소드 실행!!");
	//WEB-INF/views/index.jsp
	return "index";
}


main.jsp
<h3> 내가 만든 페이지</h3>


//localhost:9090/spring/main
@RequestMapping("/main")
public String main() {
	System.out.println("mainpage메소드 실행!!");
	//WEB-INF/views/main.jsp
	return "main";
}


절대경로, 상대경로 
차이점-- 파일의 위치 

http://localhost:포트번호:/App명

-http://localhost:9090:/spring/main
200 = 정상적으로 처리됐을 때 코드
404 = not found

com.bs.spring.my.MyController.java
localhost:9090/spring/mypage

mypage.jsp
이름 나이 성별 출력

css 부트스트랩

com.bs.spring.demo.controller.DemoController

localhost:9090/spring/demo/demo.do

/WEB-INF/views/demo/demo.jsp

데이터를 보내는 방법
1) form 안에 input 태그 name-key value-value
2) querystring url => ? key=value&key=value =>데이터2개 보냄
