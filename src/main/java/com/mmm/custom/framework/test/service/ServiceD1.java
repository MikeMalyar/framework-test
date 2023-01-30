package com.mmm.custom.framework.test.service;

import com.mmm.custom.framework.core.configuration.annotations.Component;
import com.mmm.custom.framework.core.configuration.annotations.dependency.InjectComponents;

@Component
public class ServiceD1 {

    private final ServiceB1 serviceB1;
    private final ServiceC1 serviceC1;

    @InjectComponents
    public ServiceD1(ServiceB1 serviceB1, ServiceC1 serviceC1) {
        this.serviceB1 = serviceB1;
        this.serviceC1 = serviceC1;
    }
}
