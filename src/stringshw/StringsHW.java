/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringshw;

import inpututilities.InputUtilities;

/**
 *
 * @author vadym.tymeichuk
 */
public class StringsHW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // the programme below takes user's input which is string and reverses
        // all letters. Also, depending on letter's index in original input
        // the letter gets either lowercased (for odd indices)
        // or uppercased (for even indices)

        // create an instance of InputUtilities object named inputUtilities
        InputUtilities inputUtilities = new InputUtilities();
        // create variable userName and use askUserForText() method from InputUtilities
        // to get user's input. The input would be validated from within the method
        // and user would be redirected to input again if previous input was not text
        String userName = inputUtilities.askUserForText("Please enter your name.");
        // create variable reversedUserName of type string and assign value of empty string
        String reversedUserName = "";
        // loop below goes over every letter in the name entered by user starting from the end
        for (int i = userName.length(); i > 0; i--) {
            // in case the letter's index is odd
            if (i%2!=0) {
                // the letter would be converted to lowercase letter and added to reversedUserName
                reversedUserName += userName.substring(i-1, i).toLowerCase();
            } else {
                // the letter would be converted to lowercase letter and added to reversedUserName
                reversedUserName += userName.substring(i-1, i).toUpperCase();
            }
        }
        // print put reversed user's input in camel case and smiley face using string formatting
        System.out.printf("Haha, your reversed name in camel case is %s %s%n", reversedUserName, new String(Character.toChars(0x1F603)));
    }
}
