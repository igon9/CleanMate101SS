package com.example.clean.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.clean.entity.Clean;
import com.example.clean.entity.CleanSummary;

@Mapper
public interface CleanRepository {

	// 一覧全権検索
	List<CleanSummary> selectListAll();

	// 登録
	void insert(@Param("clean") Clean clean);

}
