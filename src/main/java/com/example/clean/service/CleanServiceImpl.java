package com.example.clean.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.clean.entity.Clean;
import com.example.clean.entity.CleanSummary;
import com.example.clean.repository.CleanRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CleanServiceImpl implements CleanService{

	private final CleanRepository cleanRepository;

	@Override
	@Transactional(readOnly = true)
	public List<CleanSummary> findListAll(){

		List<CleanSummary> list = cleanRepository.selectListAll();

		return list;
	}

	@Override
	@Transactional
	public void regist(Clean clean) {

		cleanRepository.insert(clean);

	}

}
