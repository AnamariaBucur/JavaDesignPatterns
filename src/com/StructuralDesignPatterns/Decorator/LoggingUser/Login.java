package com.StructuralDesignPatterns.Decorator.LoggingUser;

public class Login {
    public static void main(String[] args) {
        System.out.println("Basic user:");
        var user = new BasicUser();
        user.printPrivileges();

        System.out.println();

        System.out.println("Admin user:");
        var adminUser = new AdminUser(user);
        adminUser.printPrivileges();

        System.out.println();

        System.out.println("Developer user:");
        var developerUser = new DeveloperUser(adminUser);
        developerUser.printPrivileges();
    }
}
