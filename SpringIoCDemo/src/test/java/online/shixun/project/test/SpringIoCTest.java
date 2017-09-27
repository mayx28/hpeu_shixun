package online.shixun.project.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import online.shixun.project.service.RegisterService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ApplicationContext.xml")
public class SpringIoCTest {
	@Autowired
	RegisterService registerService;

	@Test
	public void test() {
		registerService.doRegister();
	}

}
