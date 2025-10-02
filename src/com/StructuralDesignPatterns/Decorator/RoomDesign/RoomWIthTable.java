package com.StructuralDesignPatterns.Decorator.RoomDesign;

public class RoomWIthTable extends RoomDecorator{
    public RoomWIthTable(Room room) {
        super(room);
    }
    @Override
    public void printFurniture() {
        super.printFurniture();
        System.out.println("Table");
    }
}
