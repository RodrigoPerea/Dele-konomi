package com.company;

public class Catalogue {

  private Item[] items;
  private int counter;


  public Catalogue(int number) {
    this.items = new Item[number];

  }

  public void addItem(Item i) {
    items[counter++] = i;
  }

  //TODO: loope arrayes igennem, og ikke skrive nget ud hvis det er null.
  public void getFullList() {
    //ArrayList<Item> newItem; Sætter den i en array liste, hust at lave den til eks. array[] istedet for void, så den kan returne
    for (int i = 0; i < items.length; i++) {
      // newItem.add(items[i]); // laves til en ny array liste
      if (items[i] != null) {
        System.out.println(items[i]);
        //if(items.equals(null))
        //return new Item[i];
      }
      // System.out.print(items[i]);
      //return newItem; // udskriv den ye arrayliste.
    }

  }

  public Item[] getAvailableItems() {
    Item[] availables = new Item[items.length];
    for (int i = 0; i < items.length; i++) {
      Item temp = items[i];
      if (temp != null && temp.showAvailability()) {
        availables[i] = temp;
      }
    }
    return availables;
  }

  public Item findItem(String searchName) {
    for (int i = 0; i < items.length; i++) {
      Item temp = items[i];
      if (temp != null && temp.getDescription().equals(searchName)) {
        return temp;
      }
    }
    return null;
  }

  public void borrowItem(Item found) {
    found.makeUnavailable();
  }

  public void returnItem(Item found) {
    found.makeAvailable();
  }
}
