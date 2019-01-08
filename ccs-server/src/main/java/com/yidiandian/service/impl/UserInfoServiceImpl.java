package com.yidiandian.service.impl;

import com.yidiandian.dao.UserInfoDao;
import com.yidiandian.entity.UserInfo;
import com.yidiandian.repository.UserInfoMapper;
import com.yidiandian.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author${罗显}
 * @date 2019/1/8
 * @time 17:37
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoDao userInfoDao;
    @Autowired
    UserInfoMapper userInfoMapper;
    @Override
    public List<UserInfo> findUsersByParams(UserInfo userInfo) {
        return userInfoDao.findUsersByParams(userInfo);
    }

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.findAll();
    }
}
