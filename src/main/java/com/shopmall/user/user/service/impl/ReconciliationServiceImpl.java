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
import com.shopmall.user.user.dao.ReconciliationMapper;
import com.shopmall.user.user.model.ReconciliationModel;
import com.shopmall.user.user.service.IReconciliationService;
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

@Service("reconciliationService")
public class ReconciliationServiceImpl extends BaseService<ReconciliationModel> implements IReconciliationService {
	@Autowired
	private ReconciliationMapper reconciliationMapper;
	
	@Override
	public ReconciliationModel findById(Integer id) {
		if(id == null) {
			return null;
		}
		return reconciliationMapper.findById(id);
	}


	public List<ReconciliationModel> find(Map<String, Object> param) {
		return reconciliationMapper.find(param);
	}

	@Override
	public PageInfo<ReconciliationModel> selectByFilterAndPage(ReconciliationModel reconciliationModel, int pageNum,
		int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<ReconciliationModel> list = this.selectByFilter(reconciliationModel);
		return new PageInfo<>(list);
	}

	@Override
	public List<ReconciliationModel> selectByFilter(ReconciliationModel reconciliationModel) {
		Example example = new Example(ReconciliationModel.class);
		Example.Criteria criteria = example.createCriteria();

		if(StringUtils.isNotEmpty(reconciliationModel.getSortWithOutOrderBy())) {
			example.setOrderByClause(reconciliationModel.getSortWithOutOrderBy());
		}
		return getMapper().selectByExample(example);
	}
}
