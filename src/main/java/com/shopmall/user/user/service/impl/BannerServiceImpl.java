/*
 * 北京果敢时代科技有限公司
 * 北京市朝阳区望京SOHO T3 B座1607
 * 邮编：100022
 * 网址：www.davdian.com
 */

package com.shopmall.user.user.service.impl;


import com.shopmall.user.common.baseservice.impl.BaseService;
import com.shopmall.user.user.dao.BannerMapper;
import com.shopmall.user.user.model.BannerModel;
import com.shopmall.user.user.service.IBannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang.StringUtils;


import java.util.List;
import java.util.Map;

/**
 * @author  davdian
 * @version 1.0
 * @since 1.0
 */

@Service("bannerService")
public class BannerServiceImpl extends BaseService<BannerModel> implements IBannerService {
	@Autowired
	private BannerMapper bannerMapper;
	
	@Override
	public BannerModel findById(Integer id) {
		if(id == null) {
			return null;
		}
		return bannerMapper.findById(id);
	}


	public List<BannerModel> find(Map<String, Object> param) {
		return bannerMapper.find(param);
	}

	@Override
	public PageInfo<BannerModel> selectByFilterAndPage(BannerModel bannerModel, int pageNum,
		int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<BannerModel> list = this.selectByFilter(bannerModel);
		return new PageInfo<>(list);
	}

	@Override
	public List<BannerModel> selectByFilter(BannerModel bannerModel) {
		Example example = new Example(BannerModel.class);
		Example.Criteria criteria = example.createCriteria();

		if(StringUtils.isNotEmpty(bannerModel.getSortWithOutOrderBy())) {
			example.setOrderByClause(bannerModel.getSortWithOutOrderBy());
		}
		return getMapper().selectByExample(example);
	}
}
