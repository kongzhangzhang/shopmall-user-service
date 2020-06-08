/*
 * 北京果敢时代科技有限公司
 * 北京市朝阳区望京SOHO T3 B座1607
 * 邮编：100022
 * 网址：www.davdian.com
 */

package com.shopmall.user.user.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shopmall.user.common.baseservice.impl.BaseService;
import com.shopmall.user.user.dao.CouponMapper;
import com.shopmall.user.user.model.CouponModel;
import com.shopmall.user.user.service.ICouponService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Map;

/**
 * @author  davdian
 * @version 1.0
 * @since 1.0
 */

@Service("couponService")
public class CouponServiceImpl extends BaseService<CouponModel> implements ICouponService {
	@Autowired
	private CouponMapper couponMapper;
	
	@Override
	public CouponModel findById(Integer id) {
		if(id == null) {
			return null;
		}
		return couponMapper.findById(id);
	}


	public List<CouponModel> find(Map<String, Object> param) {
		return couponMapper.find(param);
	}

	@Override
	public PageInfo<CouponModel> selectByFilterAndPage(CouponModel couponModel, int pageNum,
		int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<CouponModel> list = this.selectByFilter(couponModel);
		return new PageInfo<>(list);
	}

	@Override
	public List<CouponModel> selectByFilter(CouponModel couponModel) {
		Example example = new Example(CouponModel.class);
		Example.Criteria criteria = example.createCriteria();

		if(StringUtils.isNotEmpty(couponModel.getSortWithOutOrderBy())) {
			example.setOrderByClause(couponModel.getSortWithOutOrderBy());
		}
		return getMapper().selectByExample(example);
	}
}
