package test;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.sql.Date;

import bean.Information;
import bean.StudentFreeTime;
import jdbc.JdbcUtil;
import service.StudentMessage;
import service.StudentMessageImpl;

public class DB_Test {
	public static void main(String[]args) {
		/**
		 * 测试连接是否成功
		 */
		try {
			Connection conn = JdbcUtil.getConnection();
			if(conn!=null)
				System.out.println("OK");
			else
				System.out.println("sorry");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/**
		 * 添加学生测试
		 */
		StudentMessage addStudent = new StudentMessageImpl();
		StudentFreeTime freeTime = 	new StudentFreeTime();
		String card = "61300000000";
		String freeTime1 = "1213141525243647";
		
		for(int i = 0; i < freeTime1.length();) {
			String onceFree = freeTime1.substring(i, i+2);
			int temp = Integer.parseInt(onceFree);
			StudentFreeTime studentFreeTime = new StudentFreeTime();
			studentFreeTime.setCard(card);
			studentFreeTime.setFreeTime(temp);
			addStudent.addFreeTime(studentFreeTime);
			i = i + 2;
		}
//		if(flag) {
//			System.out.println("ok");
//		}else
//			System.out.println("sorry");
		
		Information information = new Information();
		information.setName("张三");
		information.setCard("6130116000");
		information.setNativePlace("江西南昌");
		Date currentTime = new Date(0);  
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    information.setBirthday((java.sql.Date) currentTime);
	    information.setSchool("信息工程学院");
	    information.setMajor("计算机科学与技术");
	    information.setClasses("162班");
	    information.setPhone("15555555555");
	    information.setQq("22121211121");
	    information.setDepartment("研发中心");
	    information.setJob("部委");
	    information.setSex("男");

	    boolean flag2=addStudent.addStudent(information);
//	    if(flag) {
//			System.out.println("ok");
//		}else
//			System.out.println("sorry");
	}
}
