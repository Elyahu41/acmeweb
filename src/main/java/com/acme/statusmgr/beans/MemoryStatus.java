package com.acme.statusmgr.beans;

import com.acme.servermgr.ServerManager;

/**
 * This class extends the ServerStatus class and simply calls the constructor of the ServerStatus class and also
 * amends the status description
 */
public class MemoryStatus extends ServerStatus {

    public MemoryStatus(Status status) {
        super(status);
        statusDesc += ServerManager.getMemoryStatus();
    }
}
