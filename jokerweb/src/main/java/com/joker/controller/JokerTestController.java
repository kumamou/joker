package com.joker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 环境测试控制器
 *
 * @author Jiaqi.x
 * @version 1.0
 * @date 2017-5-10 15:31:12
 */
@Controller
public class JokerTestController {
    @RequestMapping("helloWord.html")
    public ModelAndView goIndex(ModelAndView mav){
        mav.setViewName("index.jsp");
        return mav;
    }
}
