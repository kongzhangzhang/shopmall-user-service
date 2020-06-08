/*
 * 北京果敢时代科技有限公司
 * 北京市朝阳区望京SOHO T3 B座1607
 * 邮编：100022
 * 网址：www.davdian.com
 */

package com.shopmall.user.user.service.impl;

import java.util.List;

import com.shopmall.user.common.baseservice.impl.BaseService;
import com.shopmall.user.user.dao.SystemVersionMapper;
import com.shopmall.user.user.model.SystemVersionModel;
import com.shopmall.user.user.service.ISystemVersionService;
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

@Service("systemVersionService")
public class SystemVersionServiceImpl extends BaseService<SystemVersionModel> implements ISystemVersionService {
	@Autowired
	private SystemVersionMapper systemVersionMapper;
	
	@Override
	public SystemVersionModel findById(Integer id) {
		if(id == null) {
			return null;
		}
		return systemVersionMapper.findById(id);
	}


	public List<SystemVersionModel> find(Map<String, Object> param) {
		return systemVersionMapper.find(param);
	}

	@Override
	public PageInfo<SystemVersionModel> selectByFilterAndPage(SystemVersionModel systemVersionModel, int pageNum,
		int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<SystemVersionModel> list = this.selectByFilter(systemVersionModel);
		return new PageInfo<>(list);
	}

	@Override
	public List<SystemVersionModel> selectByFilter(SystemVersionModel systemVersionModel) {
		Example example = new Example(SystemVersionModel.class);
		Example.Criteria criteria = example.createCriteria();

		if(StringUtils.isNotEmpty(systemVersionModel.getSortWithOutOrderBy())) {
			example.setOrderByClause(systemVersionModel.getSortWithOutOrderBy());
		}
		return getMapper().selectByExample(example);
	}
}
