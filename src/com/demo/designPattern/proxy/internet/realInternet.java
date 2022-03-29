package com.demo.designPattern.proxy.internet;

public class realInternet implements internet{
    @Override
    public void connectTo(String serverHost) throws Exception {
        System.out.println("Connecting to "+ serverHost);
    }
}
