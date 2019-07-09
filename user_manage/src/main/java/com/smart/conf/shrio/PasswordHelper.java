package com.smart.conf.shrio;

import com.smart.entity.UserBaseEntity;
import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class PasswordHelper {
    private RandomNumberGenerator randomNumberGenerator=new SecureRandomNumberGenerator();
    private String algorithName="md5";
    private final int hashIntertions=2;
    public void encryPassword(UserBaseEntity entity){

        entity.setPassword(new SimpleHash(algorithName,entity.getPassword(), ByteSource.Util.bytes("132"),hashIntertions).toHex());

    }
}
