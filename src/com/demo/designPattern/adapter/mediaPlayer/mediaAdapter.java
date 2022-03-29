package com.demo.designPattern.adapter.mediaPlayer;

import com.demo.designPattern.adapter.advancedMediaPlayer.*;

public class mediaAdapter implements mediaPlayer {
    advancedMediaPlayer advancedMediaPlayer;

    public mediaAdapter(String audioType) {

        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new vlcPlayer();

        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
