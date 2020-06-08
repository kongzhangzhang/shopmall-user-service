/*
 * 北京果敢时代科技有限公司
 * 北京市朝阳区望京SOHO T3 B座1607
 * 邮编：100022
 * 网址：www.davdian.com
 */

package com.shopmall.user.user.dao;

import com.shopmall.user.user.model.CatalogModel;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author  davdian
 * @version 1.0
 * @since 1.0
 */

public interface CatalogMapper extends Mapper<CatalogModel> {

	public List<CatalogModel> find(Map<String, Object> param);

	public CatalogModel findById(@Param("id") Integer id);

}
