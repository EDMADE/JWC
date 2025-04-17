package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//表示可以透過http://localhost:8080/JeveWeb/hello 網址執行Servlet程式
//@WebServlet("/hello") //精簡配置法
@WebServlet(urlPatterns = "/hello") //標準配置寫法
//@WebServlet(urlPatterns = {"/hello", "/welcome"})
//@WebServlet("/*") //不建議使用

public class HelloServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().print("Hello");
	}


}
