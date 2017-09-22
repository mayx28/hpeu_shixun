package online.shixun.test;

import java.util.Date;

import org.hibernate.Session;
import org.junit.Test;

import online.shixun.model.Order;
import online.shixun.model.Status;

public class HibernateManyToOneTest {
	/**
	 * 保存订单及状态数据
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
		status1.setName("已下单");
		status1.setCreateDate(new Date());

		Status status2 = new Status();
		status2.setName("未付款");
		status2.setCreateDate(new Date());

		
		order1.setStatus(status1);
		order2.setStatus(status1);
		order3.setStatus(status2);
		
		// 保存
		session.save(order1);
		session.save(order2);
		session.save(order3);
		
		session.getTransaction().commit();
		session.close();
	}

	/**
	 * 查看订单数据
	 */
	@Test
	public void getOrder() {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();

		// 查看id为1的订单信息
		session.get(Order.class, 1);

		session.getTransaction().commit();
		session.close();
	}
}
