package headfirst.iterator.dinermerger.before;

import java.util.ArrayList;

public class PancakeHouseMenu {
  ArrayList menuItems;
  
  //static final int MAX_ITEMS = 3;
//int numberOfItems = 0;
//MenuItem[] menuItems;
public PancakeHouseMenu(){
  //menuItems = new MenuItem[MAX_ITEMS];
  menuItems = new ArrayList<MenuItem>();
  addItem("Vegetarian BLT", 
          "(Fakin') Bacon with Lettuce & tomato on whole wheat", true, 2.99);
  addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
  addItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29);
    }
public void addItem(String name, String description, boolean vegetarian, double price){
  MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
  menuItems.add(menuItem);
//if(numberOfItems >= MAX_ITEMS){
  //  System.err.println("Sorry, menu is full");
  //} else{
  //  menuItems[numberOfItems] = menuItem;
  //  numberOfItems = numberOfItems + 1;
  }

//public MenuItem[] getMenuItems(){
public ArrayList getMenuItems(){  
return menuItems;
}
}
