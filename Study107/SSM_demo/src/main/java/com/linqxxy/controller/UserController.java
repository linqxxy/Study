package com.linqxxy.controller;

import com.linqxxy.po.User;
import com.linqxxy.po.UserEx;
import com.linqxxy.po.UserVO;
import com.linqxxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author L
 * @Date 2019/8/12 19:00
 * @Version 1.0
 **/

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/queryUser")
    public ModelAndView queryUserController(HttpServletResponse response, UserVO userVO) throws Exception {

        response.setContentType("text/html;charset=UTF-8");

        List<UserEx> userList = userService.queryUserListService(userVO);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userListKey", userList);
        modelAndView.setViewName("userlist");
        return modelAndView;
    }

    @RequestMapping(value = "/deleteById")
    public String deleteUserById(@RequestParam(value = "id") Integer myId) throws Exception {
        userService.deleteUserByIdService(myId);
        return "redirect:queryUser.action";
    }

    @RequestMapping(value = "/deleteByIds")
    public void deleteUserByIds(HttpServletResponse response, HttpServletRequest request) throws Exception {
        String[] ids = request.getParameterValues("selUser");
        Integer[] idss = new Integer[ids.length];
        for (int i = 0; i < ids.length; i++) {
            idss[i] = Integer.valueOf(ids[i]);
        }
        userService.deleteUserByIdsService(idss);
        request.getRequestDispatcher("/queryUser.action").forward(request, response);
    }

    // 展示修改信息
    @RequestMapping(value = "/modifyUserInfo")
    public String modifyUser(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType("text/html;charset=UTF-8");

        User user;
        String id = request.getParameter("id");

        if (id == null) {
            String strId = request.getParameter("selUser");
            int checkBox = Integer.parseInt(strId);
            user = userService.queryUserByIdService(checkBox);
        } else {
            int linkId = Integer.parseInt(id);
            user = userService.queryUserByIdService(linkId);
        }
        model.addAttribute("userKey", user);
        return "edit";
    }

    @RequestMapping(value = "/editSubmit")
    public String modifySubmit(Integer id,User user,HttpServletResponse response) throws Exception{
        response.setContentType("text/html;charset=UTF-8");
        userService.modifyUserService(id,user);
        return "redirect:queryUser.action";
    }

    @RequestMapping(value = "/modifyUsersInfo")
    public String modifyUsers(Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {

        response.setContentType("text/html;charset=UTF-8");

        String[] ids = request.getParameterValues("selUser");
        Integer[] idss = new Integer[ids.length];
        for (int i = 0; i < ids.length; i++) {
            idss[i] = Integer.valueOf(ids[i]);
        }
        List<UserEx> userExList = userService.queryUserByIdsService(idss);
        model.addAttribute("userExListKey",userExList);
        return "editUser";
    }

    @RequestMapping(value = "/editUsersSubmit")
    public String modifyUsersSubmit(UserVO userVO, HttpServletResponse response, HttpServletRequest request) throws Exception {
        response.setContentType("text/html;charset=UTF-8");
        System.out.println(userVO.getUserExList());
        userService.modifyUsersService(userVO.getUserExList());
        return "redirect:queryUser.action";
    }


    // 添加查询：去添加页面
    @RequestMapping(value = "/addUser")
    public String addUserController2() {
        return "redirect:/jsp/addUser.jsp";
    }

    // 添加
    @RequestMapping(value = "/addUserOperator")
    public void addUserController(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType("text/html;charset=UTF-8");

        String myFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(myFormat);
        String birthday = request.getParameter("userBirthday");
        Date userBirthday = simpleDateFormat.parse(birthday);
        UserEx userEx = new UserEx();
        userEx.setUsername(request.getParameter("userName"));
        userEx.setBirthday(userBirthday);
        userEx.setSex(request.getParameter("userSex"));
        userEx.setAddress(request.getParameter("userAddress"));

        userService.addUser(userEx);

        request.getRequestDispatcher("/queryUser.action").forward(request, response);
    }


}
