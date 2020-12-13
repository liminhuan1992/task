package com.service;

import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class BMPTest {
    @Test
    public void testBMP() throws IOException {
        BrowserMobProxy proxy = new BrowserMobProxyServer();
        proxy.start(8080);
        int port = proxy.getPort(); // get the JVM-assigned port
        // Selenium or HTTP client configuration goes here

        proxy.addResponseFilter((response,contents,messageInfo)->{
            if(messageInfo.getOriginalUrl().contains(".json")){
                String contentNew = contents.getTextContents().replaceAll(":\"[^\"]*\"","null");
                contents.setTextContents(contentNew);

            }
        });
        System.in.read();
    }
}
