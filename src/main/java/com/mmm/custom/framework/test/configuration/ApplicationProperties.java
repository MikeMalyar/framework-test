package com.mmm.custom.framework.test.configuration;

import com.mmm.custom.framework.core.configuration.annotations.Component;
import com.mmm.custom.framework.core.property.BaseApplicationProperties;
import com.mmm.custom.framework.core.property.PropertyValue;

@Component
public class ApplicationProperties extends BaseApplicationProperties {

    @PropertyValue(propertyName = "phrase.hello", defaultValue = "Hello, World!")
    private String helloPhrase;

    public String getHelloPhrase() {
        return helloPhrase;
    }
}
