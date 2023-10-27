package listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Package-name: listener
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 24-10-2023  11:19
 * Describe：
 */
@WebListener//  该注释简化了xml里的书写
public class MyHttpSessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
    }
}
