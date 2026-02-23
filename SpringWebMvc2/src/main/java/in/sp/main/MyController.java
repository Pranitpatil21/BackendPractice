package in.sp.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.sp.beans.User;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {

//	@RequestMapping("/helloPage")      //this will accept all request get,post ...

//	@RequestMapping(value = "/helloPage",method = RequestMethod.GET)   //this will accept only get type request

	@GetMapping("/helloPage") // easy way
	public ModelAndView openHelloPage() {
		System.out.println("openHelloPage() Method Executed");

		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello"); // hello is page name
		return mav;
	}

	@GetMapping("/aboutUs")
	public String openAboutUsPage() {
		return "about-us";
	}

	@GetMapping("/myForm")
	public String myForm() {
		return "my-form";
	}

//	@PostMapping("/submitForm")                             //Not used Much
//	public String handleMyForm(HttpServletRequest req) {
//		
//		String myname = req.getParameter("name1");
//		String myemail = req.getParameter("email1");
//		String myphno = req.getParameter("phoneno1");
//		
//		System.out.println("Name: "+myname);
//		System.out.println("Email: "+myemail);
//		System.out.println("Name: "+myphno);
//
//		return "profile";
//	}

//	@PostMapping("/submitForm")
//	public String handleMyForm(  //request param helps to binds data from web request to a method parameter in a controller
//			                     @RequestParam("name1") String myname,
//			                     @RequestParam("email1") String myemail,
//			                     @RequestParam("phoneno1") String myphno,
//			                     Model model    //with the help of mode interface we can send data on another page	
//			                   ) 
//	{
//		
//		System.out.println("Name: "+myname);
//		System.out.println("Email: "+myemail);
//		System.out.println("Name: "+myphno);
//		
//		//this will help to transfer or access data on another page // profile
//		model.addAttribute("model_name",myname);
//		model.addAttribute("model_email",myemail);
//		model.addAttribute("model_phno",myphno);
//		
//		return "profile";
//	}

	// if large amount of data comes than previous method may data loss by send one
	// by one data in this method we will send data in object

//	@PostMapping("/submitForm")
//	public String handleMyForm(  //request param helps to binds data from web request to a method parameter in a controller
//			                     @RequestParam("name1") String myname,
//			                     @RequestParam("email1") String myemail,
//			                     @RequestParam("phoneno1") String myphno,
//			                     Model model    //with the help of mode interface we can send data on another page	
//			                   ) 
//	{
//		
//		System.out.println("Name: "+myname);
//		System.out.println("Email: "+myemail);
//		System.out.println("Name: "+myphno);
//		
//		User user = new User();
//		user.setName(myname);
//		user.setEmail(myemail);
//		user.setPhoneno(myphno);
//		
//		model.addAttribute("model_user",user);
//		
//		return "profile";
//	}

//if large amount of data comes then every time creating new paramter and variables will take much time to avoid that we use this method	
	
	@PostMapping("/submitForm")
	public String handleMyForm(@ModelAttribute User user) { //modelattribute automatic binds request parameters or data to java object

		System.out.println("Name: " + user.getName());
		System.out.println("Email: " + user.getEmail());
		System.out.println("Name: " + user.getPhoneno());


		return "profile";
	}
}
