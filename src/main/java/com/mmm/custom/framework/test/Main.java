package com.mmm.custom.framework.test;

import com.mmm.custom.framework.core.configuration.context.AppContext;
import com.mmm.custom.framework.test.configuration.ApplicationProperties;

public class Main {

    public static void main(String[] args) {
        AppContext appContext = new AppContext("com.mmm.custom.framework.test");

        ApplicationProperties applicationProperties = (ApplicationProperties) appContext
                .getComponentByClass(ApplicationProperties.class);

        System.out.println();
        System.out.println(applicationProperties.getApplicationName());

        System.out.println();
        System.out.println(applicationProperties.getHelloPhrase());
    }
}
