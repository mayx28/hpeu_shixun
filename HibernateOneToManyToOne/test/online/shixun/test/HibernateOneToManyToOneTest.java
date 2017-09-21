package online.shixun.test;

import java.util.Date;

import org.hibernate.Session;
import org.junit.Test;

import online.shixun.model.Order;
import online.shixun.model.User;

public class HibernateOneToManyToOneTest {
	/**
	 * �����û������������
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

		// ������ϵ
		user.getOrders().add(order1);
		user.getOrders().add(order2);
		order1.setUser(user);
		order2.setUser(user);

		// ����
		session.save(user);
		session.save(order1);
		session.save(order2);

		session.getTransaction().commit();
		session.close();

	}

	/**
	 * ��ѯ�û����䶩��
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
	 * ���涩������������û�
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

		// ������ϵ
		user.getOrders().add(order1);
		order1.setUser(user);

		// ����
		session.save(user);
		session.save(order1);

		session.getTransaction().commit();
		session.close();

	}

	/**
	 * ��ѯ�������û�
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
