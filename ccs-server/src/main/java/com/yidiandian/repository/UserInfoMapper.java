package com.yidiandian.repository;

import com.yidiandian.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author${罗显}
 * @date 2019/1/8
 * @time 18:19
 */
public interface UserInfoMapper extends JpaRepository<UserInfo,Long> {

}
