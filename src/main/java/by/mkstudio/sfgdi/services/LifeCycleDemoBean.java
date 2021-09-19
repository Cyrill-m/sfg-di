package by.mkstudio.sfgdi.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
		BeanFactoryAware, ApplicationContextAware {
	
	public LifeCycleDemoBean() {
		System.out.println("## LifeCycleDemoBean Constructor");		
	}

	//InitializingBean Interface
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("## LifeCycleDemoBean has its Properties Set");		
	}

	//DisposableBean Interface
	@Override
	public void destroy() throws Exception {
		System.out.println("## LifeCycleDemoBean has been Terminated");		
	}

	//BeanNameAware Interface
	@Override
	public void setBeanName(String name) {
		System.out.println("## My Bean Name is " + name);		
	}

	//ApplicationContextAware Interface
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("## ApplicationContext has been Set");		
	}

	//BeanFactoryAware Interface
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("## BeanFactory has been Set");		
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("## The @PostConstruct annotated method has been calling");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("## The @PreDestroy annotated method has been calling");
	}

}
