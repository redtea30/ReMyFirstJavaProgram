package modelTest;

import utils.Constant;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/downloadTest")
public class DownloadTestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //先设置了转发标签，但是好像转到同一个方法内了，不影响执行
        //req.getRequestDispatcher("/download.html").forward(req, resp);

        resp.setContentType("application/octet-stream");

        //这里获取了本次的文件名，就是GET请求里的file后面的那个属性
        String file = req.getParameter("file");

        //设置文件头 附件类型下载，文件名就是获取的文件名
        resp.setHeader("content-disposition", "attachment; filename=" + file);

        //通过常量设置默认上传路径，下载路径
        //然后硬拼一个文件名和路径出来
        String path = Constant.UPLOAD_PATH3 + File.separator + file;

        System.out.println("下载");
        FileInputStream in = new FileInputStream(path);
        // 获取响应的输出流
        ServletOutputStream out = resp.getOutputStream();
        // 将文件内容写入到输出流
        in.transferTo(out);
        out.flush();
        out.close();
        in.close();


    }
}
