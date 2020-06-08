/*
 * 北京果敢时代科技有限公司
 * 北京市朝阳区望京SOHO T3 B座1607
 * 邮编：100022
 * 网址：www.davdian.com
 */

package com.shopmall.user.user.api;

import com.github.pagehelper.PageInfo;
import com.shopmall.user.common.dto.QueryDto;
import com.shopmall.user.common.utils.PageConvertUtil;
import com.shopmall.user.common.utils.ResponseUtil;
import com.shopmall.user.common.utils.Result;
import com.shopmall.user.user.model.OrderModel;
import com.shopmall.user.user.model.ReceivingAddressModel;
import com.shopmall.user.user.service.IReceivingAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;

/**
 * @author  davdian
 * @version 1.0
 * @since 1.0
 */

@Controller
@RequestMapping(value = "/api/receivingAddress")
public class ReceivingAddressController {

	@Autowired
	private IReceivingAddressService receivingAddressService;
	/**
	 * 收货地址列表
	 *
	 * @param queryDto
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public Result list(@RequestBody QueryDto queryDto) {
		try {
			ReceivingAddressModel receivingAddressModel = new ReceivingAddressModel();

			PageInfo<ReceivingAddressModel> receivingAddressPage = receivingAddressService.selectByFilterAndPage(receivingAddressModel, queryDto.getPageNum(), queryDto.getPageSize());

			return ResponseUtil.success(PageConvertUtil.grid(receivingAddressPage));
		} catch(Exception e) {
			e.printStackTrace();

			return ResponseUtil.error();
		}
	}

	/**
	 * 收货地址详情
	 *
	 * @param queryDto
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/detail", method = RequestMethod.POST)
	public Result detail(@RequestBody QueryDto queryDto) {

		try {
			ReceivingAddressModel receivingAddressModel = receivingAddressService.findById(queryDto.getId());

			if(receivingAddressModel == null) {
				return ResponseUtil.error("暂无收货地址相关信息");
			}

			return ResponseUtil.success(Collections.singletonMap("receivingAddressDetail", receivingAddressModel));
		} catch (Exception e) {
			e.printStackTrace();

			return ResponseUtil.error("系统异常, 请稍后重试。");
		}
	}
}
