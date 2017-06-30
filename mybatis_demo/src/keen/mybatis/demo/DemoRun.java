package keen.mybatis.demo;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import keen.mybatis.model.OrgUser;

public class DemoRun {
	Logger logger = Logger.getLogger(DemoRun.class.getName());
	public static void main(String[] args) {
		SqlSession session = MyBatisUtils.getSqlSession();
		try {
			OrgUser user = (OrgUser)session.selectOne("keen.mybatis.daoimpl.OrgUserMapper¡£getUserById", 1);
			System.out.println("ppp");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
	}
}
