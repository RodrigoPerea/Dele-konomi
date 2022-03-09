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
    Item[] avalibles = new Item[items.length];
    for (int i = 0; i < items.length; i++) {

      Item temp = items[i];  //tempore variabel
      if (temp != null && temp.showAvaliblebilety()) {
        avalibles[i] = temp;  // lopper pladserne igenne, ogm lægger ind i avalibles arrayet hvis der ligge rnoget der.
      }
    }
      return avalibles;
    }
  }
