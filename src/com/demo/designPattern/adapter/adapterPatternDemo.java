package com.demo.designPattern.adapter;

public class adapterPatternDemo {
    public static void main(String[] args) {
        audioPlayer audioPlayer = new audioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
