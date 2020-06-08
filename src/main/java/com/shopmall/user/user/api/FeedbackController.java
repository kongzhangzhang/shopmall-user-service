package com.shopmall.user.user.api;

import com.shopmall.user.common.dto.QueryDto;
import com.shopmall.user.common.utils.ResponseUtil;
import com.shopmall.user.common.utils.Result;
import com.shopmall.user.security.utils.SecurityUtil;
import com.shopmall.user.user.model.FeedbackModel;
import com.shopmall.user.user.service.IFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by majiancheng on 2020/4/12.
 */
@Controller
@RequestMapping("/api/feedback")
public class FeedbackController {

    @Autowired
    private IFeedbackService feedbackService;

    /**
     * 提交反馈信息
     *
     * @param queryDto
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/saveFeedback", method = RequestMethod.POST)
    public Result saveFeedback(@RequestBody QueryDto queryDto) {
        try {
            FeedbackModel feedbackModel = new FeedbackModel();
            feedbackModel.setUserId(SecurityUtil.getCurrentUserId());
            feedbackModel.setContent(queryDto.getContent());

            int saveCnt = feedbackService.saveNotNull(feedbackModel);

            return ResponseUtil.success();
        } catch(Exception e) {
            e.printStackTrace();

            return ResponseUtil.error();
        }
    }


}
