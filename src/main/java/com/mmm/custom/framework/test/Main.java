package com.mmm.custom.framework.test;

import com.mmm.custom.framework.core.configuration.context.AppContext;
import com.mmm.custom.framework.test.configuration.ApplicationProperties;
import com.mmm.custom.framework.test.service.ServiceA1;
import com.mmm.custom.framework.test.service.ServiceD1;

public class Main {

    public static void main(String[] args) {
        AppContext appContext = new AppContext("com.mmm.custom.framework.test");

        ApplicationProperties applicationProperties = (ApplicationProperties) appContext
                .getComponentByClass(ApplicationProperties.class);

        System.out.println();
        System.out.println(applicationProperties.getApplicationName());

        System.out.println();
        System.out.println(applicationProperties.getHelloPhrase());

        System.out.println();
        System.out.println(appContext.getComponentByClass(ServiceA1.class));
        System.out.println(appContext.getComponentByClass(ServiceA1.class));
        System.out.println(appContext.getComponentByClass(ServiceA1.class));

        System.out.println();
        System.out.println(appContext.getComponentByClass(ServiceD1.class));
        System.out.println(appContext.getComponentByClass(ServiceD1.class));
        System.out.println(appContext.getComponentByClass(ServiceD1.class));
    }
}
