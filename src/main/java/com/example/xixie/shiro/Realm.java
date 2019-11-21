package com.example.xixie.shiro;

import com.example.xixie.model.login.AdminUser;
import com.example.xixie.service.login.AdminUserService;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;

/**
 * @Author: chengsh05
 * @Date: 2018/12/18 17:35
 */
public class Realm extends AuthorizingRealm {
    @Resource
    private AdminUserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {//授权
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) {//认证
        String username = (String) token.getPrincipal();
        AdminUser user = userService.findUserByName(username);
        if (user == null) {
            throw new UnknownAccountException();
        }
        String password = user.getPassword();
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(
                username,
                password,
                getName()
        );
        return info;
    }
}
