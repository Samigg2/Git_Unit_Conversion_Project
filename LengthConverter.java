
package git_unit_converter_project;
public class LengthConverter {
    
    public static double metersToFeet(double meters) {
        return meters * 3.28084;
    }
    
    public static double metersToInches(double meters) {
        return meters * 39.3701;
    }
    
    public static double feetToMeters(double feet) {
        return feet / 3.28084;
    }
    
    public static double feetToInches(double feet) {
        return feet * 12;
    }
    
    public static double inchesToMeters(double inches) {
        return inches / 39.3701;
    }
    
    public static double inchesToFeet(double inches) {
        return inches / 12;
    }
}
