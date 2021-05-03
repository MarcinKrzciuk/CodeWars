package org.example.K7.DnaStrand;

public class DnaStrand {
    public static String makeComplement(String dna) {
        StringBuilder text1 = new StringBuilder(dna);
        for (int i = 0; i < dna.length(); i++) {
            if (text1.charAt(i) == 'A') {
                text1.setCharAt(i, 'T');
            } else if
            (text1.charAt(i) == 'T') {
                text1.setCharAt(i, 'A');
            } else if
            (text1.charAt(i) == 'C') {
                text1.setCharAt(i, 'G');
            } else if
            (text1.charAt(i) == 'G') {
                text1.setCharAt(i, 'C');
            }
        }
        return text1.toString();
    }
}
