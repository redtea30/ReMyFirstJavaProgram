package modelTest;

import utils.Constant;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@WebServlet("/list")
public class ListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        File[] files = listFile();


        StringBuilder sb = new StringBuilder("<table>");
        //文件头的设置
        sb.append("<tr><td>序号</td>").append("<td>文件名</td>").append("<td>文件大小</td>").append("<td>下载</td></tr>");


        //写临时界面
        resp.getWriter().write(sb.toString());


    }

    private File[] listFile() {
        File file = new File(Constant.UPLOAD_PATH2);
        File[] listFiles = file.listFiles(f -> f.isFile());
        //直接判断一手file是不是文件形式
        return listFiles;
    }

    private Double calculate() {
        return 0.0;
    }

}
