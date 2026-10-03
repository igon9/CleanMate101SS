package com.example.clean.form;

import java.sql.Date;

import lombok.Data;

@Data
public class CleanSearchListForm {

	private String cleanName;
	private Date registDate;
	private String typeCode;

}
