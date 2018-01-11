package online.shixun.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.shixun.project.mapper.StudentMapper;
import online.shixun.project.model.Student;

@Service
public class StudentService {
	@Autowired
	private StudentMapper studentMapper;

	public List<Student> getAllStu() {
		return studentMapper.getAllStu();
	}

	public List<Student> getInfo(String direction) {
		
		return studentMapper.getInfo(direction);
	}

	public List<Student> getSex(String sex) {
		return studentMapper.getSex(sex);
	}

	public void addStu(Student student) {
		studentMapper.insertSelective(student);
	}

}
