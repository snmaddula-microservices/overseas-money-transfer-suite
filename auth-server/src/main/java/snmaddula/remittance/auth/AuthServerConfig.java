package snmaddula.remittance.auth;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;

import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * 
 * @author snmaddula
 *
 */
@Setter
@Configuration
@RequiredArgsConstructor
@ConfigurationProperties("auth.server")
public class AuthServerConfig extends AuthorizationServerConfigurerAdapter {

	private final DataSource dataSource;
	private final AuthenticationManager authenticationManager;
	private String selectClientDetailsSql;
	
	
	
	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		// TODO Auto-generated method stub
		super.configure(endpoints);
	}
	
	@Override
	public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
		// TODO Auto-generated method stub
		super.configure(security);
	}
	
	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.withClientDetails(new JdbcClientDetailsService(dataSource) {{ 
			setSelectClientDetailsSql(selectClientDetailsSql);
		}});
	}
}
