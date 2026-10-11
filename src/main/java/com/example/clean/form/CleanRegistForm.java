package com.example.clean.form;

import java.sql.Date;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import lombok.Data;

@Data
public class CleanRegistForm {

	@Size(min=1, max=32, message="1文字から32文字で指定してください。")
	private String cleanName;

	@NotNull(message="登録日を入力してください。")
	private Date registDate;

	@Size(min=2, max=2, message="タイプを選択してください。")
	private String typeCode;

	@Size(max=64, message="64文字以内で指定してください。")
	private String remarks;

}
