package com.dog4cloud.dog;

import com.ulisesbocchio.jasyptspringboot.encryptor.DefaultLazyEncryptor;
import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.core.env.StandardEnvironment;

public class EncodeTest {

    @Test
    public void test(){
        System.setProperty("xx", "lengleng");
        StringEncryptor stringEncryptor = new DefaultLazyEncryptor(new StandardEnvironment());

        //加密方法
        System.out.println(stringEncryptor.encrypt("123456"));
        //解密方法
        System.out.println(stringEncryptor.decrypt("saRv7ZnXsNAfsl3AL9OpCQ=="));
    }
}
