package com.ltp.spring_boot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = "classpath:app.properties")
public class AppConfig {

    @Value("${app.config.name}")
    private String name;

    @Autowired
    Environment environment;

    @Value("${app.config.password}")
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "AppConfig{" +
            "name='" + name + '\'' +
            ", password='" + password + '\'' +
            '}';
    }
}
