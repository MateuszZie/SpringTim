package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("beans-cp.xml");
        Organization organization = context.getBean(Organization.class);
        organization.someMessage();
        ((ClassPathXmlApplicationContext) context).close();
    }
}