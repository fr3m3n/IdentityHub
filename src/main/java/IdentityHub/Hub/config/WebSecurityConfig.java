//package IdentityHub.Hub.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//public class WebSecurityConfig {
//    // some of the original code was omitted for brevity
//
//    private static final String[] WHITE_LIST_URLS = {
//            "/register",
//            "/api/v1/getUsers"
//    };
//
//    @Bean
//    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests()
//                .requestMatchers(WHITE_LIST_URLS)
//                .permitAll()
//                .and()
//                .authorizeHttpRequests()
//                .requestMatchers(new AntPathRequestMatcher("/h2-console/**"))
//                .permitAll();
//        http.csrf().disable();
//
//        return http.build();
//    }
//}