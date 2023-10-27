package listener;

import util.Constant;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Package-name: listener
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 24-10-2023  11:21
 * Describe：
 */

//  监听属性的新增变化
@WebListener
public class MyHttpSessionAttributeListener implements HttpSessionAttributeListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        //  这里就是单纯展示下session的新增和名字
        System.out.println("Session 新增了" + event.getName() + "属性-->" + event.getValue());

        if (Constant.LOGIN_USER_KEY.equals(event.getName())) {
            ServletContext servletContext = event.getSession().getServletContext();
            //  通过读取servletContext里的 Constant.LOGIN_USER 键读取list值

            ConcurrentHashMap<String, HttpSession> map = (ConcurrentHashMap<String, HttpSession>) servletContext.getAttribute(Constant.ONLINE_USER);
            //这里的黄色时没有进行强转
            HttpSession session = event.getSession();

            //  存储的是 键值对
            map.put(session.getId(), session);


        }

    }

    //  登出操作，找到同样的值，然后干掉
    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        if (Constant.LOGIN_USER_KEY.equals(event.getName())) {
            System.out.println("Session 删除了" + event.getName() + "属性-->" + event.getValue());
            ServletContext servletContext = event.getSession().getServletContext();
            //  通过读取servletContext里的 Constant.LOGIN_USER 键读取list值
            //  拿到   ONLINE_USER

            ConcurrentHashMap<String, HttpSession> map = (ConcurrentHashMap<String, HttpSession>) servletContext.getAttribute(Constant.ONLINE_USER);
            //这里的黄色时没有进行强转
            HttpSession session = event.getSession();

            //  加了判断，如果为null不执行
            if (map.get(session.getId()) != null) {
                map.remove(session.getId());
            }

        }
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {

        System.out.println("session 修改了" + event.getName() + " 属性--> " + event.getValue());
    }
}
