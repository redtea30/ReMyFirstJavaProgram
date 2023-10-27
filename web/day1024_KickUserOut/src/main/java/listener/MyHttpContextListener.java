package listener;

import util.Constant;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Package-name: PACKAGE_NAME
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 24-10-2023  09:25
 * Describe： ServletContextListener
 */


@WebListener
public class MyHttpContextListener implements ServletContextListener {

    /**
     * SessionContextListener 对象用于读取和储存Session对象
     *
     * @param sce
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("监听器启动");
        //  创建ArrayList接收需要存储的key

        //前一种方式，使用list进行存储

        //  第二种方法，使用map进行存储
        ConcurrentHashMap<String, HttpSession> map = new ConcurrentHashMap<String, HttpSession>();
        sce.getServletContext().setAttribute(Constant.ONLINE_USER, map);



    }

    //  监听器销毁时间在tomcat执行结束时
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("监听器销毁");
    }
}
