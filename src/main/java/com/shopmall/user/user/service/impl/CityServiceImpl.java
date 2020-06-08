/*
 * 北京果敢时代科技有限公司
 * 北京市朝阳区望京SOHO T3 B座1607
 * 邮编：100022
 * 网址：www.davdian.com
 */

package com.shopmall.user.user.service.impl;

import java.util.List;

import com.shopmall.user.common.baseservice.impl.BaseService;
import com.shopmall.user.user.dao.CityMapper;
import com.shopmall.user.user.model.CityModel;
import com.shopmall.user.user.service.ICityService;
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
 * @author davdian
 * @version 1.0
 * @since 1.0
 */

@Service("cityService")
public class CityServiceImpl extends BaseService<CityModel> implements ICityService {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public CityModel findById(Integer id) {
        if (id == null) {
            return null;
        }
        return cityMapper.findById(id);
    }

    public List<CityModel> find(Map<String, Object> param) {
        return cityMapper.find(param);
    }

    @Override
    public PageInfo<CityModel> selectByFilterAndPage(CityModel cityModel, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<CityModel> list = this.selectByFilter(cityModel);
        return new PageInfo<>(list);
    }

    @Override
    public List<CityModel> selectByFilter(CityModel cityModel) {
        Example example = new Example(CityModel.class);
        Example.Criteria criteria = example.createCriteria();

        if(cityModel.getCountryId() != null) {
            criteria.andEqualTo("countryId", cityModel.getCountryId());
        }

        criteria.andEqualTo("isDel", 0);
        criteria.andEqualTo("isOnline", 1);

        if (StringUtils.isNotEmpty(cityModel.getSortWithOutOrderBy())) {
            example.setOrderByClause(cityModel.getSortWithOutOrderBy());
        }
        return getMapper().selectByExample(example);
    }
}
