package com.unopenlab.undang.clientlibrary.Core;

import com.unopenlab.undang.clientlibrary.Exceptions.ServerInfoManagerException;

import org.junit.Test;

import static org.junit.Assert.*;

public class ServerInfoManagerTest {

    @Test
    public void getBaseUrl() throws ServerInfoManagerException {
        ServerInfoManager manager = ServerInfoManager.getInstance();
        manager.init("test");
        assertEquals("test", manager.getBaseUrl());
    }
}