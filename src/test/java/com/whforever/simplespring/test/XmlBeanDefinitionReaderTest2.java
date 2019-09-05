package com.whforever.simplespring.test;

import com.whforever.simplespring.BeanDefinition;
import com.whforever.simplespring.factory.AutowireBeanFactory;
import com.whforever.simplespring.factory.BeanFactory;
import com.whforever.simplespring.io.ResourceLoader;
import com.whforever.simplespring.xml.XmlBeanDefinitionReader;
import org.junit.Test;

import java.util.Map;

public class XmlBeanDefinitionReaderTest2 {

  @Test
  public void test() throws Exception {
    // 创建一个XML解析器，携带一个资源加载器
    XmlBeanDefinitionReader xml = new XmlBeanDefinitionReader(new ResourceLoader());
    // 解析该文件
    xml.readerXML("myspring2.xml");

    // 创建一个自动注入bean工厂
    BeanFactory beanfactory = new AutowireBeanFactory();
    // 循环xml中的所有bean
    for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xml.getRegistry().entrySet()) {
      // 将XML容器中的bean注册到bean工厂
      beanfactory
          .registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
    }

    beanfactory.getBean("c");
  }
}
