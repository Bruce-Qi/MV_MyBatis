package cn.tf.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class MyBatisUtil {
	
private static SqlSessionFactory  factory;
	
	static{
		InputStream in=null;
		try {
			in = Resources.getResourceAsStream("MyBatis.xml");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		factory=new SqlSessionFactoryBuilder().build(in);

	}
	
	//带事务
	public static SqlSession getSession(){

		return factory.openSession();
	}
	
	//获得自动事务
	public static SqlSession getAutoTransSession(){

		return factory.openSession(true);
		
	}
	
	//关闭SqlSession对象
	public  static void close(SqlSession session){
		if(session!=null){
			session.close();

		}
	}


}
