package com.qsp;

//import java.io.IOException;
//import java.io.PrintWriter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {

	@GetMapping("/newpage")
	public String getHiii() {
		return "home.jsp";
	}

//	@GetMapping("/sum")
//	public void sum(@RequestParam int num1, @RequestParam int num2, HttpServletRequest req, HttpServletRequest resp)
//			throws IOException, ServletException {
//		PrintWriter pw = resp.getWriter();
//		int result = num1 + num2;
//		pw.print("<h1>" + result + "</h1>");
//	}

	@Autowired
	UserDao dao;

	@GetMapping("/user")
	public ModelAndView getUser(@ModelAttribute User1 u) {
		dao.saveUser(u);
		ModelAndView modelAndView = new ModelAndView("displayAll");
		modelAndView.addObject("user", u);
		return modelAndView;
	}

	@GetMapping("/displayAll")
	public ModelAndView displayAllUsers() {
		List<User1> users = dao.findAllUsers();
		ModelAndView mv = new ModelAndView("displayAll.jsp");
		mv.addObject("list", users);
		return mv;
	}

	@GetMapping("/delete")
	public ModelAndView deleteUser(@RequestParam(name = "id") int id) {
		dao.deleteUser(id);
		ModelAndView mv = new ModelAndView("displayAll");
		return mv;
	}
	
	@GetMapping("/edit")
	public ModelAndView editUser(@RequestParam(name = "id") int id) {
		User1 user = dao.findByIDUser(id);
		ModelAndView mv = new ModelAndView("update.jsp");
		mv.addObject("user",user);
		return mv;
	}
	
	@GetMapping("/update")
	public ModelAndView updateUser(@ModelAttribute User1 user) {
		dao.updateUser(user);
		ModelAndView mv = new ModelAndView("displayAll");
		return mv;
	}


}
