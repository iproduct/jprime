package site.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	
	private static final Logger logger = Logger.getLogger(AdminController.class);

	private static final String PAGE_ADMIN_INDEX = "index.jsp";

	@RequestMapping("/admin")
	public String index(Model model) {
		return PAGE_ADMIN_INDEX;
	}

}
