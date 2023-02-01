package com.mmm.custom.framework.test.service;

import com.mmm.custom.framework.core.configuration.annotations.component.Component;
import com.mmm.custom.framework.core.configuration.annotations.dependency.InjectComponents;

@Component
public class ServiceB2 {

    private final ServiceA1 serviceA1;
    private final ServiceA2 serviceA2;

    @InjectComponents
    public ServiceB2(ServiceA1 serviceA1, ServiceA2 serviceA2) {
        this.serviceA1 = serviceA1;
        this.serviceA2 = serviceA2;
    }
}
