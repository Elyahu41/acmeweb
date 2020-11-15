package com.acme.statusmgr.beans;

import com.acme.servermgr.ServerManager;

public class OperatingStatus extends ServerStatus {

    public OperatingStatus(Status status) {
        super(status);
        statusDesc += ServerManager.getOperatingStatus();
    }
}
