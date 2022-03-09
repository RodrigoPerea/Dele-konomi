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

}


