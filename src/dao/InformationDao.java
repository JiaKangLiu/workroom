package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import bean.Information;
import bean.StudentFreeTime;
import jdbc.JdbcUtil;

public class InformationDao {
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	public boolean addInformation(Information information) {
		try {
			con = (Connection) JdbcUtil.getConnection();
			String sql="insert into information (name,card,nativePlace,birthday,school,major,classes,phone,qq,department,job,sex) values (?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			String name = information.getName();
			String card = information.getCard();
			String nativePlace = information.getNativePlace();
			Date birthday = information.getBirthday();
			String school = information.getSchool();
			String major = information.getMajor();
			String classes = information.getClasses();
			String phone = information.getPhone();
			String qq = information.getQq();
			String department = information.getDepartment();
			String job = information.getJob();
			String sex = information.getSex();
			ps.setString(1,name);
			ps.setString(2, card);
			ps.setString(3, nativePlace);
			java.sql.Date date = new java.sql.Date(birthday.getTime());
			ps.setDate(4,date);
			ps.setString(5, school);
			ps.setString(6, major);
			ps.setString(7, classes);
			ps.setString(8, phone);
			ps.setString(9, qq);
			ps.setString(10, department);
			ps.setString(11, job);
//			ps.setString(12, imgUrl);
			ps.setString(12, sex);
			int result = ps.executeUpdate();
			if(result>0)
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean addFreeTime(StudentFreeTime studentFreeTime) {
		try {
			con = (Connection) JdbcUtil.getConnection();
			String sql="insert into free_time (card,time) values (?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			String card = studentFreeTime.getCard();
			int freeTime = studentFreeTime.getFreeTime();
			ps.setString(1,card);
			ps.setInt(2, freeTime);
			int result = ps.executeUpdate();
			if(result>0)
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	/**
	 * 获取某个时间段人员的空闲时间
	 */
	public void getFreeTimePerson(int time) {
		try {
			con = JdbcUtil.getConnection();
			String sql = "select information.name from information inner join free_time  on free_time.card = information.card where free_time.time = "+ time;
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			int col = rs.getMetaData().getColumnCount();
			while (rs.next()) {
	            for (int i = 1; i <= col; i++)
	                System.out.print(rs.getString(i) + "\t");
	        }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
