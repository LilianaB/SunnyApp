package com.bertha.sunny.weather;

import com.bertha.sunny.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by liliana on 07/08/15.
 */
public class Current {
    private String mIcon;
    private long mTime;
    private double mTemperature;
    private double mHumidity;
    private double mprecipProbability;
    private String mSummary;

    public String getTimeZone() {
        return mTimeZone;
    }

    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }

    private String mTimeZone;

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public String getFormattedTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
        formatter.setTimeZone(TimeZone.getTimeZone(getTimeZone()));
        Date datetime = new Date(getTime()*1000);
        String timeString = formatter.format(datetime);
        return timeString;
    }

    public int getTemperature() {
        return (int)Math.round(mTemperature);
    }

    public void setTemperature(double temperature) {

        double temperatureCelcious = (temperature  -  32.0)  *  (5.0/9.0);
        mTemperature = temperatureCelcious;
    }

    public double getHumidity() {
        return mHumidity;
    }

    public void setHumidity(double humidity) {
        mHumidity = humidity;
    }

    public double getPrecipProbability() {

        double precipPercentage = mprecipProbability * 100;
        return (int)Math.round(precipPercentage);
    }

    public void setPrecipProbability(double mprecipProbability) {
        this.mprecipProbability = mprecipProbability;
    }

    public String getSummary() {
        return mSummary;
    }


    public void setSummary(String summary) {
        mSummary = summary;
    }

    public int getIconId() {
        return Forecast.getIconId(mIcon);
    }
}
