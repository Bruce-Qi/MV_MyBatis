package cn.tf.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;





import cn.tf.entity.FilmInfo;
import cn.tf.entity.FilmType;
import cn.tf.mapper.PersonMapper;
import cn.tf.utils.MyBatisUtil;

public class PersonServlet  extends BasicServlet {
	private static final long serialVersionUID = 1L;
     

	SqlSession  session;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op=request.getParameter("op");
		
		if("findAll".equals(op)){
			findAll(request,response);
		}else if("addMVInfo".equals(op)){
			addMVInfo(request,response);
		}else if("update".equals(op)){
			update(request,response);
		}else if("deltePerson".equals(op)){
			deltePerson(request,response);
		}else if("findfilmType".equals(op)){
			findfilmType(request,response);
		}else if("searchMVinInfoByPage".equals(op)){
			searchMVinInfoByPage(request,response);
		}
	}

	//条件查询
	private void searchMVinInfoByPage(HttpServletRequest request,
			HttpServletResponse response) {
		String filemName=request.getParameter("filemName");
		String typeID=request.getParameter("typeID");
		String actor=request.getParameter("actor");
		String director=request.getParameter("director");
		String ticketPrice=request.getParameter("ticketPrice");
		
		
		
		
		
		
	}


	//查找影片所有类型
	private void findfilmType(HttpServletRequest request,
			HttpServletResponse response) {
		response.setCharacterEncoding("UTF-8");
		session=MyBatisUtil.getSession();
		PersonMapper personMapper=session.getMapper(PersonMapper.class);
		
		List<FilmType> list=personMapper.findfilmType();
		
		this.out(response, list);		
	}

	//删除
	private void deltePerson(HttpServletRequest request,
			HttpServletResponse response) {
		String id=request.getParameter("id");
		session=MyBatisUtil.getAutoTransSession();
		PersonMapper personMapper=session.getMapper(PersonMapper.class);
		
		int result=personMapper.delete(Integer.parseInt(id));
		
		MyBatisUtil.close(session);
		this.out(response, result);		
		
	}


	//修改
	private void update(HttpServletRequest request,
			HttpServletResponse response)  {
		String fileID=request.getParameter("fileID");
		String filemName=request.getParameter("filemName");
	/*	String typeID=request.getParameter("typeID");*/
		String actor=request.getParameter("actor");
		String director=request.getParameter("director");
		String ticketPrice=request.getParameter("ticketPrice");
		
		
		System.out.println(fileID);
		
		FilmInfo person=new FilmInfo();
		person.setFileID(Integer.parseInt(fileID));
		person.setFilemName(filemName);
		/*person.setTypeID(Integer.parseInt(typeID));*/
		person.setActor(actor);
		person.setDirector(director);
		person.setTicketPrice(Double.parseDouble(ticketPrice));
		
		session=MyBatisUtil.getAutoTransSession();
		PersonMapper personMapper=session.getMapper(PersonMapper.class);
		int result=personMapper.update(person);
		MyBatisUtil.close(session);
		
		this.out(response,result);
	}


	//添加
	private void addMVInfo(HttpServletRequest request,
			HttpServletResponse response) {
		String filemName=request.getParameter("filemName");
		String typeID=request.getParameter("typeID");
		String actor=request.getParameter("actor");
		String director=request.getParameter("director");
		String ticketPrice=request.getParameter("ticketPrice");
		
		FilmInfo person=new FilmInfo();
		person.setFilemName(filemName);
		person.setTypeID(Integer.parseInt(typeID));
		person.setActor(actor);
		person.setDirector(director);
		person.setTicketPrice(Double.parseDouble(ticketPrice));
		
		session=MyBatisUtil.getAutoTransSession();
		PersonMapper personMapper=session.getMapper(PersonMapper.class);
		int result=personMapper.add(person);
		MyBatisUtil.close(session);
		
		this.out(response,result);
		
	}

	private void findAll(HttpServletRequest request, HttpServletResponse response) {

		response.setCharacterEncoding("UTF-8");
		session=MyBatisUtil.getSession();
		PersonMapper personMapper=session.getMapper(PersonMapper.class);
		List<FilmInfo>  list=personMapper.findAll();
		this.out(response, list);
		
	}
		

}
