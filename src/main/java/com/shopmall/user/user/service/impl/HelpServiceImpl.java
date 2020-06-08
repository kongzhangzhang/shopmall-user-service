/*
 * 北京果敢时代科技有限公司
 * 北京市朝阳区望京SOHO T3 B座1607
 * 邮编：100022
 * 网址：www.davdian.com
 */

package com.shopmall.user.user.service.impl;

import java.util.List;

import com.shopmall.user.common.baseservice.impl.BaseService;
import com.shopmall.user.user.dao.HelpMapper;
import com.shopmall.user.user.model.HelpModel;
import com.shopmall.user.user.service.IHelpService;
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

@Service("helpService")
public class HelpServiceImpl extends BaseService<HelpModel> implements IHelpService {
	@Autowired
	private HelpMapper helpMapper;
	
	@Override
	public HelpModel findById(Integer id) {
		if(id == null) {
			return null;
		}
		return helpMapper.findById(id);
	}


	public List<HelpModel> find(Map<String, Object> param) {
		return helpMapper.find(param);
	}

	@Override
	public PageInfo<HelpModel> selectByFilterAndPage(HelpModel helpModel, int pageNum,
		int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<HelpModel> list = this.selectByFilter(helpModel);
		return new PageInfo<>(list);
	}

	@Override
	public List<HelpModel> selectByFilter(HelpModel helpModel) {
		Example example = new Example(HelpModel.class);
		Example.Criteria criteria = example.createCriteria();

		if(StringUtils.isNotEmpty(helpModel.getSortWithOutOrderBy())) {
			example.setOrderByClause(helpModel.getSortWithOutOrderBy());
		}
		return getMapper().selectByExample(example);
	}
}
