package org.example;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link Application}.
 */
public class Application__BeanDefinitions {
  /**
   * Get the bean definition for 'application'.
   */
  public static BeanDefinition getApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(Application.class);
    beanDefinition.setTargetType(Application.class);
    ConfigurationClassUtils.initializeConfigurationClass(Application.class);
    beanDefinition.setInstanceSupplier(Application$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
