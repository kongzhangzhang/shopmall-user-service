/*
 * 北京果敢时代科技有限公司
 * 北京市朝阳区望京SOHO T3 B座1607
 * 邮编：100022
 * 网址：www.davdian.com
 */

package com.shopmall.user.user.service;

import com.github.pagehelper.PageInfo;
import com.shopmall.user.common.baseservice.IBaseService;
import com.shopmall.user.user.model.CouponModel;

import java.util.List;
import java.util.Map;

/**
 * @author  davdian
 * @version 1.0
 * @since 1.0
 */

public interface ICouponService extends IBaseService<CouponModel> {

	public CouponModel findById(Integer id);

	public List<CouponModel> find(Map<String, Object> param);

	public PageInfo<CouponModel> selectByFilterAndPage(CouponModel couponModel, int pageNum,
                                                       int pageSize);

	public List<CouponModel> selectByFilter(CouponModel couponModel);

}
