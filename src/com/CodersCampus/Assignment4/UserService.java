package com.CodersCampus.Assignment4;

public interface UserService {
	User createUser(String[] info);
	
	void logStudent(User userInfo);
	
	String checkingStudentClass(User student);
}
