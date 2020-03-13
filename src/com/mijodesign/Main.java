package com.mijodesign;


public class Main {
    // new java.util.Scanner( System.in ).nextLine();
    public static void main(String[] args) {
        double money;

        double m_pf = 0.9;
        double m_usd = 1.11;
        double newmoney;

        String wahrung;

        System.out.println("Wie viel Geld willst du wechseln? Biite eingeben: ");
        money = new java.util.Scanner( System.in ).nextInt();
        System.out.println("\nWelche Währung? Pfund oder US-Dollar? Biite eingeben:");
        wahrung = new java.util.Scanner( System.in ).nextLine();

        System.out.println("\nGewählt: " + wahrung);

        newmoney = wahrung.equals("Pfund") ? money * m_pf : wahrung.equals("US-Dollar") ? money * m_usd : 0;
        System.out.println(newmoney);
    }
}