package com.nsv.soft.dev.lab.base.patterns.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Player player = new Player(new AudioPlayerImpl()) {
        };
        Player player1 = new Player(new OldAudioPlayer()) {
        };

        player.play();
        System.out.println();
        player1.play();
    }
}
