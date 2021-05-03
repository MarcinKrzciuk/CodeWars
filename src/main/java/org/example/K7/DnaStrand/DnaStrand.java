package org.example.K7.DnaStrand;

//        Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions"
//        for the development and functioning of living organisms.
//
//        If you want to know more http://en.wikipedia.org/wiki/DNA
//
//        In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G".
//        You have function with one side of the DNA (string, except for Haskell); you need to get the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).
//
//        More similar exercise are found here http://rosalind.info/problems/list-view/ (source)

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
