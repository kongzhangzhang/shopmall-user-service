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
import com.shopmall.user.user.dao.SupplierMapper;
import com.shopmall.user.user.model.SupplierModel;
import com.shopmall.user.user.service.ISupplierService;
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

@Service("supplierService")
public class SupplierServiceImpl extends BaseService<SupplierModel> implements ISupplierService {
	@Autowired
	private SupplierMapper supplierMapper;
	
	@Override
	public SupplierModel findById(Integer id) {
		if(id == null) {
			return null;
		}
		return supplierMapper.findById(id);
	}


	public List<SupplierModel> find(Map<String, Object> param) {
		return supplierMapper.find(param);
	}

	@Override
	public PageInfo<SupplierModel> selectByFilterAndPage(SupplierModel supplierModel, int pageNum,
		int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<SupplierModel> list = this.selectByFilter(supplierModel);
		return new PageInfo<>(list);
	}

	@Override
	public List<SupplierModel> selectByFilter(SupplierModel supplierModel) {
		Example example = new Example(SupplierModel.class);
		Example.Criteria criteria = example.createCriteria();

		if(StringUtils.isNotEmpty(supplierModel.getSortWithOutOrderBy())) {
			example.setOrderByClause(supplierModel.getSortWithOutOrderBy());
		}
		return getMapper().selectByExample(example);
	}
}
