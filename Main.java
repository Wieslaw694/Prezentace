
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Pojistenci pojistenci = new Pojistenci();
        Scanner sc = new Scanner(System.in, "Windows-1250");

        int vyber = 0;
        while (vyber != 4) {
            System.out.println("-----------------------------");
            System.out.println("Evidence pojištěných");
            System.out.println("-----------------------------");
            System.out.println();
            System.out.println("Vyberte si akci:");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Konec");

            vyber = Integer.parseInt(sc.nextLine());

            switch(vyber)
            {
                case 1:
                    System.out.println("Zadejte jméno pojištěného:");
                    String jmeno = sc.nextLine();
                    System.out.println("Zadejte příjmení:");
                    String prijmeni = sc.nextLine();
                    System.out.println("Zadejte věk:");
                    int vek = Integer.parseInt(sc.nextLine());
                    System.out.println("Zadejte telefonní číslo:");
                    int telefon = Integer.parseInt(sc.nextLine());
                    pojistenci.pridejZaznam(jmeno, prijmeni, vek, telefon);
                    System.out.println();
                    System.out.println("Data byla uložena. Pokračujte stiskem klávesy ENTER");
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println();
                    for (Zaznam z : pojistenci.zaznamy) {
                        System.out.println(z);
                    }
                    System.out.println();
                    System.out.println("Pokračujte stiskem klávesy ENTER");
                    sc.nextLine();
                    break;
                case 3:
                    // vyhledávání pojištěnců

                    System.out.println("Zadejte celé jméno nebo celé příjmení k vyhledání:");
                    String udaj = sc.nextLine();
                    System.out.println();
                    boolean nalezeno = false;
                    for (Zaznam z : pojistenci.zaznamy) {
                        if(z.jmeno.equals(udaj) || z.prijmeni.equals(udaj)) {
                            System.out.println(z);
                            System.out.println();
                        nalezeno = true;
                        }

                    }
                    if(!nalezeno)
                        System.out.println("Nebyl nalezen žádný záznam.");


                    System.out.println("Pokračujte stiskem klávesy ENTER");
                    sc.nextLine();
                    break;
                case 4:
                    //konec
                    break;
                default:
                    System.out.println("Nebyla zadána žádná platná volba.");
            }
        }
    }
}
