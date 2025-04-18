package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;cherset=UTF-8");
		
		//接收參數
		//例如:http://localhost:8080/JavaWeb/welcome?name=jack
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		
		//檢查age是否為數字
		if(isNumber(age)) {
		String message = Integer.parseInt(age) >= 18 ? "成年": "未成年";
		
		resp.getWriter().print(name+"歡迎光臨("+age +"歲" + message +")");
	}else {
		resp.getWriter().print(name+"歡迎光臨");
	}
	}
	public static boolean isNumber(String data) {
		try {
			Integer.parseInt(data);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	
	
}



