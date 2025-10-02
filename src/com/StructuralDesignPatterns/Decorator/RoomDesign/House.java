package com.StructuralDesignPatterns.Decorator.RoomDesign;

public class House {
    public static void main(String[] args) {
        System.out.println("Basic room has: ");
        var room = new BasicRoom();
        room.printFurniture();

        System.out.println();

        System.out.println("Room with couch has: ");
        var roomWithCouch = new RoomWithCouch(room);
        roomWithCouch.printFurniture();

        System.out.println();

        System.out.println("Room with table has: ");
        var roomWIthTable = new RoomWIthTable(roomWithCouch);
        roomWIthTable.printFurniture();
        // create a room with a carpet, a couch and a table
    }
}
