package com.BehavioralDesignPatterns.State.MusicPlayer;

public class PlayingState implements PlayerState {

    @Override
    public void pressButton(MediaPlayer player) {
        player.pause();
        player.setState(new PausedState());
    }

}
