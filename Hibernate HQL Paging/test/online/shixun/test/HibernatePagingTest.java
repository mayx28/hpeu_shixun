package online.shixun.test;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;

import online.shixun.model.Commodity;

public class HibernatePagingTest {
	/**
	 * 保存商品
	 */
	@Test
	public void saveCommodity() {
		Session session = HibernateUtil.getSession();
		try {
			session.beginTransaction();

			session.save(new Commodity("明博电视", "家庭必备", new Date(), new Date()));
			session.save(new Commodity("创维电视", "高清视频播放", new Date(), new Date()));
			session.save(new Commodity("TCL电视", "高清视频播放", new Date(), new Date()));
			session.save(new Commodity("海尔电视", "高清视频播放", new Date(), new Date()));
			session.save(new Commodity("康佳电视", "高清视频播放", new Date(), new Date()));
			session.save(new Commodity("长虹电视", "高清视频播放", new Date(), new Date()));

			session.getTransaction().commit();
			session.close();
		} catch (Exception e) {
			System.out.println("出现异常!!!");
			session.getTransaction().rollback();
		}

	}

	/**
	 * 分页显示商品数据
	 */
	@Test
	public void listCommodity() {
		Session session = HibernateUtil.getSession();
		try {
			session.beginTransaction();

			Query query = session.createQuery("from Commodity where name like ?");
			query.setString(0, "%电视%");
			query.setFirstResult((2 - 1) * 3);
			query.setMaxResults(3);

			List<Commodity> list = query.list();

			for (Commodity commodity : list) {
				System.out.println(commodity);

			}
			session.getTransaction().commit();
			session.close();
		} catch (Exception e) {
			System.out.println("出现异常!!!");
			session.getTransaction().rollback();
		}

	}
}
