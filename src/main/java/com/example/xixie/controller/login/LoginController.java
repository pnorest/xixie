package com.example.xixie.controller.login;

import com.example.xixie.model.login.AdminUser;
import com.example.xixie.service.login.AdminUserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {
    private static final Logger log = LoggerFactory.getLogger(LoginController.class);


    @Autowired
    private AdminUserService adminUserService;

    /**
     * @description 登录验证，返回页面
     * @author hzz
     * @date 2019/11/12 17:17
     **/
    @RequestMapping("/login")
    public String login(HttpServletRequest request, Map<String, Object> map, String username, String password, String verifyCode) {
        String msg;
        if (StringUtils.isEmpty(username))
            return "/login";
        Subject subject = SecurityUtils.getSubject();
        subject.getSession().setTimeout(3600000L);
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {
            log.info(username + "登录");
            subject.login(token);
        } catch (UnknownAccountException e) {
            log.error(username + "登录失败，账号不存在");
            msg = "账号不存在";
            map.put("msg", msg);
            return "/login";
        } catch (IncorrectCredentialsException e) {
            log.error(username + "登录失败，密码错误");
            msg = "密码错误";
            map.put("msg", msg);
            map.put("username", username);
            return "/login";
        } catch (DisabledAccountException e) {
            log.error(username + "登录失败，账号禁用");
            msg = "账号禁用";
            map.put("msg", msg);
            map.put("username", username);
            return "/login";
        } catch (Exception e) {
            log.error(username + "登录失败");
            msg = "登录失败";
            map.put("msg", msg);
            return "/login";
        }
        log.info(username + "登录成功");
        HttpSession session = request.getSession();
        session.setAttribute("username", username);
        AdminUser user = adminUserService.findUserByName(username);
        session.setAttribute("id", user.getId());
        return "redirect:/index";
    }

    /**
     * @description 登录成功跳转首页
     * @author hzz
     * @date 2019/1/3 9:55
     **/
    @RequestMapping("/index")
    public String index() {
        return "/index";
    }


    /**
     * @description 退出登录
     * @author hzz
     * @date 2019/1/3 9:55
     **/
    @RequestMapping("/logout")
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "/login";
    }
}
