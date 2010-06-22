package com.flurdy.grid.up4.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {

	protected transient Logger log = LoggerFactory.getLogger(this.getClass());

	protected ModelAndView returnTemplate(String view){
		ModelAndView modelAndView = new ModelAndView(view);
		modelAndView.getModel().put("analyticsId", "123" );
		log.debug("returning view: "+view);
		return modelAndView;
	}

	protected ModelAndView returnTemplate(ModelAndView modelAndView){
		modelAndView.getModel().put("analyticsId", "123" );
		log.debug("returning view: "+modelAndView.getViewName());
		return modelAndView;
	}

	
    @RequestMapping("/index.html")
	public ModelAndView indexHandler(){ log.debug("index"); return returnTemplate("index"); }

	@RequestMapping("/about.html")
	public ModelAndView aboutHandler(){ log.debug("about"); return returnTemplate("about"); }

}


