package com.ferdinand.blog.tutorials;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "db")
public class DatabaseConfig {


    private String url;
    private String username;
    private String password;
    private Integer connectionPool;

    //Getters & Setters
    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Integer getConnectionPool() {
        return connectionPool;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConnectionPool(Integer connectionPool) {
        this.connectionPool = connectionPool;
    }


    //Create toString to allow printing object
    @Override
    public String toString() {
        return "DatabaseConfig{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", connectionPool=" + connectionPool +
                '}';
    }
}

