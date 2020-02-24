package service;

import bean.Information;
import bean.StudentFreeTime;

public interface StudentMessage {
	public boolean addStudent(Information information);

	public boolean addFreeTime(StudentFreeTime studentFreeTime);
}
