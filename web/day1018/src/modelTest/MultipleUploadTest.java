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
import java.util.Collection;

/**
 * Package-name: modelTest
 * Project-name:ReMyFirstJavaProgram
 * Author: Neko
 * 18/10/2023-10-2023 22-13
 * Describe：这是一个多个文件上传的测试
 */

//上传多个时html和servlet里都需要配置
@WebServlet("/multipleUpload")
@MultipartConfig
public class MultipleUploadTest extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //先设置文件格式
        req.setCharacterEncoding("UTf-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");

        //创建下载和结果语句
        String downloadLink = "";
        String message = "";

        //创建文件路径,不催在直接创建
        File file1 = new File(Constant.UPLOAD_PATH3);
        if (!file1.exists()) {
            file1.mkdirs();
        }

        //先获取part对象
        Collection<Part> parts = req.getParts();
        for (Part part : parts) {
            String type = part.getContentType();//获取文件类型
            String name = part.getSubmittedFileName();//获取上传时文件类型
            //这里对文件类型进行判断，不合适的文件类型直接恰似
            if (Constant.ALLOW_TYPE.contains(type)) {
                String absPath = Constant.UPLOAD_PATH3 + File.separator + name;
                //这里的part.write是接口的对象
                part.write(absPath);

                downloadLink += "<a href=\'downloadTest?file=" + name + "'> 下载" + name.substring(0, name.lastIndexOf(".")) + "<a><br>";
                message += "<p>" + name + "上传成功</p>";

            } else {
                message += "<p>" + name + "上传失败，不支持的文件类型</p>";
            }
            String html = "<html><body>";
            html += message;
            html += "<p>文件下载路径</p>";
            html += downloadLink;
            html += "</body></html>";

            resp.getWriter().write(html);

        }


    }
}
