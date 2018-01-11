package online.shixun.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import online.shixun.project.model.Student;
import online.shixun.project.service.StudentService;

@Controller
@RequestMapping("/")
public class StudentCtroller {
	@Autowired
	private StudentService studentService;

	/**
	 * 获取学生信息
	 * 
	 * @return
	 */
	@RequestMapping(value = "/getStu")
	public String getAllStu(Model model) {
		List<Student> students = studentService.getAllStu();
		model.addAttribute("students", students);
		return "success.jsp";
	}
	/**
	 * 单向筛选(方向)
	 * @param direction
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="getInfo")
	public String   getInfo(@RequestParam("direction") String direction) {
		List<Student>  students=studentService.getInfo(direction);
		String json =JSON.toJSONString(students);
		return json;
	}
	/**
	 * 单向筛选（性别）
	 * @param sex
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="getSex")
	public String   getSex(@RequestParam("sex") String sex) {
		List<Student>  students=studentService.getSex(sex);
		String json =JSON.toJSONString(students);
		return json;
	}
	/**
	 * 新增用户
	 * @param student
	 * @return
	 */
	@RequestMapping("/addStu")
	public String addStu(Student student) {
		studentService.addStu(student);
		return "getStu";
	}
}
