package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FindController implements Controller{
		private static FindController register = new FindController();
		
		private FindController() {};
		
		public static FindController getinstance() {
			return register;
		}
	@Override
	public String handle(HttpServletRequest reuqest, HttpServletResponse response) {
		/*
		 * 서블릿의 기능을 구현
		 * 폼값 받아서
		 * DAO비지니스 로직 리턴 받고
		 * 데이터 바인딩
		 * 네비게이션
		 * 
		 * interfacae기반으로 재사용성을 높인 클래스를 컴포넌트라 한다.
		 * */
		System.out.println("파인드 비지니스 로직 생성");
		return "find.result.jsp";
	}

}
