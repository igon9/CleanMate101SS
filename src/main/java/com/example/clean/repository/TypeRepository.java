package com.example.clean.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.clean.entity.Type;
@Mapper
public interface TypeRepository {
	
	// 一覧全権検索
	List<Type> selectAll();

	// 1件検索
	Type selectByCode(@Param("typeCode") String typeCode);

}
