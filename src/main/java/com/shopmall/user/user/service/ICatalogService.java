/*
 * 北京果敢时代科技有限公司
 * 北京市朝阳区望京SOHO T3 B座1607
 * 邮编：100022
 * 网址：www.davdian.com
 */

package com.shopmall.user.user.service;

import com.github.pagehelper.PageInfo;
import com.shopmall.user.common.baseservice.IBaseService;
import com.shopmall.user.user.model.CatalogModel;

import java.util.List;
import java.util.Map;

/**
 * @author  davdian
 * @version 1.0
 * @since 1.0
 */

public interface ICatalogService extends IBaseService<CatalogModel> {

	public CatalogModel findById(Integer id);

	public List<CatalogModel> find(Map<String, Object> param);

	public PageInfo<CatalogModel> selectByFilterAndPage(CatalogModel catalogModel, int pageNum,
                                                        int pageSize);

	public List<CatalogModel> selectByFilter(CatalogModel catalogModel);

}
