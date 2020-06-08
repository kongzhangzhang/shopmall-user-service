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
import com.shopmall.user.user.model.CatalogModel;
import com.shopmall.user.user.service.ICatalogService;
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
@RequestMapping(value = "/api/catalog")
public class CatalogController {

	@Autowired
	private ICatalogService catalogService;
	/**
	 * 类目列表
	 *
	 * @param queryDto
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public Result list(@RequestBody QueryDto queryDto) {
		try {
			CatalogModel catalogModel = new CatalogModel();

			PageInfo<CatalogModel> catalogPage = catalogService.selectByFilterAndPage(catalogModel, queryDto.getPageNum(), queryDto.getPageSize());

			return ResponseUtil.success(PageConvertUtil.grid(catalogPage));
		} catch(Exception e) {
			e.printStackTrace();

			return ResponseUtil.error();
		}
	}

	/**
	 * banner详情
	 *
	 * @param queryDto
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/detail", method = RequestMethod.POST)
	public Result detail(@RequestBody QueryDto queryDto) {

		try {
			CatalogModel catalogModel = catalogService.findById(queryDto.getId());

			if(catalogModel == null) {
				return ResponseUtil.error("暂无banner相关信息");
			}

			return ResponseUtil.success(Collections.singletonMap("catalogDetail", catalogModel));
		} catch (Exception e) {
			e.printStackTrace();

			return ResponseUtil.error("系统异常, 请稍后重试。");
		}
	}

}
