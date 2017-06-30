package keen.mybatis.demo;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtils {
    private static final String CONFIG_PATH = "config/mybatis-config.xml";

    /*
     * ��ȡ���ݿ��������
     */
    public static SqlSession getSqlSession() {
        SqlSession session = null;
        try {
            InputStream stream = Resources.getResourceAsStream(CONFIG_PATH);
            //���Ը������õ���Ӧ������ȡ��Ӧ�����ݿ⻷��
            // SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(
            // stream, "development"); 
            SqlSessionFactory factory = new SqlSessionFactoryBuilder()
                    .build(stream);
            session = factory.openSession();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return session;
    }

    /*
     * ��ȡ���ݿ��������
     */
    public static void closeSession(SqlSession session) {
        session.close();
    }
}
