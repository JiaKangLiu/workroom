package servlet;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Information;
import bean.StudentFreeTime;
import net.sf.json.JSONArray;
import service.StudentMessage;
import service.StudentMessageImpl;

public class AddStudentMessage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		ServletInputStream is;
		try {
			is = request.getInputStream();
			int nRead = 1;
			int nTotalRead = 0;
			byte[] bytes = new byte[10240];
			while (nRead > 0) {
				nRead = is.read(bytes, nTotalRead, bytes.length - nTotalRead);
				if (nRead > 0)
					nTotalRead = nTotalRead + nRead;
			}
			String str = new String(bytes, 0, nTotalRead, "utf-8");
			System.out.println(str);
			JSONArray json= JSONArray.fromObject("[" + str + "]");
			JSONArray jsonArray = JSONArray.fromObject(json);  
	        Information information = new Information();
	        String card = jsonArray.getJSONObject(0).getString("number");
	        information.setName(jsonArray.getJSONObject(0).getString("name"));
			information.setCard(card);
			information.setNativePlace(jsonArray.getJSONObject(0).getString("province") + jsonArray.getJSONObject(0).getString("address"));
			String birthday = jsonArray.getJSONObject(0).getString("date");
			birthday = birthday.substring(0,10);
			System.out.println("birthday"+birthday);
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
			try {
				Date date = sf.parse(birthday);
				System.out.println("date"+date);
				information.setBirthday(date);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			information.setSchool(jsonArray.getJSONObject(0).getString("academy"));
			information.setMajor(jsonArray.getJSONObject(0).getString("major"));
			information.setClasses(jsonArray.getJSONObject(0).getString("classes"));
			information.setPhone(jsonArray.getJSONObject(0).getString("phone"));
			information.setQq(jsonArray.getJSONObject(0).getString("qq"));
			information.setDepartment(jsonArray.getJSONObject(0).getString("section"));
			information.setJob(jsonArray.getJSONObject(0).getString("duty"));
			information.setSex(jsonArray.getJSONObject(0).getString("sex"));
			
			StudentMessage addStudent = new StudentMessageImpl();
			String freeTime = jsonArray.getJSONObject(0).getString("timeString");
			boolean flag = addStudent.addStudent(information);
			for(int i = 0; i < freeTime.length();) {
				String onceFree = freeTime.substring(i, i+2);
				int temp = Integer.parseInt(onceFree);
				StudentFreeTime studentFreeTime = new StudentFreeTime();
				studentFreeTime.setCard(card);
				studentFreeTime.setFreeTime(temp);
				addStudent.addFreeTime(studentFreeTime);
				i = i + 2;
			}
			
			OutputStream os = null;
			os = response.getOutputStream();
			response.setHeader("Content-type", "text/html;charset=UTF-8");  
			if(flag) {
				 String data = "服务器获取信息成功";  
				 //这句话的意思，使得放入流的数据是utf8格式  
				 os.write(data.getBytes("UTF-8")); 
			}
			else {
				String data = "服务器获取信息失败";  
				os.write(data.getBytes("UTF-8")); 
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
