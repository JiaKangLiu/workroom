package servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUpload;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.RequestContext;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.servlet.ServletRequestContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UpLoad extends HttpServlet {
	private static final String SAVEURL = "C:\\Users\\Administrator\\Pictures\\StudioNumbersPhoto";
//	C:\\Users\\Administrator\\Pictures\\StudioNumbersPhoto
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("上传开始...");
        req.setCharacterEncoding("utf-8");
        RequestContext requestContext = new ServletRequestContext(req);
        //判断是否是multipart/form-data格式的数据类型
        if(FileUpload.isMultipartContent(requestContext)){
            /**
             * 将请求消息实体中的每一个项目封装成单独的DiskFileItem (FileItem接口的实现) 对象的任务
             *由 org.apache.commons.fileupload.FileItemFactory 接口的默认实现
             *org.apache.commons.fileupload.disk.DiskFileItemFactory 来完成。当上传的文件项目比较小时，
             *直接保存在内存中（速度比较快），比较大时，以临时文件的形式，保存在磁盘临时文件夹（虽然速度慢些，但是内存资源是有限的）。
             */
            DiskFileItemFactory factory = new DiskFileItemFactory();
            factory.setRepository(new File(SAVEURL));
            ServletFileUpload upload = new ServletFileUpload(factory);
            upload.setSizeMax(1024*1024*10);
            List items = new ArrayList();
            try {
                items = upload.parseRequest(req);
            } catch (FileUploadException e1) {
                System.out.println("文件上传发生错误" + e1.getMessage());
            }
            Iterator it = items.iterator();
            while(it.hasNext()){
                FileItem fileItem = (FileItem) it.next();
                if(fileItem.isFormField()){
                    System.out.println(fileItem.getFieldName() + "   " + fileItem.getName() + "   " + new String
                            (fileItem.getString().getBytes("iso8859-1"), "utf-8"));
                }else{
                    System.out.println(fileItem.getFieldName() + "   " +
                            fileItem.getName() + "   " + fileItem.isInMemory() + "    " +
                            fileItem.getContentType() + "   " + fileItem.getSize());
                    
                    if(fileItem.getName()!=null && fileItem.getSize()!=0){
                        File fullFile = new File(fileItem.getName());
                        long currentTime = System.currentTimeMillis();
                        
                        File newFile = new File(SAVEURL + "\\" + fullFile.getName());
//                        imgUrl = fullFile.getName();
                        try {
                            fileItem.write(newFile);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }else{
                        System.out.println("文件没有选择 或 文件内容为空");
                    }
                }
            }
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
