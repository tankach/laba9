/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package security;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
/**
 *
 * @author tanka
 */
@Configuration
public class AppSecurityConfig{
    @Autowired
    private UserDetailsService userDetailsService;
   
    
    @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
      //TODO: fix accesing restricted pages via direct link in adress
       http.csrf((csrf) -> csrf.disable())
            .authorizeHttpRequests((requests)->requests
                        .requestMatchers("/","/registration","/signup",
                                "/view/**","/StudentAdd","/UserContent").authenticated()
                        .requestMatchers("/login").permitAll())
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());
        return http.build();

  }
  
  
  @Bean
  public DaoAuthenticationProvider authenticationProvider() {
      DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
       
      authProvider.setUserDetailsService(userDetailsService);
      authProvider.setPasswordEncoder(new BCryptPasswordEncoder());
   
      return authProvider;
  }

}
