package com.acme.statusmgr.beans;

import com.acme.servermgr.ServerManager;

public class MemoryStatus extends ServerStatus {

    public MemoryStatus(Status status) {
        super(status);
        statusDesc += ServerManager.getMemoryStatus();
    }
}
