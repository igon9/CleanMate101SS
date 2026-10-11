package com.example.clean.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.clean.entity.Type;
import com.example.clean.form.CleanRegistForm;
import com.example.clean.service.TypeService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class CleanRegistController {

	private final TypeService typeService;

	/*--- Clean登録画面表示リクエスト ---*/
	@PostMapping("/clean-show-regist")
	public String showRegist(
			@ModelAttribute CleanRegistForm form,
			Model model) {
		// タイプ選択リストを Model に設定
		setTypeList(model);

		// 登録画面へ
		return "clean-regist";
	}

	/*--- Clean登録リクエスト（登録画面より） ---*/
	@PostMapping("/clean-regist")
	public String regist(
			@Validated @ModelAttribute CleanRegistForm form,
			BindingResult result,
			Model model) {

		// 入力エラーがある場合には Clean登録画面に戻す
		if (result.hasErrors()) {
			setTypeList(model);
			return "clean-regist";
		}

		// 正常な場合に Clean登録確認画面に遷移する
		return "clean-confirm-regist";
	}

	/*--- Clean登録リクエスト（登録確認画面より） ---*/
	@PostMapping("/clean-confirm-regist")
	public String confirmRegist(
			@Validated @ModelAttribute CleanRegistForm form,
			BindingResult result,
			Model model,
			RedirectAttributes redirectAttributes) {

		// 入力エラーがある場合には Clean登録画面に戻す
		if (result.hasErrors()) {
			setTypeList(model);
			return "clean-regist";
		}

		// ここで実際の登録をする（今回はプレゼン層のみのため未実装）

		// フラッシュスコープに完了メッセージを格納して リダイレクト
		redirectAttributes.addFlashAttribute("msg", "(Clean登録)");

		return "redirect:/clean-complete";
	}

	/*--- タイプ選択リストを Model に設定 ---*/
	private void setTypeList(Model model) {
		List<Type> typeList = typeService.findAll();
		model.addAttribute("typeList", typeList);
	}

}
