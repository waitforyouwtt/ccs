package com.yidiandian.dao;

import com.yidiandian.entity.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author${罗显}
 * @date 2019/1/8
 * @time 17:28
 */
@Repository
public interface UserInfoDao {
    /**
     * 根据条件查询用户
     * @return
     */
    List<UserInfo> findUsersByParams(UserInfo userInfo);

}
