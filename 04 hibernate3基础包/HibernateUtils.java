package com.shushu.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate操作工具类，只创建一个SessionFactory
 * 
 * @author shushu
 *
 */

public class HibernateUtils {
	private static Configuration configuration;
	private static SessionFactory sessionFactory;

	static {
		// 只对SessionFactory初始化一次
		configuration = new Configuration().configure();
		sessionFactory = configuration.buildSessionFactory();
	}

	/**
	 * 获得操作会话对象
	 */
	public static Session openSession() {
		return sessionFactory.openSession();
	}
}
