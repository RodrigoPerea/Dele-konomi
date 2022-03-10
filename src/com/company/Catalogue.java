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
  public Item[] getFullList() {
    /*
    while (getFullList(){
      if (items==null);
    }*/
    return items;
  }
  public Item[] getAvailableItems() {
    Item[] availables = new Item[items.length];
    for(int i = 0; i < items.length; i++) {
      Item temp = items[i];
      if (temp != null && temp.showAvailability()) {
        availables[i] = temp;
      }
    }
    return availables;
  }

  public Item findItem(String searchName) {
    for(int i = 0; i < items.length; i++) {
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
