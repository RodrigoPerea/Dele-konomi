package com.company;

public class Catalogue {

  private Item [] items;
  private int counter;



  public Catalogue(int number) {
    this.items = new Item [number];

  }
  public void addItem (Item i){
        items[counter++] = i;
  }

  //TODO: loope arrayes igennem, og ikke skrive nget ud hvis det er null.
  public Item[] getFullList(){
    return items;
  }




}


