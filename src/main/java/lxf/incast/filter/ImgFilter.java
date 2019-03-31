package lxf.incast.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.net.httpserver.HttpExchange;

/**
 * 防盗链技术
 * @author 我有一个小梦想
 * 
 * @date 2019年3月31日 下午4:34:52
 */
public class ImgFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("过滤器销毁...");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("doFilter");
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		String referer = req.getHeader("referer");
		//请求服务器名称
		String serverName = req.getServerName();
		System.out.println("referer:"+referer+" ,serverName:"+serverName);
		if(referer == null || !(referer.contains(serverName))){
			req.getRequestDispatcher("error.jpg").forward(req, res);
			return ;
		}
		
		//放行
		chain.doFilter(req, res);
	}

	public void init(FilterConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("过滤器初始化...");
	}

	
}
