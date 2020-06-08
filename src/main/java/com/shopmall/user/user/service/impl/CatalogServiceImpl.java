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
import com.shopmall.user.user.dao.CatalogMapper;
import com.shopmall.user.user.model.CatalogModel;
import com.shopmall.user.user.service.ICatalogService;
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

@Service("catalogService")
public class CatalogServiceImpl extends BaseService<CatalogModel> implements ICatalogService {
	@Autowired
	private CatalogMapper catalogMapper;
	
	@Override
	public CatalogModel findById(Integer id) {
		if(id == null) {
			return null;
		}
		return catalogMapper.findById(id);
	}


	public List<CatalogModel> find(Map<String, Object> param) {
		return catalogMapper.find(param);
	}

	@Override
	public PageInfo<CatalogModel> selectByFilterAndPage(CatalogModel catalogModel, int pageNum,
		int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<CatalogModel> list = this.selectByFilter(catalogModel);
		return new PageInfo<>(list);
	}

	@Override
	public List<CatalogModel> selectByFilter(CatalogModel catalogModel) {
		Example example = new Example(CatalogModel.class);
		Example.Criteria criteria = example.createCriteria();

		if(StringUtils.isNotEmpty(catalogModel.getSortWithOutOrderBy())) {
			example.setOrderByClause(catalogModel.getSortWithOutOrderBy());
		}
		return getMapper().selectByExample(example);
	}
}
