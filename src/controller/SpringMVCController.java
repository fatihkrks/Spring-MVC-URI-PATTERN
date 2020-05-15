package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.MyService;

@Controller
@RequestMapping("/products")
public class SpringMVCController {

//	@Autowired
//	private MyService myService;

	@RequestMapping("/category/{categoryName}")
	public String message(@PathVariable("categoryName") String categoryName, Model model) {
	//	String msg = myService.Message(); 
		model.addAttribute("messageCategoryName", categoryName);
		return "productsPage";
	}
}
