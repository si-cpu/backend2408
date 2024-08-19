package oop.final_.practice;

import static oop.final_.practice.WeatherConstants.*;

public class WeatherAnalyzer {

    public static boolean checkTemperatureAlert(double temparature){
        return temparature> MAX_TEMPERATURE_ALERT
                || temparature < MIN_TEMPERATURE_ALERT;
    }

    public static boolean checkPrecipitationAlert(double Precipitation){
        return Precipitation > PRECIPITATION_ALERT;
    }

}
