package com.BehavioralDesignPatterns.Command.LightOnOff;

public class App {
    public static void main(String[] args) {
        var light = new Light();
        light.isOn();
        var lightCommandExecuter = new LightCommandExecuter();
        lightCommandExecuter.execute(new TurnOnLightCommand(light));
        light.isOn();
        lightCommandExecuter.execute(new TurnOffLightCommand(light));
        light.isOn();
    }
}
