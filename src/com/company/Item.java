package com.company;

public class Item {

  private String catagory;
  private String item;
  private boolean isAvailabel;


  public String toString() {
    return catagory + " " + item;
  }

  public Item(String category, String item) {
    this.catagory = category;
    this.item = item;
    isAvailabel = true;
  }
public boolean showAvaliblebilety(){
    return isAvailabel;
}

}
