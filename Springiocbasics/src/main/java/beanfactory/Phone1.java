package beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Phone1 {
	public static void main(String[] args) {
		ClassPathResource classPathResource=new ClassPathResource("iocbeanfactory.xml");
		BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
		MusicPlayer musicPlayer=(MusicPlayer) beanFactory.getBean("abc");
		musicPlayer.play();
	}
	

}
