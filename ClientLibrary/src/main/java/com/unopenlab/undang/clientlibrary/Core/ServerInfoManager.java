package com.unopenlab.undang.clientlibrary.Core;

import com.unopenlab.undang.clientlibrary.Exceptions.ServerInfoManagerException;

public class ServerInfoManager {

    private static ServerInfoManager mInstance = new ServerInfoManager();
    private String mBaseUrl;
    private boolean isReady;

    private ServerInfoManager() {
        isReady = false;
    }

    public static ServerInfoManager getInstance() {
        return mInstance;
    }

    public void init(String baseUrl) {
        isReady = true;
        mBaseUrl = baseUrl;
    }

    public String getBaseUrl() throws ServerInfoManagerException {
        if(!isReady) {
            throw new ServerInfoManagerException("ServerInfoManager is not ready.");
        }
        return mBaseUrl;
    }
}
