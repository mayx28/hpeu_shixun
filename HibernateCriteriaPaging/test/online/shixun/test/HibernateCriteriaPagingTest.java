package online.shixun.test;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.CreateKeySecondPass;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import online.shixun.model.Commodity;

public class HibernateCriteriaPagingTest {
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
	@SuppressWarnings("unchecked")
	@Test
	public void listCommodity() {
		Session session = HibernateUtil.getSession();
		try {
			session.beginTransaction();

			Criteria criteria = session.createCriteria(Commodity.class);
			criteria.add(Restrictions.like("name", "%电视%")).list();
			criteria.setFirstResult((2 - 1) * 3);
			criteria.setMaxResults(3);
			criteria.addOrder(Property.forName("createDate").desc());
			List<Commodity> list = criteria.list();

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
