package com.yidiandian.service;

import com.yidiandian.entity.UserInfo;

import java.util.List;

/**
 * @author${罗显}
 * @date 2019/1/8
 * @time 17:37
 */
public interface UserInfoService {
    /**
     * 根据条件查询用户
     * @return
     */
    List<UserInfo> findUsersByParams(UserInfo userInfo);

    List<UserInfo> findAll();
}
