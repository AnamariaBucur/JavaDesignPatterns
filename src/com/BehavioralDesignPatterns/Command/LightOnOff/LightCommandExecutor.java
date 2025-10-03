package com.BehavioralDesignPatterns.Command.LightOnOff;

public class LightCommandExecutor {
    public void execute(LightCommand lightCommand){
        lightCommand.execute();
    }
}
