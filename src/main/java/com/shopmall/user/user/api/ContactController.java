package com.shopmall.user.user.api;

import com.shopmall.user.common.dto.QueryDto;
import com.shopmall.user.common.utils.ResponseUtil;
import com.shopmall.user.common.utils.Result;
import com.shopmall.user.security.utils.SecurityUtil;
import com.shopmall.user.user.model.ContactModel;
import com.shopmall.user.user.service.IContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by majiancheng on 2020/3/9.
 */
@Controller
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private IContactService contactService;

    /**
     * 添加交流联系
     *
     * @param queryDto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addContact", method = RequestMethod.POST)
    public Result addContact(@RequestBody QueryDto queryDto) {
        if(queryDto == null) {
            return ResponseUtil.error("参数异常, 请稍后充值。");
        }

        try {
            ContactModel contactModel = new ContactModel();
            contactModel.setTitle(queryDto.getTitle());
            contactModel.setContent(queryDto.getContent());
            contactModel.setUserName(queryDto.getUserName());
            contactModel.setMobilePhone(queryDto.getMobilePhone());
            contactModel.setEmail(queryDto.getEmail());
            contactModel.setOther(queryDto.getOther());
            contactModel.setUserId(SecurityUtil.getCurrentUserId());

            int saveCnt = contactService.saveNotNull(contactModel);

            return ResponseUtil.success();
        } catch (Exception e) {
            e.printStackTrace();

            return ResponseUtil.error("系统异常, 请稍后重试。");
        }
    }
}
