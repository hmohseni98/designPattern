package com.demo.designPattern.adapter.adapter;

import com.demo.designPattern.adapter.adaptee.mediaPlayer.mediaAdapter;
import com.demo.designPattern.adapter.adaptee.mediaPlayer.mediaPlayer;

public class audioPlayerAdapter implements mediaPlayer {
    mediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + fileName);
        }

        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new mediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }

        else{
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
