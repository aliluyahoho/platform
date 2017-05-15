package com.spring.database.dao;

import com.spring.database.entity.ServiceInfo;

import java.util.List;

public interface ServiceInfoDao {

    int deleteByPrimaryKey(Integer id);

    int deleteByEntity(ServiceInfo record);

    int insertSelective(ServiceInfo record);

    ServiceInfo selectByPrimaryKey(Integer id);

    ServiceInfo selectByEntity(ServiceInfo record);

    List<ServiceInfo> selectAll();

    int updateByPrimaryKeySelective(ServiceInfo record);

    int selectCountById(int id);

    int selectCountByEntity(ServiceInfo record);
}