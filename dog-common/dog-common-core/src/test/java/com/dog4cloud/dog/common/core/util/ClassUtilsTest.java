package com.dog4cloud.dog.common.core.util;

import org.junit.jupiter.api.Test;
import org.springframework.core.MethodParameter;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;


class ClassUtilsTest {

    @Test
    void getMethodParameter() throws Exception{
        Class c = Class.forName("com.dog4cloud.dog.common.core.util.Apple");
        Constructor constructor = c.getConstructor(String.class,Integer.class);
        System.out.println(constructor);
        Object o = constructor.newInstance("jony",12);
        System.out.println(o);
        Field field = c.getDeclaredField("name");
        System.out.println(field);
        field.setAccessible(true);
        String name = (String) field.get(o);
        System.out.println(name);
        MethodParameter parameter = ClassUtils.getMethodParameter(constructor,0);
        System.out.println(parameter);
    }

    @Test
    void testGetMethodParameter() {
    }

    @Test
    void getAnnotation() {
    }

    @Test
    void testGetAnnotation() {
    }
}