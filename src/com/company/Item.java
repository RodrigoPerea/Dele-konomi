package com.company;

public class Item {

  private String catagory;
 // private String item;
  private String description;
  private boolean isAvailable;

  public String toString() {
    return catagory + " " + description + " " + isAvailable;
  }
  public String getDescription() {
    return description;
  }

  public Item(String category, String description ) {
    this.catagory = category;
    //this.item = item;
    this.description = description;
    isAvailable = true;
  }

  public boolean showAvailability() {
    return isAvailable;
  }
/*
  public boolean changeArrayAvilibyty() {  //tænd/sluk knap
    if (isAvailabel == true) {
      isAvailabel = false;
    } else {
      isAvailabel = true;
    }
  }

 */
  public void makeAvailable() {
    isAvailable = true;
  }
  public void makeUnavailable() {
    isAvailable = false;
  }
}


