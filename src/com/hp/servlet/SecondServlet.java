package com.hp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/** 
* 类说明 :
* @author 作者 :chenyanlong
* @version 创建时间：2017年12月11日 
*/
public class SecondServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//处理get方式的请求
		System.out.println("get.................");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 处理post方式的请求
		System.out.println("post.................");

	}
}
