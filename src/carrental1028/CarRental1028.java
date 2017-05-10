/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental1028;

/**
 *
 * @author kms080
 */
import java.util.Scanner;
public class CarRental1028 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please provide your car's manufacturer: ");
        String make = in.nextLine();
        System.out.print("\nPlease provide your car's model: ");
        String model = in.nextLine();
        System.out.print("\nPlease provide your car's license plate number: ");
        String license = in.nextLine();
        String licenseChars = license.substring(0, 3);
        int licenseNum = Integer.parseInt(license.substring(4, license.length()));
        int charSum = licenseChars.charAt(0) + licenseChars.charAt(1) + licenseChars.charAt(2);
        int finalInt = charSum + licenseNum;
        int finalMod = finalInt % 26;
        int charNum = 65 + finalMod;
        char beginningChar = (char) charNum;
        String rentalNum = beginningChar + Integer.toString(finalInt);
        System.out.print("\nGreat! Here's your info:\nMake: " + make + "\nModel: " + model + "\nLicense plate number: " + license + "\nRental code: " + rentalNum + "\n");
    }
}
