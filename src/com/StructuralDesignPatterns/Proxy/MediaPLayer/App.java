package com.StructuralDesignPatterns.Proxy.MediaPLayer;

public class App {
    private static final MediaPLayerProxy mediaPLayerProxy = new MediaPLayerProxy();
    public static void main(String[] args) {
        goToMovieLibrary();
        goToFavoriteMovies();
    }

    private static void goToMovieLibrary() {
        System.out.println("Loading movie library...");
        mediaPLayerProxy.playMedia();
    }

    private static void goToFavoriteMovies() {
        System.out.println("Loading favorite movies...");
        mediaPLayerProxy.playMedia();
    }
}
