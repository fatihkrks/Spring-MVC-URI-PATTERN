package controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/customers")
public class CustomerController {

	@RequestMapping("/query")
	public String customerByName(@RequestParam("name") String name,Model model) {
		model.addAttribute("message", name);
		return "customerPage";
	}
	
	@RequestMapping("/matrixParam/{filter}")
	public String matrixVariable(@MatrixVariable(pathVar = "filter") Map<String, List<String>> matrixVariables,Model model) {
		model.addAttribute("message", matrixVariables);
		return "customerPage";
	}
}
