package com.hp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/** 
* ��˵�� :
* @author ���� :chenyanlong
* @version ����ʱ�䣺2017��12��11�� 
*/
public class SecondServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//����get��ʽ������
		System.out.println("get.................");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// ����post��ʽ������
		System.out.println("post.................");

	}
}
