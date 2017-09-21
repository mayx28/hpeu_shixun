package online.shixun.test;

import java.util.Date;

import org.hibernate.Session;
import org.junit.Test;

import online.shixun.model.Order;
import online.shixun.model.User;

public class HibernateOneToManyDemo {

	/**
	 * �����û���������Ķ�������
	 */
	@Test
	public void saveUser() {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();

		// ����һ���ͻ�
		User user1 = new User();
		user1.setLoginName("may");
		user1.setPassword("123");
		user1.setCreateDate(new Date());

		// ������������
		Order order1 = new Order();
		order1.setCode(12345678);
		order1.setCreateDate(new Date());

		Order order2 = new Order();
		order2.setCode(43553223);
		order2.setCreateDate(new Date());

		Order order3 = new Order();
		order3.setCode(23456543);
		order3.setCreateDate(new Date());

		// ������ϵ
		user1.getOrders().add(order1);
		user1.getOrders().add(order2);
		user1.getOrders().add(order3);

		// ����
		session.save(user1);

		session.getTransaction().commit();
		session.close();
	}

	/**
	 * ��ѯ�û����䶩������
	 */
	@Test
	public void getUser() {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();

		// ��ѯidΪ1���û���Ϣ��������ʾ�û���������Ϣ
		session.get(User.class, 1);

		// ��ѯidΪ1��order��Ϣ�����һ��������ʾ�ٵ�һ�����û�����Ϣ
		session.get(Order.class, 1);

		session.getTransaction().commit();
		session.close();

	}
}
