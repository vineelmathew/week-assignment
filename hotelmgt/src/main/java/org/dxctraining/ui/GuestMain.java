package org.dxctraining.ui;

import org.dxctraining.Configure;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GuestMain {
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Configure.class);
        context.refresh();
    }
}
