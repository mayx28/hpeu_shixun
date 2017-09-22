package online.shixun.test;

import java.util.Date;

import org.hibernate.Session;
import org.junit.Test;

import online.shixun.model.Order;
import online.shixun.model.User;

public class HibernateOneToManyDemo {

	/**
	 * 保存用户及其关联的订单数据
	 */
	@Test
	public void saveUser() {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();

		// 产生一个客户
		User user1 = new User();
		user1.setLoginName("may");
		user1.setPassword("123");
		user1.setCreateDate(new Date());

		// 产生三个订单
		Order order1 = new Order();
		order1.setCode(12345678);
		order1.setCreateDate(new Date());

		Order order2 = new Order();
		order2.setCode(43553223);
		order2.setCreateDate(new Date());

		Order order3 = new Order();
		order3.setCode(23456543);
		order3.setCreateDate(new Date());

		// 建立关系
		user1.getOrders().add(order1);
		user1.getOrders().add(order2);
		user1.getOrders().add(order3);

		// 保存
		session.save(user1);

		session.getTransaction().commit();
		session.close();
	}

	/**
	 * 查询用户及其订单数据
	 */
	@Test
	public void getUser() {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();

		session.get(User.class, 1);
		
		session.get(Order.class, 1);

		session.getTransaction().commit();
		session.close();

	}
}
