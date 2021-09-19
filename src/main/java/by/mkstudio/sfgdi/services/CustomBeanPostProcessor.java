package by.mkstudio.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof LifeCycleDemoBean) {
			System.out.println("## -- Before Initialization --");			
		}
		
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof LifeCycleDemoBean) {
			System.out.println("## -- After Initialization --");
		}
		
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
