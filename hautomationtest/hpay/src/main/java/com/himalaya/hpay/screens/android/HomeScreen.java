package com.himalaya.hpay.screens.android;

import com.google.inject.Inject;
import com.himalaya.hpay.contract.Home;
import com.himalaya.hpay.helpers.AppiumHelpers;
import com.himalaya.hpay.screens.Base;
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
