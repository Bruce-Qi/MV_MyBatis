package cn.tf.mapper;

import java.util.List;

import cn.tf.entity.FilmInfo;
import cn.tf.entity.FilmType;

public interface PersonMapper {

	List<FilmInfo> findAll();

	int delete(int id);

	List<FilmType> findfilmType();

	int add(FilmInfo person);

	int update(FilmInfo person);

	
	
}
