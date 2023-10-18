package modelTest;

import utils.Constant;

import javax.servlet.ServletException;
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
@WebServlet("/multipleUpload")
public class MultipleUploadTest extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //先设置文件格式
        req.setCharacterEncoding("UTf-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");

        //创建文件路径,不催在直接创建
        File file1 = new File(Constant.UPLOAD_PATH4);
        if (!file1.exists()) {
            file1.mkdirs();
        }

        //先获取part对象
        Collection<Part> parts = req.getParts();
        for (Part part : parts) {
            String type = part.getContentType();//获取文件类型
            String name = part.getSubmittedFileName();//获取上传时文件类型
            if (Constant.ALLOW_TYPE.contains(type)) {
                String absPath = Constant.UPLOAD_PATH4 + File.separator + name;
                File file = new File(absPath);//这个大概是为读取到的每个文件创建目录


            }

        }


    }
}
