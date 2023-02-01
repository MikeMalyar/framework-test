package com.mmm.custom.framework.test.service;

import com.mmm.custom.framework.core.configuration.annotations.component.Component;
import com.mmm.custom.framework.core.configuration.annotations.dependency.InjectComponents;

@Component
public class ServiceB1 {

    private final ServiceA1 serviceA1;

    @InjectComponents
    public ServiceB1(ServiceA1 serviceA1) {
        this.serviceA1 = serviceA1;
    }
}
