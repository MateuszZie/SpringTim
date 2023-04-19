package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =  new FileSystemXmlApplicationContext("beans.xml");
        Organization organization = context.getBean(Organization.class);
        organization.someMessage();
        ((FileSystemXmlApplicationContext) context).close();
    }
}