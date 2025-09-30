package com.CreationalDesignPatterns.Builder.ex2;

/*
Implement the Builder pattern
Create a Builder class to handle the construction of StoreItem objects
Use the ItemInventory class
 */
public class ItemRegistry {
    public static void main(String[] args) {
        var item1 = new StoreItem.StoreItemBuilder("Pretzel", 2.0).shortDescription("A tasty snack").stockAvailable(15).build();
        var item2 = new StoreItem.StoreItemBuilder("Soup",1.5).longDescription("A meal that you can warm up at home.").packagingType("can").build();

        addItemToRegistry(item1);
        addItemToRegistry(item2);
    }
    private static void addItemToRegistry(StoreItem storeItem) {
        System.out.println("A new item was added to the registry: \n" + storeItem);
    }
}
