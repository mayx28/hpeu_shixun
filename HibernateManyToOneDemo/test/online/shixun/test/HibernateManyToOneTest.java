package online.shixun.test;

import java.util.Date;

import org.hibernate.Session;
import org.junit.Test;

import online.shixun.model.Order;
import online.shixun.model.Status;

public class HibernateManyToOneTest {
	/**
	 * ���涩����״̬����
	 */
	@Test
	public void saveOrder() {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();

		Order order1 = new Order();
		order1.setCode(345664);
		order1.setCreateDate(new Date());

		Order order2 = new Order();
		order2.setCode(233446);
		order2.setCreateDate(new Date());

		Order order3 = new Order();
		order3.setCode(654338);
		order3.setCreateDate(new Date());

		Status status1 = new Status();
		status1.setName("���µ�");
		status1.setCreateDate(new Date());

		Status status2 = new Status();
		status2.setName("δ����");
		status2.setCreateDate(new Date());

		
		order1.setStatus(status1);
		order2.setStatus(status1);
		order3.setStatus(status2);
		
		// ����
		session.save(order1);
		session.save(order2);
		session.save(order3);
		session.save(status1);
		session.save(status2);
		

		session.getTransaction().commit();
		session.close();
	}

	/**
	 * �鿴��������
	 */
	@Test
	public void getOrder() {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();

		// ��ѯidΪ1������Ϣ
		session.get(Order.class, 1);

		session.getTransaction().commit();
		session.close();
	}
}
