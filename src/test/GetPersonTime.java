package test;

import dao.InformationDao;

public class GetPersonTime {
	public static void main(String [] args) {
		InformationDao informationDao = new InformationDao();
		informationDao.getFreeTimePerson(75);
	}
}
