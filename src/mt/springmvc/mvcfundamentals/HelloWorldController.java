package mt.springmvc.mvcfundamentals;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm(){
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(){
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String processFormVTwo(HttpServletRequest request , Model model){
		
		String name = request.getParameter("studentName");		
		name = name.toUpperCase();		
		String result = "Yo! " + name;
		
		model.addAttribute("message",result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVThree(
										@RequestParam("studentName") String theName , 
										Model model
									){
		
		theName = theName.toUpperCase();
		String result = "Hey Man '@RequestParam' is awesome " + theName;		
		model.addAttribute("message",result);
		
		return "helloworld";
	}
}
