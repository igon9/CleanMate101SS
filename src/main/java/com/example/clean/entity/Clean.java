package com.example.clean.entity;

import java.sql.Date;

import lombok.Data;

@Data
public class Clean {
	private Integer cleanId;
	private String cleanName;
	private Date registDate;
	private String typeCode;
	private String remarks;

}
