package com.example.clean.service;

import java.util.List;

import com.example.clean.entity.Clean;
import com.example.clean.entity.CleanSummary;

public interface CleanService {

	// 一覧全権検索
	List<CleanSummary> findListAll();

	// 登録
	void regist(Clean clean);

}
