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
import com.shopmall.user.user.dao.CommodityMapper;
import com.shopmall.user.user.model.CommodityModel;
import com.shopmall.user.user.service.ICommodityService;
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

@Service("commodityService")
public class CommodityServiceImpl extends BaseService<CommodityModel> implements ICommodityService {
	@Autowired
	private CommodityMapper commodityMapper;
	
	@Override
	public CommodityModel findById(Integer id) {
		if(id == null) {
			return null;
		}
		return commodityMapper.findById(id);
	}


	public List<CommodityModel> find(Map<String, Object> param) {
		return commodityMapper.find(param);
	}

	@Override
	public PageInfo<CommodityModel> selectByFilterAndPage(CommodityModel commodityModel, int pageNum,
		int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<CommodityModel> list = this.selectByFilter(commodityModel);
		return new PageInfo<>(list);
	}

	@Override
	public List<CommodityModel> selectByFilter(CommodityModel commodityModel) {
		Example example = new Example(CommodityModel.class);
		Example.Criteria criteria = example.createCriteria();

		if(StringUtils.isNotEmpty(commodityModel.getSortWithOutOrderBy())) {
			example.setOrderByClause(commodityModel.getSortWithOutOrderBy());
		}
		return getMapper().selectByExample(example);
	}
}
