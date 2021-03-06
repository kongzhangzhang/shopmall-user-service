/*
 * 北京果敢时代科技有限公司
 * 北京市朝阳区望京SOHO T3 B座1607
 * 邮编：100022
 * 网址：www.davdian.com
 */

package com.shopmall.user.user.dao;
import com.shopmall.user.user.model.LabelModel;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.*;
import com.shopmall.user.user.dao.*;
import com.shopmall.user.user.service.*;

/**
 * @author  davdian
 * @version 1.0
 * @since 1.0
 */

public interface LabelMapper extends Mapper<LabelModel> {

	public List<LabelModel> find(Map<String, Object> param);

	public LabelModel findById(@Param("id") Integer id);

	public List<LabelModel> findByCompanyId(@Param("companyId")Integer companyId);

	public List<LabelModel> findByCityId(@Param("cityId")Integer cityId);
}
