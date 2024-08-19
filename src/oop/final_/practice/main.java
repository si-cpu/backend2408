package oop.final_.practice;

import static oop.final_.practice.WeatherAnalyzer.*;
import static oop.final_.practice.WeatherAnalyzer.checkTemperatureAlert;

public class main {
    public static void main(String[] args) {
        double currentTemperature = -13.5;  // 현재 기온
        double currentPrecipitation = 10.0; // 현재 강수량

        boolean temperatureAlert = checkTemperatureAlert(currentTemperature);
        boolean precipitationAlert = checkPrecipitationAlert(currentPrecipitation);

        System.out.println("Temperature Alert: " + temperatureAlert);  // 40도 이상이므로 true
        System.out.println("Precipitation Alert: " + precipitationAlert); // 50mm 이상이므로 true
    }
}
