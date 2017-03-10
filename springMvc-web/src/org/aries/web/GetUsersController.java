package org.aries.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alipay")
public class GetUsersController {

	/**
	 * DO: fileList
	 * @param request
	 * @throws Exception
	 */
	@RequestMapping(value = { "", "/get_user" })
	public void getUser(HttpServletRequest request,HttpServletResponse response) throws Exception {
		String respJson = "{\"name\":\"zhangquanquan\"}" ;
		response.getWriter().write(respJson);
	}
	
	@RequestMapping(value = { "", "/get_users_in_page" })
	public String getUserPage(HttpServletRequest request,HttpServletResponse response) throws Exception {
		String respJson = "{\"name\":\"zhangquanquan\"}" ;

		System.out.println(respJson);
		request.setAttribute("users", respJson);
		return "users";
	}

}
