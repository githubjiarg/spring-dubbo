package org.example.controller;

import org.example.service.impl.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 *  查询学校信息
 */
@Controller
@RequestMapping(value = "schoolController")
public class SchoolController {

    @Resource
    private SchoolService schoolService;

    /**
     * 查询教师信息
     * @return
     */
    @RequestMapping(value = "queryTeacher")
    public ModelAndView queryTeacher(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("module",schoolService.queryTeacher());
        modelAndView.setViewName("teacherShow");
        return modelAndView;
    }

    /**
     *  查询学生信息
     * @return
     */
    @RequestMapping(value = "queryStudent")
    public ModelAndView queryStudent(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("module",schoolService.queryStudent());
        modelAndView.setViewName("studentShow");
        return modelAndView;
    }

}
