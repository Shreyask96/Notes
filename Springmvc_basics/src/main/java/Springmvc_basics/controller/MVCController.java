package Springmvc_basics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import Springmvc_basics.dao.MvcDao;
import Springmvc_basics.dto.MvcDto;


@Controller
public class MVCController {

    @Autowired
	MvcDao dao;
	
	
	@RequestMapping("/insert")
	@ResponseBody
	public void insert(@ModelAttribute MvcDto dto)
	{
		int id=dto.getId();
		String name=dto.getName();
		
	//	System.out.println(id+" "+name);
		
		String msg=dao.insert(dto);
		
	}
	
	
	@RequestMapping("/delete")
	@ResponseBody
	public void deletebyid(@ModelAttribute MvcDto dto)
	{
		int id=dto.getId();
		
		String delete=dao.deletebyid(id);		

		//System.out.println(delete);
	}
	
	
	@RequestMapping("/fetchbyid")
	@ResponseBody
	public ModelAndView fetchbyid(@ModelAttribute MvcDto dto)
	{
		int id=dto.getId();
		
		String fetch=dao.fetchbyid(id);
		
		
		ModelAndView modelandView=new ModelAndView("fetchbyid.jsp");
		modelandView.addObject("object", dto);
		
		return modelandView;
	}
	
	
	@RequestMapping("/deleteall")
	@ResponseBody
	public String deleteAll(@ModelAttribute MvcDto dto)
	{
		
		String msg=dao.deleteAll();
		return msg;
		
	}
	
	
	@RequestMapping("/fetchall")
	@ResponseBody
	public ModelAndView fetchAll(@ModelAttribute MvcDto d)
	{
		
		List<MvcDto> list=(List<MvcDto>) dao.fetchall();
		
		ModelAndView modelAndView=new ModelAndView("fetchall.jsp");
		modelAndView.addObject("object", list);
		
		return modelAndView;
			
	}
	
	
	public void update(@ModelAttribute MvcDto d )
	{
		int id = d.getId();
		String name = d.getName();
		
		
	}
}
