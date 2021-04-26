package org.example.K6.CreatePhoneNr;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder convert = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            convert.append(String.valueOf(numbers[i]));
        }

        String phonenr = convert.toString();
        String phoneMask= "(###) ###-####";

        MaskFormatter maskFormatter= null;
        try {
            maskFormatter = new MaskFormatter(phoneMask);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        maskFormatter.setValueContainsLiteralCharacters(false);
        try {
            phonenr = maskFormatter.valueToString(phonenr) ;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return phonenr;
    }
}
