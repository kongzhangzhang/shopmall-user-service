/*
 * 北京果敢时代科技有限公司
 * 北京市朝阳区望京SOHO T3 B座1607
 * 邮编：100022
 * 网址：www.davdian.com
 */

package com.shopmall.user.user.api;

import com.shopmall.user.common.dto.QueryDto;
import com.shopmall.user.common.utils.ResponseUtil;
import com.shopmall.user.common.utils.Result;
import com.shopmall.user.user.model.AdvertisementModel;
import com.shopmall.user.user.service.IAdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import com.shopmall.user.user.dao.*;
import com.shopmall.user.user.service.*;

/**
 * @author  davdian
 * @version 1.0
 * @since 1.0
 */

@Controller
@RequestMapping(value = "/api/advertise")
public class AdvertisementController {

	@Autowired
	private IAdvertisementService advertisementService;

	@ResponseBody
	@RequestMapping(value = "/info", method = RequestMethod.POST)
	public Result info(@RequestBody QueryDto queryDto)
	{
		try{
			AdvertisementModel results = advertisementService.findById(queryDto.getPlatform());

			if(results == null) {
				return ResponseUtil.error("暂无开屏广告");
			}

			return ResponseUtil.success(Collections.singletonMap("advertiseInfo", results));
		} catch (Exception e) {
			e.printStackTrace();

			return ResponseUtil.error("系统异常, 请稍后重试。");
		}
	}
}
