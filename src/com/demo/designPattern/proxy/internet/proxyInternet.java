package com.demo.designPattern.proxy.internet;

import java.util.ArrayList;
import java.util.List;


public class proxyInternet implements internet
{
    private internet internet = new realInternet();
    private static List<String> bannedSites;

    static
    {
        bannedSites = new ArrayList<String>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lnm.com");
    }

    @Override
    public void connectTo(String serverHost) throws Exception
    {
        if(bannedSites.contains(serverHost.toLowerCase()))
        {
            throw new Exception("Access Denied");
        }

        internet.connectTo(serverHost);
    }

}
