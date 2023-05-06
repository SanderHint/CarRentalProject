package configuration;

import org.springframework.security.config.annotation.AbstractConfiguredSecurityBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;

public class WebSecurityConfigurer<H extends AbstractConfiguredSecurityBuilder<DefaultSecurityFilterChain, HttpSecurity>> {
}
