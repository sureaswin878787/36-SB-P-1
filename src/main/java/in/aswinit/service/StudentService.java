package in.aswinit.service;

import org.springframework.stereotype.Service;

import in.aswinit.response.Student;

@Service
public class StudentService {
	public Student getStudent()
	{
		Student student=new Student(102,"aaa","aaa@gmail.com");
		return student;
	}
}
