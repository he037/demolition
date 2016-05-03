package com.placement.demolition.security;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.PathMatchingFilter;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.stereotype.Component;


@Component
public class LoginFilter extends PathMatchingFilter
{
    public String loginUrl = "/toLogin";
    
    
    @Override
    protected boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue) throws IOException
    {
    	Subject subject = SecurityUtils.getSubject();
        if(subject.isAuthenticated()) 
        {  
            return true;
        }
        
        if(subject.isRemembered()) 
        {   
        	Session session = subject.getSession();
//        	MemberBaseInfo member = (MemberBaseInfo) session.getAttribute("member");
//        	if(member == null)
//        	{
        		String mobileNumber = (String)subject.getPrincipal();
//        		member = memberBaseService.findUserByMobileNumber(mobileNumber);
//        		session.setAttribute("member", member);
//                session.setAttribute("memberId", member.getMemberId());
//                session.setAttribute("mobileNumber", member.getMobileNumber());
//        	}
            return true;
        }
        HttpServletRequest req = (HttpServletRequest) request;  
        HttpServletResponse resp = (HttpServletResponse) response;  
        if(isLoginRequest(req)) 
        {  
            return true;
        } 
        else 
        {
            //WebUtils.saveRequest(req);  
            WebUtils.issueRedirect(req, resp, loginUrl); 
            return false;  
        }

    }
    
    private boolean isLoginRequest(HttpServletRequest req)
    {  
        return pathsMatch(loginUrl, WebUtils.getPathWithinApplication(req));  
    }

    public String getLoginUrl()
    {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl)
    {
        this.loginUrl = loginUrl;
    }

}
