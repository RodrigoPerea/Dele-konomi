package com.company;


//import java.util.Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    Scanner key = new Scanner(System.in);
    public void terminateProgramme() {
        System.out.println("Afslutter program");
        System.exit(0);
    }
    public void makeItemavAilableAgain(Catalogue catalogue) {
        System.out.println("Hvad skal du aflevere tilbage?");
        String item = key.nextLine();
        Item found = catalogue.findItem(item);
        catalogue.returnItem(found);
        System.out.println("Retunering af " + item + " er nu registeret. Tak for din retunering!");

    }

    public void addNewItemToCataloug(Catalogue catalogue) {
        System.out.println("Hvilken kategori er vare i?");
        String kategori = key.nextLine();
        System.out.println("Hvilken vare?");
        String vare = key.nextLine();
        System.out.println("Vores team gennemgår nu dine vare, og de vil være tilgængelig for udlån in den for 2 timer.");
        Item newItem = new Item(kategori, vare);
        catalogue.addItem(newItem);
    }

    public void makeItemUnavailable(Catalogue catalogue) {
        System.out.println("Hvad vil du gerne låne?");
        String item = key.nextLine();
        Item found = catalogue.findItem(item);
        System.out.println("Dit lån af " + item + " er nu registreret. Go fornøjelse!");
        catalogue.borrowItem(found);

    }

    public static void main(String[] args) {
        Main obj = new Main();
        Scanner key = new Scanner(System.in);

        Catalogue catalogue = new Catalogue(1000);


        Item item1 = new Item("Sport", "Skateboard");
        catalogue.addItem(item1);
        //System.out.println(item1);
        Item item2 = new Item("Transport", "Cykel");
        catalogue.addItem(item2);
        //System.out.println(item2);
        Item item3 = new Item("Tøj", "Smoking");
        catalogue.addItem(item3);
        //System.out.println(item3);
        Item item4 = new Item("Tøj", "Jeans");
        catalogue.addItem(item4);
        Item item5 = new Item("Sport", "Ski");
        catalogue.addItem(item5);
        Item item6 = new Item("Transport", "Bil");
        catalogue.addItem(item6);
        Item item7 = new Item("Tøj", "Kjole");
        catalogue.addItem(item7);
        Item item8 = new Item("Transport", "Båd");

        //System.out.println(item4);
        //System.out.println(Arrays.toString(catalogue.getFullList()));


        ///////////////////////////////////////////////
        int choice = -1;
        while (choice != 0)
            System.out.println("Hvad kunne du tænke dig?");
        System.out.println("1. Se hele kataloget");
        System.out.println("2. Se hvad der er ledigt");
        System.out.println("3. Opret ting til udlån");
        System.out.println("4. Lån ting");
        System.out.println("5. Aflever ting");
        System.out.println("0. Afslut");


        Scanner scanner = new Scanner(System.in);
         choice = scanner.nextInt();


        if (choice == 1) {
            System.out.println("Følgende ting kan lånes:\n");// get all items in cataloque
            //Item[] allItems = catalogue.getFullList();
            //for (int i = 0; i < allItems.length; i++) {
            //System.out.println(allItems[i]);
            catalogue.getFullList();


        } else if (choice == 2) { // get available items in cataloque

            Item[] availableItems = catalogue.getAvailableItems();
            for (int i = 0; i < availableItems.length; i++) {

                System.out.println(availableItems[i]);
            }

        } else if (choice == 3) { // Add new Item to catalogue
            // Hardcoded values for new Item
            //catalogue.addItem(new Item("Sport", "Tennisbolde"));
            obj.addNewItemToCataloug(catalogue);
            //System.out.println(Arrays.toString(catalogue.getFullList()));  //HUSK: Arrays.toString for at kunne printe

        } else if (choice == 4) {
            obj.makeItemUnavailable(catalogue);

        } else if (choice == 5) {
            obj.makeItemavAilableAgain(catalogue);

        } else if (choice == 0) {
            obj.terminateProgramme();

        }
                }  else { // invalid choice
                    System.out.println("Du foretog et ugyldigt valg.");
                }
            }