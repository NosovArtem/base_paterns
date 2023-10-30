package com.nsv.soft.dev.lab.base.patterns.structural.bridge;

public abstract class Player {
    AudioPlayer audioPlayer;

    public Player(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    void play(){
        audioPlayer.playAudio();
    };
}
