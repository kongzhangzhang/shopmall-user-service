package com.shopmall.user.user.api;

import com.shopmall.user.security.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by majiancheng on 2019/10/20.
 */
@Controller
@RequestMapping("/api/index")
public class IndexController {

    @Autowired
    private IUserService userService;


}
