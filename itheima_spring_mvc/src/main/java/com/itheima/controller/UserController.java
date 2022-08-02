package com.itheima.controller;

import com.itheima.daomain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Controller

@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/quick23")
    @ResponseBody
    public void  save23(String username, MultipartFile[] uploadFile) throws IOException {
        System.out.println(username);
        System.out.println(uploadFile);
        for (MultipartFile multipartFile : uploadFile) {
            String originalFilename = multipartFile.getOriginalFilename();
            multipartFile .transferTo(new File("C:\\software\\" + originalFilename));
        }
    }

    @RequestMapping(value = "/quick22")
    @ResponseBody
    public void  save22(String username, MultipartFile uploadFile) throws IOException {
        System.out.println(username);
        System.out.println(uploadFile);
        String originalFilename = uploadFile.getOriginalFilename();
        uploadFile.transferTo(new File("C:\\software\\" + originalFilename));
    }

    @RequestMapping(value = "/quick20")
    @ResponseBody
    public void  save20(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        System.out.println(request);
        System.out.println(response);
        System.out.println(session);
    }

    // /user/quick19/zhangsan
    @RequestMapping(value = "/quick19/{name}")
    @ResponseBody
    public void  save19(@PathVariable(value = "name",required = false) String username){
        System.out.println(username);
    }

    @RequestMapping(value = "/quick18")
    @ResponseBody
    public void  save18(Date date) {
        System.out.println(date);
    }

    @RequestMapping(value = "/quick16")
    @ResponseBody
    public void  save16(@RequestParam(value = "name",required = false,defaultValue = "moiqlin") String username){
        System.out.println(username);
    }

    @RequestMapping(value = "/quick15")
    @ResponseBody
    public void  save15(@RequestBody List<User> userList){
        System.out.println(userList);
    }

    @RequestMapping(value = "/quick9")
    @ResponseBody
    public void  save9(User user){
        System.out.println(user);
    }

    @RequestMapping(value = "/quick8")
    @ResponseBody
    public void  save8(String username,int age){
        System.out.println(username+age);
    }

    @RequestMapping(value = "/quick7")
    @ResponseBody
    public String save7(){
        return "aaaaa";
    }

    @RequestMapping(value = "/quick5")
    public String sava5(HttpServletRequest request){
        request.setAttribute("username","超市你");
        return "success";
    }
    @RequestMapping(value = "/quick2")
    public ModelAndView sava2(){
        /*
        Model:模型 作用封装数据
        View：视图 作用展示数据
         */
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("username", "我是你爹地");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping(value = "/quick",method = RequestMethod.GET,params = {"username"})
    public String sava(){
        System.out.println("Controller sava running...");
        return "/success.jsp";
    }
}
