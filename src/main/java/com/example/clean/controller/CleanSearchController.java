package com.example.clean.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.clean.entity.CleanSummary;
import com.example.clean.entity.Type;
import com.example.clean.form.CleanSearchListForm;
import com.example.clean.service.CleanService;
import com.example.clean.service.TypeService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class CleanSearchController {

	private final CleanService cleanService;
	private final TypeService typeService;

	/*--- 最初のリクエスト ---*/
	@GetMapping("/top")
	private String showListSelection(
			@ModelAttribute CleanSearchListForm form,
			Model model) {
		// ステータスリストを Model に設定
		List<Type> list = typeService.findAll();
		model.addAttribute("typeList", list);


		// HTMLテンプレート名で return
		return "clean-list";
	}

	/*--- 一覧検索リスト ---*/
	@PostMapping("/clean-search-list")
	private String searchList(
			@Validated @ModelAttribute CleanSearchListForm form,
			BindingResult result,
			Model model) {

		// 一覧の全件検索
		List<CleanSummary> list = cleanService.findListAll();

		// ステータスリストを Model に設定（次回検索用）
		List<Type> typeList = typeService.findAll();
		model.addAttribute("typeList", typeList);


		// 結果を格納して HTMLテンプレート名で return
		model.addAttribute("cleanSummaryList", list);

		return "clean-list";
	}

}
