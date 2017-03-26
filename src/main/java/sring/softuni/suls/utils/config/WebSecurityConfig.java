package sring.softuni.suls.utils.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import sring.softuni.suls.services.user.UserService;
import sring.softuni.suls.utils.constants.URIMappings;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private static final String ADMIN_USERNAME_FIELD = "username";
    private static final String ADMIN_PASSWORD_FIELD = "password";

    @Autowired
    private UserService userService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .headers()
                .frameOptions().sameOrigin();

//        http
//                .csrf()
//                .ignoringAntMatchers(URIMappings.URI_ARTICLE_PICTURE_UPLOAD)
//                .ignoringAntMatchers(URIMappings.URI_RECIPES_PICTURE_UPLOAD);


        http
                .authorizeRequests()
                .antMatchers("/").access("authenticated")
                .and()
                .formLogin()
                .loginPage(URIMappings.LOGIN)
                .loginProcessingUrl(URIMappings.LOGIN)
                .defaultSuccessUrl(URIMappings.HOME)
                .failureUrl("/loginError")
                .usernameParameter(ADMIN_USERNAME_FIELD)
                .passwordParameter(ADMIN_PASSWORD_FIELD)
                .permitAll()
                .and()
                .logout()
                .logoutUrl(URIMappings.LOGOUT)
                .logoutSuccessUrl(URIMappings.HOME)
                .and()
                .rememberMe();
    }


    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService)
                .passwordEncoder(new BCryptPasswordEncoder());
    }
}