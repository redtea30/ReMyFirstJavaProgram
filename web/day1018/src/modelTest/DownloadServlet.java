package modelTest;

import utils.Constant;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@WebServlet("/download")
public class DownloadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //现转发一手
        req.getRequestDispatcher("/download").forward(req, resp);


    }

    public static void main(String[] args) {


    }

    public File[] listFile() {
        File file = new File(Constant.UPLOAD_PATH2);
        File[] listFiles = file.listFiles();
        return listFiles;
    }




}
