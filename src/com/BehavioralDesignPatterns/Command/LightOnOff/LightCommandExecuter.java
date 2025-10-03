package com.BehavioralDesignPatterns.Command.LightOnOff;

public class LightCommandExecuter {
    public void execute(LightCommand lightCommand){
        lightCommand.execute();
    }
}
