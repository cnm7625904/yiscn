package com.yiscn.projectmanage.di.qualifier;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 通过创建实例来调用，进行业务处理，获取返回值
 * 这个注解应该被 javadoc工具记录
 * 运行时被JVM或其他使用反射机制的代码所读取和使用
 */
@Qualifier
@Documented
@Retention(RUNTIME)
public @interface GankUrl {
}
