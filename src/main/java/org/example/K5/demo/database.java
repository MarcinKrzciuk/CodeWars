package org.example.K5.demo;

public class database {
    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */


import java.util.Random;
import java.util.Scanner;

    /**
     *
     * @author marten
     */
    public class rach_bank {
        private
        String firstName;
        String lastName;
        Random rand = new Random();
        int accountNr;
        int saldo;

        public rach_bank(String firstName, String lastName, int saldo) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.accountNr = rand.nextInt(1000);
            this.saldo = saldo;
        }

        public rach_bank(){
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAccountNr() {
            return accountNr;
        }

        public int getSaldo() {
            return saldo;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAccountNR(int accountNr) {
            this.accountNr = accountNr;
        }

        public void setSaldo(int saldo) {
            this.saldo = saldo;
        }

        //METHODS

        Scanner scanner = new Scanner(System.in);

        public void init() {
            System.out.println("wprowadz imie klienta");
            this.firstName = scanner.nextLine();

            System.out.println("wprowadz nazwisko klietna");
            this.lastName = scanner.nextLine();

            this.accountNr =rand.nextInt(1000);
            this.saldo =0;
        }

        public void show() {
            System.out.println("***********************");
            System.out.println("Imie: " + firstName);
            System.out.println("Nazwisko: " + lastName);
            System.out.println("Nr rachunku: " + accountNr);
            System.out.println("Saldo rachunku: " + saldo);
            System.out.println("***********************");
            System.out.println("");
        }

        public void add(int add) {
            System.out.println("Wprowadz kwote wplaty");
            //int add = scanner.nextInt();
            if (add > 0) {
                saldo = saldo + add;
            }
            else {
                System.out.println("wprowadzona kwota jest mniejsza lub rowna zeru");
                System.out.println("operacja nie moze zostac wykonana");
            }
            System.out.println("aktualne saldo rachunku: " + accountNr);
            System.out.println("wynosi: " + saldo);
            System.out.println("");
        }

        public void withdraw() {
            System.out.println("wprowadz kwote do wyplaty: ");
            int withdraw = scanner.nextInt();
            if(saldo >= withdraw) {
                saldo = saldo - withdraw;
                System.out.println("aktualne saldo rachunku: " + accountNr);
                System.out.println("wynosi: " + saldo);
            }
            else{
                System.out.println("brak wystarczajacych srodkow na koncie ");
                System.out.println("aktualne saldo rachunku: " + accountNr);
                System.out.println("wynosi: " + saldo);
            }
            System.out.println("");
        }

        public int saldo(){
            return saldo;
        }
        public void changeOwner(){
            this.firstName=scanner.nextLine();
            this.lastName=scanner.nextLine();
        }
    }

}
