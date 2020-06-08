/*
 * 北京果敢时代科技有限公司
 * 北京市朝阳区望京SOHO T3 B座1607
 * 邮编：100022
 * 网址：www.davdian.com
 */

package com.shopmall.user.user.service;

import com.shopmall.user.common.baseservice.IBaseService;
import com.shopmall.user.user.model.CountryModel;
import com.github.pagehelper.PageInfo;
import java.util.*;
import com.shopmall.user.user.dao.*;
import com.shopmall.user.user.service.*;

/**
 * @author  davdian
 * @version 1.0
 * @since 1.0
 */

public interface ICountryService extends IBaseService<CountryModel> {

	public CountryModel findById(Integer id);

	public List<CountryModel> find(Map<String, Object> param);

	public PageInfo<CountryModel> selectByFilterAndPage(CountryModel countryModel, int pageNum, int pageSize);

	public List<CountryModel> selectByFilter(CountryModel countryModel);

}
