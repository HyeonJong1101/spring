package kr.co.mlec.form;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/form")
public class MemberController {
	
	@RequestMapping("/joinForm.do")
	public String joinForm() {
		return "form/joinForm";
	}
	
	@RequestMapping("/join.do")
	public String join(@ModelAttribute("member") MemberVO member) {
		/*
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		
		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPassword(password);
		member.setName(name);
		request.setAttribute("member", member);
		이걸 생략가능...MemberVO member 이거보고 알아서 맞춰줌*/
		
		return "form/memberInfo";
	}
}
