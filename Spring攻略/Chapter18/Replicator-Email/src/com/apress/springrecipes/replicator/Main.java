package com.apress.springrecipes.replicator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
            new ClassPathXmlApplicationContext("beans.xml");

        ErrorNotifier errorNotifier =
            (ErrorNotifier) context.getBean("errorNotifier");
        errorNotifier.notifyCopyError(
            "c:/documents", "d:/documents", "spring.doc");
    }
}
