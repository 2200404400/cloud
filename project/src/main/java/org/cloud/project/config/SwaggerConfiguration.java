package org.cloud.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author ting
 * @date 2022/11/29
 */
@Configuration
public class SwaggerConfiguration {
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)    //创建Docket对象
                .enable(true)                                                //SwaggerUI的开关
                .groupName("test")                                                                //分组名称
                .apiInfo(new ApiInfoBuilder()                                                   //SwaggerUi设置
                        .contact(new Contact("", "", ""))                            //name: 网页或邮箱名称, rul: 网页, email: 邮箱
                        .title("")                                                                //大标题
                        .description("")                                                        //小标题
                        .version("")                                                            //版本
                        .build()                                                                //完成后必须得构建, 否则配置不生效);
                )

                //RequestHandlerSelectors   为扫描方式
                //  basePackage                 扫描包
                //  any                         全部扫描
                //  none                        不扫描
                //  withClassAnnotation         扫描类上有这个注解的接口
                //  withMethodAnnotation        扫描方法上有这个注解的接口
                //扫描器
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.ting.app.grandpalace"))            //扫描
                .paths(PathSelectors.any())                                                        //过滤
                .build();                                                                        //构建
    }
}