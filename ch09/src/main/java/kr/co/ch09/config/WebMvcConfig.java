package kr.co.ch09.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    /*
    * CORS 설정
    * - Cross-Origin-Resource-sharing
    * - 웹 애플리케이션에서 다른 도메인의 리소스에 접근하는 HTTP 정책
    * - 기본적으로 보안상의 이유로 다른 도메인의 리소스 접근을 차단
    * - API 서비스 하기위해 CORS 정책 허용
    * */


    @Override
    public void addCorsMappings(CorsRegistry registry) {

        registry
                .addMapping("/**")
                .allowedOriginPatterns("*")
                .allowedMethods("GET","POST","PUT","DELETE","OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true)
                .maxAge(3600);
    }
}
