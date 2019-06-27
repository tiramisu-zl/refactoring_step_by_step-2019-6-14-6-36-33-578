package com.tws.refactoring;

public class Police {
    public boolean checkDriver(Driver driver) {
        boolean isAdult = isAdult(driver);
        if(isAdult) {
            return true;
        }
        return false;
    }

    private boolean isAdult(Driver driver) {
        return driver.getAge() >= 18;
    }
}
