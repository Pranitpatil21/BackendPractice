package in.sp.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

//	@RequestMapping("/helloPage")      //this will accept all request get,post ...
	
//	@RequestMapping(value = "/helloPage",method = RequestMethod.GET)   //this will accept only get type request
	
	@GetMapping("/helloPage") //easy way
	public ModelAndView openHelloPage() {
		System.out.println("openHelloPage() Method Executed");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello"); //hello is page name
		 return mav;
	 }
	
	@GetMapping("/aboutUs")
	public String openAboutUsPage() {
		return "about-us";
	}
}
