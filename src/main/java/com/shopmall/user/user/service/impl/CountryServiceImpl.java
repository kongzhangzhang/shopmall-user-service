/*
 * 北京果敢时代科技有限公司
 * 北京市朝阳区望京SOHO T3 B座1607
 * 邮编：100022
 * 网址：www.davdian.com
 */

package com.shopmall.user.user.service.impl;

import java.util.List;

import com.shopmall.user.common.baseservice.impl.BaseService;
import com.shopmall.user.user.dao.CountryMapper;
import com.shopmall.user.user.model.CountryModel;
import com.shopmall.user.user.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;

import java.util.*;
import com.shopmall.user.user.dao.*;
import com.shopmall.user.user.service.*;

/**
 * @author  davdian
 * @version 1.0
 * @since 1.0
 */

@Service("countryService")
public class CountryServiceImpl extends BaseService<CountryModel> implements ICountryService {
	@Autowired
	private CountryMapper countryMapper;
	
	@Override
	public CountryModel findById(Integer id) {
		if(id == null) {
			return null;
		}
		return countryMapper.findById(id);
	}


	public List<CountryModel> find(Map<String, Object> param) {
		return countryMapper.find(param);
	}

	@Override
	public PageInfo<CountryModel> selectByFilterAndPage(CountryModel countryModel, int pageNum,
		int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<CountryModel> list = this.selectByFilter(countryModel);
		return new PageInfo<>(list);
	}

	@Override
	public List<CountryModel> selectByFilter(CountryModel countryModel) {
		Example example = new Example(CountryModel.class);
		Example.Criteria criteria = example.createCriteria();

		if(StringUtils.isNotEmpty(countryModel.getSortWithOutOrderBy())) {
			example.setOrderByClause(countryModel.getSortWithOutOrderBy());
		}
		return getMapper().selectByExample(example);
	}
}
