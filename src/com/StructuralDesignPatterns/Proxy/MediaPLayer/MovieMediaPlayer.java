package com.StructuralDesignPatterns.Proxy.MediaPLayer;

public class MovieMediaPlayer implements MediaPLayer{
    public MovieMediaPlayer() {
        loadVideo();
    }

    @Override
    public void playMedia() {
        System.out.println("Playing video...");
    }

    private void loadVideo() {
        System.out.println("Loading up large video...");
    }
}
