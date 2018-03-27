package com.lgt.dbaccess;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * 访问数据库类
 */
public class Dbaccess {

    public SqlSession getSqlSession() throws IOException {
        //通过配置文件获取数据库连接信息
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("D:\\workspace\\SSH-demo\\springMVC\\src\\main\\resources\\mybatis\\mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //通过配置信息构建一个SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //通过SqlsessionFactory打开一个数据库会话
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //返回SQLSession
        return sqlSession;

    }
}
