package common;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import JW.JWMapper;


// MyBatisContext.getSqlSession();
public class MyBatis {

	public static SqlSession getSqlSession() {
		try {
			// DB접속용 dataSource 객체 생성
			BasicDataSource dataSource = new BasicDataSource();

			// 오라클 기준
			dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
			;
			// @서버주소:포트번호:SID
			dataSource.setUrl("jdbc:oracle:thin:@중요정보삭제");
			dataSource.setUsername("중요정보삭제");
			dataSource.setPassword("중요정보삭제");

			TransactionFactory transactionFactory = new JdbcTransactionFactory();
			Environment environment = new Environment("development", transactionFactory, dataSource);
			Configuration config = new Configuration(environment);
			// 만든 매퍼 등록
			config.addMapper(JWMapper.class);
			

			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(config);
			return factory.openSession(true); // true이면 자동으로 commit을 수행함.

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
