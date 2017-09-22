package online.shixun.test;

import java.util.Date;

import org.hibernate.Session;
import org.junit.Test;
import online.shixun.model.Commodity;
import online.shixun.model.Order;

public class HibernateManyToManyTest {
	/**
	 * 保存订单和商品
	 */
	@Test
	public void saveOrderAndCommodities() {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();

		Order order1 = new Order();
		order1.setCode(345672);
		order1.setCreateDate(new Date());

		Order order2 = new Order();
		order2.setCode(654367);
		order2.setCreateDate(new Date());

		Commodity commodity1 = new Commodity();
		commodity1.setCreateDate(new Date());
		commodity1.setDescription("来自印度尼西亚的好吃薯片~~");
		commodity1.setModifyDate(new Date());

		Commodity commodity2 = new Commodity();
		commodity2.setCreateDate(new Date());
		commodity2.setDescription("进口小哥哥~~");
		commodity2.setModifyDate(new Date());

		// 建立关系
		order1.getCommodities().add(commodity1);
		order1.getCommodities().add(commodity2);
		order2.getCommodities().add(commodity1);
		order2.getCommodities().add(commodity2);

		// 保存
		session.save(order1);
		session.save(order2);

		session.getTransaction().commit();
		session.close();

	}

	/**
	 * 查询订单和数据
	 */
	@Test
	public void getOrderAndCommodities() {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();

		session.get(Order.class, 1);
		session.get(Commodity.class,1);

		session.getTransaction().commit();
		session.close();

	}
}
