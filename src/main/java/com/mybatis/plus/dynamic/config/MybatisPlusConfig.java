package com.mybatis.plus.dynamic.config;

import com.baomidou.dynamic.datasource.plugin.MasterSlaveAutoRoutingPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MybatisPlusConfig
 *
 * @author gaoxinzhong
 * @date 2022/2/14 16:54
 **/
@Configuration
public class MybatisPlusConfig {

    /**
     * 自动读写分离
     *
     * @link <a href='https://www.kancloud.cn/tracy5546/dynamic-datasource/2358946'>mybatis下读写分离</a>
     */
    @Bean
    public MasterSlaveAutoRoutingPlugin masterSlaveAutoRoutingPlugin() {
        return new MasterSlaveAutoRoutingPlugin();
    }

}
