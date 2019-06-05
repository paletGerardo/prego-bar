package com.ar.angema.menuapp;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Service
public class SimpleCROSFilter implements Filter {

//==============================================================//
    static String clase = "SimpleCROSFilter";
    private static final Log LOG = LogFactory.getLog(SimpleCROSFilter.class);
//==============================================================//

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        LOG.info("CLASS '" + clase + "' ====> " + "iniciado");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;

        httpServletResponse.setHeader("Access-Control-Allow-Origin", httpServletRequest.getHeader("Origin"));
        chain.doFilter(httpServletRequest,httpServletResponse);
    }

    @Override
    public void destroy() {

    }
}
