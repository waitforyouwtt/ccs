package com.yidiandian;

import com.yidiandian.entity.UserInfo;
import com.yidiandian.repository.UserInfoMapper;
import com.yidiandian.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@EntityScan(basePackages = {"com.yidiandian.entity"}, basePackageClasses = Jsr310JpaConverters.class)
@RunWith(SpringRunner.class)
@SpringBootTest
public class CcsServerApplicationTests {

    @Autowired
    UserInfoService userInfoService;

    @Test
    public void contextLoads() {
        UserInfo userInfo = new UserInfo();
     //   List<UserInfo> list = userInfoService.findUsersByParams(userInfo);
        List<UserInfo> list = userInfoService.findAll();
        System.out.println("list:"+list);
    }

}

