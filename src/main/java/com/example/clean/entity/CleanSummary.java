package com.example.clean.entity;

import java.sql.Date;

import lombok.Data;

@Data
public class CleanSummary {
	private Integer cleanId;
	private String cleanName;
	private Date registDate;
	private Type type;
	private Integer memoCnt;

}
