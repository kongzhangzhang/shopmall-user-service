/*
 * 北京果敢时代科技有限公司
 * 北京市朝阳区望京SOHO T3 B座1607
 * 邮编：100022
 * 网址：www.davdian.com
 */

package com.shopmall.user.user.service.impl;

import java.util.List;

import com.shopmall.user.common.baseservice.impl.BaseService;
import com.shopmall.user.user.dao.FeedbackMapper;
import com.shopmall.user.user.model.FeedbackModel;
import com.shopmall.user.user.service.IFeedbackService;
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

@Service("feedbackService")
public class FeedbackServiceImpl extends BaseService<FeedbackModel> implements IFeedbackService {
	@Autowired
	private FeedbackMapper feedbackMapper;
	
	@Override
	public FeedbackModel findById(Integer id) {
		if(id == null) {
			return null;
		}
		return feedbackMapper.findById(id);
	}


	public List<FeedbackModel> find(Map<String, Object> param) {
		return feedbackMapper.find(param);
	}

	@Override
	public PageInfo<FeedbackModel> selectByFilterAndPage(FeedbackModel feedbackModel, int pageNum,
		int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<FeedbackModel> list = this.selectByFilter(feedbackModel);
		return new PageInfo<>(list);
	}

	@Override
	public List<FeedbackModel> selectByFilter(FeedbackModel feedbackModel) {
		Example example = new Example(FeedbackModel.class);
		Example.Criteria criteria = example.createCriteria();

		if(StringUtils.isNotEmpty(feedbackModel.getSortWithOutOrderBy())) {
			example.setOrderByClause(feedbackModel.getSortWithOutOrderBy());
		}
		return getMapper().selectByExample(example);
	}
}
