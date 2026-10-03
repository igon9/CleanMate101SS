package com.example.clean.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.clean.entity.Type;
import com.example.clean.repository.TypeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TypeServiceImpl implements TypeService {

	private final TypeRepository typeRepository;
	
	@Override
	@Transactional(readOnly = true)	
	public List<Type> findAll() {

		List<Type> list = typeRepository.selectAll();
		
		return list;
	}

	@Override
	@Transactional(readOnly = true)
	public Type findByCode(String typeCode) {

		Type type = typeRepository.selectByCode(typeCode);
		
		return type;
	}

}
