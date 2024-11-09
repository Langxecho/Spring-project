package top.langxecho.config.swagger;

/**
 * @author 19086
 * @version 1.0
 * Create by 2024/11/9 19:13
 */

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("通用权限管理系统API")
                        .contact(new Contact().name("langxecho").email("16422802.@qq.com"))
                        .version("1.0")
                        .description("通用权限管理系统接口文档")
                        .license(new License().name("Apache 2.0").url("http://doc.xiaominfo.com")));
    }
}

