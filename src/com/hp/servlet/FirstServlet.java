package com.hp.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/** 
* ��˵�� :
* @author ���� :chenyanlong
* @version ����ʱ�䣺2017��12��11�� 
*/
public class FirstServlet implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy��������������");
	}

	@Override
	public ServletConfig getServletConfig() {
		
		System.out.println("��������������");
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		System.out.println("��������������");
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init��������������");
		
		String driver=arg0.getInitParameter("driver");
		System.out.println("jbbc�������ݿ�:"+driver);
		String url=arg0.getInitParameter("driverurl");
		System.out.println("jbbc����url:"+url);
	}

	@Override  
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1.��λ�ȡȫ�ֱ���
		ServletContext context=arg0.getServletContext();
		//2.��ȡȫ�ֱ���������
		String name=context.getInitParameter("username");
		System.out.println("�û���:"+name);
		//3����ȡ��Ŀ����
		String contextName=context.getServletContextName();
		String contextPath=context.getContextPath();
		System.out.println(contextName);
		System.out.println(contextPath);
		
		//4.��ȡͼƬ����ʵ·��
		System.out.println("--------------------------");
		String contextPath1=context.getRealPath("16.jpg");
		System.out.println(contextPath1);
		
		//5.getResourceAsStream��ȡ��ĳ����Դ��������
		InputStream in=context.getResourceAsStream("16.jpg");
		OutputStream out=arg1.getOutputStream();
		byte[] buff=new byte[1024];
		while((in.read(buff)!=-1)){
			out.write(buff);
		}
	}

}
