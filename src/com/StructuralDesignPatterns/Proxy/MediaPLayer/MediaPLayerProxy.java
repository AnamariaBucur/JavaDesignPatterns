package com.StructuralDesignPatterns.Proxy.MediaPLayer;

public class MediaPLayerProxy implements MediaPLayer{
    private MovieMediaPlayer movieMediaPlayer;

    @Override
    public void playMedia() {
        if (movieMediaPlayer == null) {
            movieMediaPlayer = new MovieMediaPlayer();
        }
        movieMediaPlayer.playMedia();
    }
}
