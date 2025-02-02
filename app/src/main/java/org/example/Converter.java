package org.example;

public class Converter {

  /**
   * Converts ounces to a decimal representation of pounds.
   * 
   * @param ounces the number of ounces
   * @return the equivalent weight in pounds as a string formatted to 4 decimal places
   */
  public String toPounds(int ounces) {
    double pounds = ounces / 16.0; // 16 ounces in 1 pound
    return String.format("%.4f %s", pounds, pounds == 1.0 ? "lb" : "lbs");
  }

  /**
   * Converts ounces to pounds and remaining ounces.
   * 
   * @param ounces the number of ounces
   * @return a string representing the weight in pounds and ounces
   */
  public String toPoundsAndOunces(int ounces) {
    int pounds = ounces / 16; // Get the whole number of pounds
    int remainingOunces = ounces % 16; // Get the leftover ounces
    String poundUnit = (pounds == 1) ? "lb" : "lbs";
    String ounceUnit = (remainingOunces == 1) ? "oz" : "oz";
    return String.format("%d %s %d %s", pounds, poundUnit, remainingOunces, ounceUnit);
  }
}
