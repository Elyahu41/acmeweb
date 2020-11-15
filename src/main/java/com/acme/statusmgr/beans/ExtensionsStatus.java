package com.acme.statusmgr.beans;

import com.acme.servermgr.ServerManager;

public class ExtensionsStatus extends ServerStatus {

    public ExtensionsStatus(Status status) {
        super(status);
        statusDesc += ServerManager.getExtensionsStatus();
    }
}
