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
import com.shopmall.user.user.dao.OrderMapper;
import com.shopmall.user.user.model.OrderModel;
import com.shopmall.user.user.service.IOrderService;
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

@Service("orderService")
public class OrderServiceImpl extends BaseService<OrderModel> implements IOrderService {
	@Autowired
	private OrderMapper orderMapper;
	
	@Override
	public OrderModel findById(Integer id) {
		if(id == null) {
			return null;
		}
		return orderMapper.findById(id);
	}


	public List<OrderModel> find(Map<String, Object> param) {
		return orderMapper.find(param);
	}

	@Override
	public PageInfo<OrderModel> selectByFilterAndPage(OrderModel orderModel, int pageNum,
		int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<OrderModel> list = this.selectByFilter(orderModel);
		return new PageInfo<>(list);
	}

	@Override
	public List<OrderModel> selectByFilter(OrderModel orderModel) {
		Example example = new Example(OrderModel.class);
		Example.Criteria criteria = example.createCriteria();

		if(StringUtils.isNotEmpty(orderModel.getSortWithOutOrderBy())) {
			example.setOrderByClause(orderModel.getSortWithOutOrderBy());
		}
		return getMapper().selectByExample(example);
	}
}
