package top.langxecho.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 19086
 * @version 1.0
 * Create by 2024/11/9 18:58
 */
@SpringBootApplication
@MapperScan("top.langxecho.*.*.mapper")
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class,args);
    }
}
