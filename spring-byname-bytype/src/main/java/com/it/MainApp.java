package com.it;

import com.it.entity.Home;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
public class MainApp {
    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory
                (new ClassPathResource("Beans.xml"));
        Home obj = (Home) factory.getBean("Home");
        obj.getDog().talk();
        System.out.println("name is "+obj.getDog().getName());
    }
}