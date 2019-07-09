package test;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.realm.Realm;

public class reaml1 implements Realm {
    @Override
    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        return new SimpleAuthenticationInfo("yang","biao",getName());
    }

    @Override
    public String getName() {
        return "a";
    }

    @Override
    public boolean supports(AuthenticationToken token) {
        return false;
    }
}
