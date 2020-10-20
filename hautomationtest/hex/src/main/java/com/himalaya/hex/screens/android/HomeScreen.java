package com.himalaya.hex.screens.android;

import com.google.inject.Inject;
import com.himalaya.hex.contract.Home;
import com.himalaya.hex.helpers.AppiumHelpers;
import com.himalaya.hex.screens.Base;
import io.appium.java_client.AppiumDriver;

public class HomeScreen extends Base implements Home {
    private final AppiumHelpers appiumHelpers;
    private final AppiumDriver appiumDriver;

    @Inject
    public HomeScreen(AppiumDriver appiumDriver, AppiumHelpers appiumHelpers) {
        super(appiumDriver);
        this.appiumDriver = appiumDriver;
        this.appiumHelpers = appiumHelpers;
    }
}
