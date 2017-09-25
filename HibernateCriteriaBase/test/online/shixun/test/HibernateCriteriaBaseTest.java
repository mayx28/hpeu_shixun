package online.shixun.test;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import online.shixun.model.Commodity;

public class HibernateCriteriaBaseTest {
	/**
	 * 保存商品
	 */
	@Test
	public void saveCommodity() {
		Session session = HibernateUtil.getSession();
		try {
			session.beginTransaction();

			session.save(new Commodity("明博电视", "家庭必备", new Date(), new Date()));
			session.save(new Commodity("滑板", "便利的交通工具", new Date(), new Date()));
			session.save(new Commodity("毛巾", "洗脸", new Date(), new Date()));
			session.save(new Commodity("肥皂", "洗澡", new Date(), new Date()));
			session.save(new Commodity("电动自行车", "便利的交通工具", new Date(), new Date()));
			session.save(new Commodity("自行车", "便利的交通工具", new Date(), new Date()));

			session.getTransaction().commit();
			session.close();
		} catch (Exception e) {
			System.out.println("出现异常!!!");
			session.getTransaction().rollback();
		}

	}

	/**
	 * 基于Criteria查询商品数据
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void listCommodity() {
		Session session = HibernateUtil.getSession();
		try {
			session.beginTransaction();

			Criteria criteria = session.createCriteria(Commodity.class);
			List<Commodity> list = criteria
					.add(Restrictions.and(Restrictions.lt("id", 100), Restrictions.like("name", "%自行车%"))).list();
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
