package com.ashleece_muc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name="";

        System.out.println("Kādas programmēšanas apmācības Tevi interesē? Droši jautā!");

        name=scanner.nextLine();

        if (name.contains("Progarmmēšanas pamati")) {
            System.out.println("Nākamās programmēšanas pamatu apmācības sāksies 13.janvārī. Pieskaies jau šodien.");
        };
        if (name.contains("Kiberdrošības apmācības")){
            System.out.println("Nākamās kiberdrošības apmācības sāksies 24.janvārī. Piesakies jau tagad.");
        };
        if (name.contains("Datu analīze")){
            System.out.println("Nākamās Datu analīzes apmācības sāksies 21.janvārī.Gaidam Tavu pieteikumu.");
        }

    }
}
