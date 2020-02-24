package service;

import bean.Information;
import bean.StudentFreeTime;
import dao.InformationDao;

public class StudentMessageImpl implements StudentMessage{
	private InformationDao informationDao = new InformationDao();
	@Override
	public boolean addStudent(Information information) {
		boolean result = informationDao.addInformation(information);
		return result;
	}
	@Override
	public boolean addFreeTime(StudentFreeTime studentFreeTime) {
		boolean result = informationDao.addFreeTime(studentFreeTime);
		return result;
	}

}
