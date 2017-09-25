package online.shixun.test;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;

import online.shixun.model.Commodity;

public class HibernateHQLConditionTest {
	/**
	 * 保存商品
	 */
	@Test
	public void saveCommodity() {
		Session session = HibernateUtil.getSession();
		try {
			session.beginTransaction();

			session.save(new Commodity("明博电视", "家庭必备", new Date(), new Date()));
			session.save(new Commodity("广角电视", "高清视频播放", new Date(), new Date()));
			session.save(new Commodity("毛巾", "毛巾擦脸的工具", new Date(), new Date()));

			session.getTransaction().commit();
			session.close();
		} catch (Exception e) {
			System.out.println("出现异常!!!");
			session.getTransaction().rollback();
		}

	}

	/**
	 * 查询商品ID和商品名称查询
	 */
	@Test
	public void listCommodity() {
		Session session = HibernateUtil.getSession();
		try {
			session.beginTransaction();

			Query query = session.createQuery("from Commodity where id=? and name like ?");

			query.setInteger(0, 1);
			query.setString(1, "%电视%");
			List<Commodity> list = query.list();
			System.out.println(list);

			session.getTransaction().commit();
			session.close();
		} catch (Exception e) {
			System.out.println("出现异常!!!");
			session.getTransaction().rollback();
		}

	}
}
