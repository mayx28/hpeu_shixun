package online.shixun.test;

import java.util.Date;

import org.hibernate.Session;
import org.junit.Test;

import online.shixun.model.Order;
import online.shixun.model.User;

public class HibernateOneToManyToOneTest {
	/**
	 * 保存用户及其关联订单
	 */
	@Test
	public void saveUserAndOrders() {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();

		User user = new User();
		user.setLoginName("sunny");
		user.setPassword("123");
		user.setCreateDate(new Date());

		Order order1 = new Order();
		order1.setCode(456321);
		order1.setCreateDate(new Date());

		Order order2 = new Order();
		order2.setCode(567894);
		order2.setCreateDate(new Date());

		// 建立关系
		user.getOrders().add(order1);
		user.getOrders().add(order2);
		order1.setUser(user);
		order2.setUser(user);

		// 保存
		session.save(user);

		session.getTransaction().commit();
		session.close();

	}

	/**
	 * 查询用户及其订单
	 */
	@Test
	public void getUserAndOrders() {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();

		session.get(User.class, 1);

		session.getTransaction().commit();
		session.close();

	}

	/**
	 * 保存订单及其关联的用户
	 */
	@Test
	public void saveOrdersAndUser() {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();

		User user = new User();
		user.setLoginName("may");
		user.setPassword("456");
		user.setCreateDate(new Date());

		Order order1 = new Order();
		order1.setCode(879734);
		order1.setCreateDate(new Date());
		
		Order order2 = new Order();
		order2.setCode(543456);
		order2.setCreateDate(new Date());

		// 建立关系
		user.getOrders().add(order1);
		order1.setUser(user);

		// 保存
		session.save(order1);
		session.save(order2);

		session.getTransaction().commit();
		session.close();

	}

	/**
	 * 查询订单及用户
	 */
	@Test
	public void getOrdersAndUser() {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();

		session.get(Order.class, 1);

		session.getTransaction().commit();
		session.close();

	}
}
