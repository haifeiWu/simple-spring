package com.whforever.simplespring.io;

import java.io.InputStream;

/**
 * 资源定义
 *
 * @author stateis0
 */
public interface Resource {

  /**
   * 获取输入流
   */
  InputStream getInputstream() throws Exception;
}
