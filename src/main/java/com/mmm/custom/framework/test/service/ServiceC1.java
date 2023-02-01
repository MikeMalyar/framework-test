package com.mmm.custom.framework.test.service;

import com.mmm.custom.framework.core.configuration.annotations.component.Component;
import com.mmm.custom.framework.core.configuration.annotations.dependency.InjectComponents;

@Component
public class ServiceC1 {

    private final ServiceB2 serviceB2;
    private final ServiceB3 serviceB3;

    @InjectComponents
    public ServiceC1(ServiceB2 serviceB2, ServiceB3 serviceB3) {
        this.serviceB2 = serviceB2;
        this.serviceB3 = serviceB3;
    }
}
