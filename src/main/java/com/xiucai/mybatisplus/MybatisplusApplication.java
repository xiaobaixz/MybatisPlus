package com.xiucai.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author xiucai
 * @date 2022/12/25 11:21
 * @description 项目工程的启动类
 */
@SpringBootApplication
@MapperScan("com.xiucai.mybatisplus.mapper")
public class MybatisplusApplication {

    public static void main(String[] args) throws UnknownHostException {

        ConfigurableApplicationContext application = SpringApplication.run(MybatisplusApplication.class, args);
        Environment env = application.getEnvironment();
        String ip = InetAddress.getLocalHost().getHostAddress();
        String port = env.getProperty("server.port");
        String property = env.getProperty("server.servlet.context-path");
        String path = property == null ? "" : property;

        System.out.println(
                "\n" +
                        "----------------------------------------------------------\n\t" +
                        "Application is running! Access URLs:\n\t" +
                        "Local: \t\thttp://localhost:" + port + path + "\n\t" +
                        "External: \thttp://" + ip + ":" + port + path + "\n" +
                        "----------------------------------------------------------\n");

    }


}
