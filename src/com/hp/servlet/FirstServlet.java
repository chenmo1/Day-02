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
* 类说明 :
* @author 作者 :chenyanlong
* @version 创建时间：2017年12月11日 
*/
public class FirstServlet implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy。。。。。。。");
	}

	@Override
	public ServletConfig getServletConfig() {
		
		System.out.println("。。。。。。。");
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		System.out.println("。。。。。。。");
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init。。。。。。。");
		
		String driver=arg0.getInitParameter("driver");
		System.out.println("jbbc链接数据库:"+driver);
		String url=arg0.getInitParameter("driverurl");
		System.out.println("jbbc链接url:"+url);
	}

	@Override  
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1.如何获取全局变量
		ServletContext context=arg0.getServletContext();
		//2.获取全局变量的名字
		String name=context.getInitParameter("username");
		System.out.println("用户名:"+name);
		//3、获取项目名称
		String contextName=context.getServletContextName();
		String contextPath=context.getContextPath();
		System.out.println(contextName);
		System.out.println(contextPath);
		
		//4.获取图片的真实路径
		System.out.println("--------------------------");
		String contextPath1=context.getRealPath("16.jpg");
		System.out.println(contextPath1);
		
		//5.getResourceAsStream获取到某个资源的输入流
		InputStream in=context.getResourceAsStream("16.jpg");
		OutputStream out=arg1.getOutputStream();
		byte[] buff=new byte[1024];
		while((in.read(buff)!=-1)){
			out.write(buff);
		}
	}

}
