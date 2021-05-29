package com.qny.login;

import com.qny.login.service.LoginService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 汉槿
 * @version 1.0
 * @since 2021-05-29 11:54
 */
@RestController
@RequestMapping("/login")
@Api(tags = "用户登录")
public class LoginController {

    @Autowired
    private LoginService loginService;
}
