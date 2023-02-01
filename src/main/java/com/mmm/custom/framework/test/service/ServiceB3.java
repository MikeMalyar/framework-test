package com.mmm.custom.framework.test.service;

import com.mmm.custom.framework.core.configuration.annotations.component.Component;
import com.mmm.custom.framework.core.configuration.annotations.dependency.InjectComponents;

@Component(id = "ServiceB3")
public class ServiceB3 {

    private final ServiceA1 serviceA1;
    private final ServiceA3 serviceA3;

    @InjectComponents
    public ServiceB3(ServiceA1 serviceA1, ServiceA3 serviceA3) {
        this.serviceA1 = serviceA1;
        this.serviceA3 = serviceA3;
    }
}
