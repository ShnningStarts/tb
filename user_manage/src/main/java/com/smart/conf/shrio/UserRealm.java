package com.smart.conf.shrio;

import com.smart.DTO.UserFindDto;
import com.smart.DTO.UserLogginDto;
import com.smart.DTO.UserSignInDto;
import com.smart.entity.RoleEntity;
import com.smart.entity.UserBaseEntity;
import com.smart.service.UserService;
import com.smart.service.impl.UserServiceImpl;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import java.util.Set;

public class UserRealm extends AuthorizingRealm {
    private UserService userService=new UserServiceImpl();

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String username=(String)principalCollection.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
        authorizationInfo.setRoles(new Set<userService.(username).toString()>);
        authorizationInfo.setStringPermissions(userService.findPermission(username));
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String username=(String)authenticationToken.getPrincipal();
        UserSignInDto  userBaseEntity=userService.findUserById(username);
        if (userBaseEntity == null){
            throw new UnknownAccountException();
        }
        if (Boolean.TRUE.equals(userBaseEntity)){
            throw new LockedAccountException();
        }
        SimpleAuthenticationInfo simpleAuthenticationInfo=new SimpleAuthenticationInfo(userBaseEntity.getUserName(),userBaseEntity.getPassword(), ByteSource.Util.bytes("123"),getName());
        return  simpleAuthenticationInfo;
    }

}
