package modelTest;

import utils.Constant;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;

@WebServlet("/upload")//还是需要设置文件名称
@MultipartConfig//这里是默认路径，可以不写
//临时目录，项目中不可以这么写
public class UploadTestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //req.getRequestDispatcher("/upload.html").forward(req, resp);
        //forward后面的不会执行
        //这里调用转发会直接不执行后面的Write方法

        //resp.sendRedirect("upload.html");
        //准发和重定向都不执行，重建servlet类解决？
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //这里设置文件上传路径
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");

        //设置doGet请求，没搞明白
        doGet(req, resp);


        //获取part对象
        Part part = req.getPart("uploadFile");
        //getSubmittedFileName（）方法获取上传文件名
        String submittedFileName = part.getName();


        //展示上传文件的名称
        System.out.println(submittedFileName);

        //获取html里的那个name属性的值
        System.out.println(part.getName());

        //这里省略检测文件夹创建路径
        //一般是需要判断文件路径是否存在


        //设置文件路径名称
        String filName = Constant.UPLOAD_PATH3 + File.separator + part.getName();
        //写入目录,直接写入
        part.write(filName);

        //加点东西
        String downloadFile = "<a href=\"downloadTest?file=" + submittedFileName + "\" > ";
        downloadFile += "下载文件 </a>";
        //写个临时页面
        resp.getWriter().write("<h1>上传成功</h1>" + downloadFile);

    }
}
