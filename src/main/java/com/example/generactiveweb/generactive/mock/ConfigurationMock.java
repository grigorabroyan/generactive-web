package com.example.generactiveweb.generactive.mock;



import com.example.generactiveweb.generactive.model.Configuration;
import com.example.generactiveweb.generactive.model.Resolution;

import java.util.Random;

public final class ConfigurationMock {

    public static Configuration getConfiguration() {
        return new Configuration(Resolution.values()[new Random().nextInt(Resolution.values().length - 1)]);
    }

    private ConfigurationMock() {

    }
}
