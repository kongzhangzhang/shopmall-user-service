/*
 * 北京果敢时代科技有限公司
 * 北京市朝阳区望京SOHO T3 B座1607
 * 邮编：100022
 * 网址：www.davdian.com
 */

package com.shopmall.user.user.service.impl;

import java.util.List;

import com.shopmall.user.common.baseservice.impl.BaseService;
import com.shopmall.user.user.dao.LabelMapper;
import com.shopmall.user.user.model.LabelModel;
import com.shopmall.user.user.service.ILabelService;
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

@Service("labelService")
public class LabelServiceImpl extends BaseService<LabelModel> implements ILabelService {
	@Autowired
	private LabelMapper labelMapper;
	
	@Override
	public LabelModel findById(Integer id) {
		if(id == null) {
			return null;
		}
		return labelMapper.findById(id);
	}


	public List<LabelModel> find(Map<String, Object> param) {
		return labelMapper.find(param);
	}

	@Override
	public PageInfo<LabelModel> selectByFilterAndPage(LabelModel labelModel, int pageNum,
		int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<LabelModel> list = this.selectByFilter(labelModel);
		return new PageInfo<>(list);
	}

	@Override
	public List<LabelModel> selectByFilter(LabelModel labelModel) {
		Example example = new Example(LabelModel.class);
		Example.Criteria criteria = example.createCriteria();

		if(StringUtils.isNotEmpty(labelModel.getSortWithOutOrderBy())) {
			example.setOrderByClause(labelModel.getSortWithOutOrderBy());
		}
		return getMapper().selectByExample(example);
	}


	public List<LabelModel> findByCompanyId(Integer companyId) {
		if(companyId == null || companyId == 0) {
			return Collections.emptyList();
		}

		return labelMapper.findByCompanyId(companyId);
	}


	public List<LabelModel> findByCityId(Integer cityId) {
		if(cityId == null || cityId == 0) {
			return Collections.emptyList();
		}

		return labelMapper.findByCityId(cityId);
	}


}
