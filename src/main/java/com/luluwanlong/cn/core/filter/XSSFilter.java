package com.luluwanlong.cn.core.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * <pre>
 * from http://www.servletsuite.com/servlets/xssflt.htm
 *
 * for example, add the follow in web.xml
 *
 * {@code
 * <filter>
 *   <filter-name>XSSFilter</filter-name>
 *     <filter-class>com.aicai.xss.filter.XSSFilter</filter-class>
 * </filter>
 *
 * <filter-mapping>
 *   <filter-name>XSSFilter</filter-name>
 *     <url-pattern>/*</url-pattern>
 * </filter-mapping>
 * }
 * </pre>
 *
 /**
 * @Description: $description$
 * @Author: zhoulong
 * @Date: 2018/5/5 14:23
 */
public class XSSFilter implements Filter {

    private FilterConfig config = null;
    // private static final String APOSTROPHE = "apostrophe";
    private static boolean no_init = true;
    private String apostrophe = "&#39;";

    // private static final String CPR =
    // "(c) Coldbeans mailto:info@servletsuite.com";
    // private static final String VERSION = "ver. 1.3";

    public void init(FilterConfig paramFilterConfig) throws ServletException {
        this.config = paramFilterConfig;
        no_init = false;
        String str = paramFilterConfig.getInitParameter("apostrophe");
        if (str != null)
            this.apostrophe = str.trim();
        System.out.println("XSS filter (c) Coldbeans mailto:info@servletsuite.com ver. 1.3");
    }

    public void destroy() {
        this.config = null;
    }

    public FilterConfig getFilterConfig() {
        return this.config;
    }

    public void setFilterConfig(FilterConfig paramFilterConfig) {
        if (no_init) {
            no_init = false;
            this.config = paramFilterConfig;
            String str = paramFilterConfig.getInitParameter("apostrophe");
            if (str != null)
                this.apostrophe = str.trim();
            System.out.println("XSS filter (c) Coldbeans mailto:info@servletsuite.com ver. 1.3");
        }
    }

    public void doFilter(ServletRequest paramServletRequest, ServletResponse paramServletResponse,
                         FilterChain paramFilterChain) throws IOException, ServletException {
        paramFilterChain.doFilter(new RequestWrapper((HttpServletRequest) paramServletRequest, this.apostrophe),
                paramServletResponse);
    }
}