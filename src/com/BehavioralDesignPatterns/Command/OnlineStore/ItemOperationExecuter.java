package com.BehavioralDesignPatterns.Command.OnlineStore;

import java.util.ArrayList;
import java.util.List;

public class ItemOperationExecuter {

    List<ItemOperation> itemOperations = new ArrayList<>();
    public void queueOperation(ItemOperation itemOperation) {
        itemOperations.add(itemOperation);
    }

    //call all the operations in the list
    public void checkout() {
        itemOperations.forEach(ItemOperation::execute);
        itemOperations.clear();
    }
}

