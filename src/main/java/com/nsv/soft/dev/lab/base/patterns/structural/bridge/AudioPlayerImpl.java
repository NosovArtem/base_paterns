package com.nsv.soft.dev.lab.base.patterns.structural.bridge;

public class AudioPlayerImpl implements AudioPlayer{
    @Override
    public void playAudio() {
        System.out.println("Playing audio track...");
    }
}
