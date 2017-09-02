package com.github.zhangkaitao.shiro.chapter2;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Test;

/**
 * Created by Administrator on 2017/9/2 0002.
 */
public class LoginLogoutTest {
    @Test
    public void testAllSuccessfulStrategyWithSuccess(){

    }
    private void login(String configfile){
        //1.获取securityManager工厂，此处使用Ini配置文件初始化securityManager
        Factory<SecurityManager> factory = new IniSecurityManagerFactory();

        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);

        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("zhang","123");

        subject.login(token);
    }
}
