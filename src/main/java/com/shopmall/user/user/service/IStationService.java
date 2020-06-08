/*
 * 北京果敢时代科技有限公司
 * 北京市朝阳区望京SOHO T3 B座1607
 * 邮编：100022
 * 网址：www.davdian.com
 */

package com.shopmall.user.user.service;

import com.shopmall.user.common.baseservice.IBaseService;
import com.shopmall.user.user.model.StationModel;
import com.github.pagehelper.PageInfo;
import java.util.*;
import com.shopmall.user.user.dao.*;
import com.shopmall.user.user.service.*;

/**
 * @author  davdian
 * @version 1.0
 * @since 1.0
 */

public interface IStationService extends IBaseService<StationModel> {

	public StationModel findById(Integer id);

	public List<StationModel> find(Map<String, Object> param);

	public PageInfo<StationModel> selectByFilterAndPage(StationModel stationModel, int pageNum, int pageSize);

	public List<StationModel> selectByFilter(StationModel stationModel);

	public StationModel findByCityId(Integer cityId);
}
