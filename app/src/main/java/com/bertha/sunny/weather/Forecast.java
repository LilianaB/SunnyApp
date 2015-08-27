package com.bertha.sunny.weather;

/**
 * Created by liliana on 27/08/15.
 */
public class Forecast {
    public Current getCurrent() {
        return mCurrent;
    }

    public void setCurrent(Current current) {
        mCurrent = current;
    }

    public Day[] getDailyForecast() {
        return mDailyForecast;
    }

    public void setDailyForecast(Day[] dailyForecast) {
        mDailyForecast = dailyForecast;
    }

    public Hour[] getHourlyForecast() {
        return mHourlyForecast;
    }

    public void setHourlyForecast(Hour[] hourlyForecast) {
        mHourlyForecast = hourlyForecast;
    }

    private Current mCurrent;
    private Day[] mDailyForecast;
    private Hour[] mHourlyForecast;
}
