package com.BehavioralDesignPatterns.Command.OnlineStore;

public class OnlineStore {
    public static void main(String[] args) {
        var item1 = new Item(1);
        var item2 = new Item(2);
        var item3 = new Item(3);

        var itemOperationExecuter = new ItemOperationExecuter();
        itemOperationExecuter.queueOperation(new AddItemToBasketOperation(item1));
        itemOperationExecuter.queueOperation(new AddItemToBasketOperation(item2));
        itemOperationExecuter.queueOperation(new AddItemToBasketOperation(item3));

        itemOperationExecuter.queueOperation(new RemoveItemFromBasketOperation(item2));

        itemOperationExecuter.checkout();
    }
}
