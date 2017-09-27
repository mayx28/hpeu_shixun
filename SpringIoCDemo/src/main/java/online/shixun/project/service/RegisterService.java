package online.shixun.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.shixun.project.dao.RegisterDao;

@Service
public class RegisterService {

	@Autowired
	private RegisterDao registerDao;

	public void doRegister() {
    registerDao.saveUser();
	}
}
