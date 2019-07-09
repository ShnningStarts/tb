package com.smart.conf.shrio;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.apache.shiro.authc.Authenticator;
import org.apache.shiro.authc.pam.AuthenticationStrategy;
import org.apache.shiro.authc.pam.ModularRealmAuthenticator;
import org.apache.shiro.authz.Authorizer;
import org.apache.shiro.authz.permission.PermissionResolver;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShiroManage {
    @Autowired
    DefaultSecurityManager securityManager;
    @Autowired
    ModularRealmAuthenticator authenticator;



}
