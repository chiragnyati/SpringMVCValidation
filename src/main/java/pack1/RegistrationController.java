package pack1;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;


//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
//import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pack1.model.StudentModel;

@Controller
public class RegistrationController {


	@InitBinder
	public void DataBinder(WebDataBinder binder)
	{
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("MM/dd/yy"),true);
		binder.registerCustomEditor(Date.class, editor); 		

	}

	@RequestMapping(value="/register",method=RequestMethod.GET)
	public ModelAndView getStudentRegisterPage()
	{
		return new ModelAndView("studentregister","Student",new StudentModel());
	}

	@RequestMapping(value="/registerStudent", method=RequestMethod.POST)
	public ModelAndView registerStudent(@Valid @ModelAttribute("Student")StudentModel sm,BindingResult result)
	{
		if(result.hasErrors())
		{
			return new ModelAndView("studentregister");
		}
		else{
			return new ModelAndView("success");
		}
	}
}
