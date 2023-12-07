package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


/**
 * @author 高子航
 */
@Configuration
public class SecurityConfig {
    
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    @Bean
    protected SecurityFilterChain configure(HttpSecurity http) throws Exception {
        
        // 设置权限, 除了 login 和 register 接口, 其他都需要身份验证
        http
                .authorizeHttpRequests((authorize) -> authorize
                        .requestMatchers("/user/login", "/user/register").permitAll()
                        .anyRequest().authenticated()
                );
        
        // 关闭 CSRF 保护
        http.csrf(AbstractHttpConfigurer::disable);
        
        return http.build();
    }
}

