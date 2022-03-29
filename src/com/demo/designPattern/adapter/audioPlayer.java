package com.demo.designPattern.adapter;

import com.demo.designPattern.adapter.mediaPlayer.mediaAdapter;
import com.demo.designPattern.adapter.mediaPlayer.mediaPlayer;

public class audioPlayer implements mediaPlayer {
    com.demo.designPattern.adapter.mediaPlayer.mediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {
        //inbuilt support to play mp3 music files
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + fileName);
        }

        //mediaAdapter is providing support to play other file formats
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new mediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }

        else{
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
