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
import com.shopmall.user.user.model.ReconciliationModel;
import com.shopmall.user.user.model.SupplierModel;
import com.shopmall.user.user.service.ISupplierService;
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
@RequestMapping(value = "/api/supplier")
public class SupplierController {

	@Autowired
	private ISupplierService supplierService;

	/**
	 * 对账列表
	 *
	 * @param queryDto
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public Result list(@RequestBody QueryDto queryDto) {
		try {
			SupplierModel supplierModel = new SupplierModel();

			PageInfo<SupplierModel> supplierPage = supplierService.selectByFilterAndPage(supplierModel, queryDto.getPageNum(), queryDto.getPageSize());

			return ResponseUtil.success(PageConvertUtil.grid(supplierPage));
		} catch(Exception e) {
			e.printStackTrace();

			return ResponseUtil.error();
		}
	}

	/**
	 * 对账详情
	 *
	 * @param queryDto
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/detail", method = RequestMethod.POST)
	public Result detail(@RequestBody QueryDto queryDto) {

		try {
			SupplierModel supplierModel = supplierService.findById(queryDto.getId());

			if(supplierModel == null) {
				return ResponseUtil.error("暂无供应商相关信息");
			}

			return ResponseUtil.success(Collections.singletonMap("supplierDetail", supplierModel));
		} catch (Exception e) {
			e.printStackTrace();

			return ResponseUtil.error("系统异常, 请稍后重试。");
		}
	}


}
