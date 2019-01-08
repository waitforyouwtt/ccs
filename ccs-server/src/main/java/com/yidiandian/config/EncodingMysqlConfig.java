package com.yidiandian.config;

import org.hibernate.dialect.MySQL5InnoDBDialect;

/**
 * @author${罗显}
 * @date 2019/1/8
 * @time 17:15
 */
public class EncodingMysqlConfig extends MySQL5InnoDBDialect {
    @Override
    public String getTableTypeString() {
        return " ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }
}
