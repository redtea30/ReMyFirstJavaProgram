package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Package-name: filter
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 24-10-2023  12:05
 * Describe：该类作为监听类的代码转换
 */

@WebFilter("/*")
public class EncodingFilter implements Filter {


    //  必须实现的方法，但是没有写任何方法体
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    //  测试下使用 filter 设置过滤器
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        System.out.println("Filter 执行开始");
        req.setCharacterEncoding(String.valueOf(StandardCharsets.UTF_8));
        resp.setCharacterEncoding(String.valueOf(StandardCharsets.UTF_8));
        resp.setContentType("text/html;charset=utf-8");
        chain.doFilter(req, resp);
        System.out.println("Filter 执行结束");
    }

    //  必须实现的方法，但是没有写任何方法体
    @Override
    public void destroy() {

    }


}
