package com.example.clean.service;

import java.util.List;

import com.example.clean.entity.Type;

public interface TypeService {

	// 一覧全件取得
	List<Type> findAll();
	
	// １件取得
	Type findByCode(String typeCode);

}
