package com.whforever.simplespring;

/**
 * 从配置中读取BeanDefinition
 */
public interface BeanDefinitionReader {
    void loadBeanDefinitions(String location) throws Exception;
}
