

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;




import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.tf.entity.FilmInfo;
import cn.tf.mapper.PersonMapper;
import cn.tf.utils.MyBatisUtil;



public class TestCon {

	
	
	
	//测试连接
	@Test
	public void test1() throws IOException {

		SqlSession  session=MyBatisUtil.getSession();
		Connection con=session.getConnection();
		MyBatisUtil.close(session);
	}
	
	//查询操作
	@Test
	public void test2() throws IOException{

		SqlSession  session=MyBatisUtil.getSession();
		
		PersonMapper usermapper=session.getMapper(PersonMapper.class);
		
		List<FilmInfo> list =usermapper.findAll();
		System.out.println(list);
		
		MyBatisUtil.close(session);
	}
	
	
}
