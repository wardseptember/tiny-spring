package org.springframework.context;

import org.springframework.beans.factory.HierarchicalBeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.core.io.ResourceLoader;

/**
 * 应用上下文
 *
 * @author wardseptember
 * @create 2021-01-26 10:04
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {

}
