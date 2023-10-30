package com.nsv.soft.dev.lab.base.patterns.structural.bridge;

public class OldAudioPlayer implements AudioPlayer{
    @Override
    public void playAudio() {
        System.out.println("Old player playing audio track");
    }
}
