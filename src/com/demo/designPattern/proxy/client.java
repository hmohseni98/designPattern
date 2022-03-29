package com.demo.designPattern.proxy;

import com.demo.designPattern.proxy.internet.internet;
import com.demo.designPattern.proxy.internet.proxyInternet;

public class client
{
    public static void main (String[] args)
    {
        internet internet = new proxyInternet();
        try
        {
            internet.connectTo("google.com");
            internet.connectTo("abc.com");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
