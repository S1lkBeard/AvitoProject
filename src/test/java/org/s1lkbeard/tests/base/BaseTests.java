package org.s1lkbeard.tests.base;

import org.junit.After;
import org.junit.Before;
import org.s1lkbeard.framework.managers.DriverManager;

public class BaseTests {
    private final DriverManager driverManager = DriverManager.getDriverManager();

    @Before
    public void startDriver() {
        String baseUrl = "https://www.avito.ru/penza/transport?cd=1";
        driverManager.getDriver().get(baseUrl);
    }

    @After
    public void endDriver() {
        driverManager.quitDriver();
    }
}
