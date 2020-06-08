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
import com.shopmall.user.user.dao.ReceivingAddressMapper;
import com.shopmall.user.user.model.ReceivingAddressModel;
import com.shopmall.user.user.service.IReceivingAddressService;
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

@Service("receivingAddressService")
public class ReceivingAddressServiceImpl extends BaseService<ReceivingAddressModel> implements IReceivingAddressService {
	@Autowired
	private ReceivingAddressMapper receivingAddressMapper;
	
	@Override
	public ReceivingAddressModel findById(Integer id) {
		if(id == null) {
			return null;
		}
		return receivingAddressMapper.findById(id);
	}


	public List<ReceivingAddressModel> find(Map<String, Object> param) {
		return receivingAddressMapper.find(param);
	}

	@Override
	public PageInfo<ReceivingAddressModel> selectByFilterAndPage(ReceivingAddressModel receivingAddressModel, int pageNum,
		int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<ReceivingAddressModel> list = this.selectByFilter(receivingAddressModel);
		return new PageInfo<>(list);
	}

	@Override
	public List<ReceivingAddressModel> selectByFilter(ReceivingAddressModel receivingAddressModel) {
		Example example = new Example(ReceivingAddressModel.class);
		Example.Criteria criteria = example.createCriteria();

		if(StringUtils.isNotEmpty(receivingAddressModel.getSortWithOutOrderBy())) {
			example.setOrderByClause(receivingAddressModel.getSortWithOutOrderBy());
		}
		return getMapper().selectByExample(example);
	}
}
