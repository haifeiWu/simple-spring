package com.whforever.simplespring;

import com.whforever.simplespring.io.ResourceLoader;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 抽象的bean定义读取类
 *
 * @author wuhf
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

  /**
   * 注册bean容器
   */
  private Map<String, BeanDefinition> registry;

  /**
   * 资源加载器
   */
  private ResourceLoader resourceLoader;

  /**
   * 构造器器必须有一个资源加载器， 默认插件创建一个map容器
   *
   * @param resourceLoader 资源加载器
   */
  protected AbstractBeanDefinitionReader(ResourceLoader resourceLoader) {
    this.registry = new ConcurrentHashMap<>();
    this.resourceLoader = resourceLoader;
  }

  /**
   * 获取容器
   */
  public Map<String, BeanDefinition> getRegistry() {
    return registry;
  }

  /**
   * 获取资源加载器
   */
  public ResourceLoader getResourceLoader() {
    return resourceLoader;
  }

}
