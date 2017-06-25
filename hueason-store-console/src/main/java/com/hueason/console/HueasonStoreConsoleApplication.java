package com.hueason.console;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.servlet.MultipartConfigElement;

/**
 * DESCRIPTION
 *
 * @Author hueason
 * @create 2017-06-24 15:53
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class HueasonStoreConsoleApplication {
    public static void main(String[] args) {
        SpringApplication.run(HueasonStoreConsoleApplication.class, args);
    }

    /**
     * 文件上传配置
     * @return
     */
//    @Bean
//    public MultipartConfigElement multipartConfigElement() {
//        MultipartConfigFactory factory = new MultipartConfigFactory();
//        //文件最大
//        factory.setMaxFileSize("10240KB"); //KB,MB
//        /// 设置总上传数据总大小
//        factory.setMaxRequestSize("102400KB");
//        return factory.createMultipartConfig();
//    }

}
