package online.shixun.common;

import org.hibernate.dialect.MySQLDialect;

public class MySQL5InnoDBUTF8Dialect extends MySQLDialect {

	@Override
	public String getTableTypeString() {
		return "ENGINE=InnoDB DEFAULT CHARSET=utf8mb4";
	}
}
