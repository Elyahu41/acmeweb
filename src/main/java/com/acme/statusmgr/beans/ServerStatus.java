package com.acme.statusmgr.beans;

import com.acme.servermgr.ServerManager;

/**
 * A POJO that represents Server Status and can be used to generate JSON for that status. This class also implements
 *  the Status interface which will help in the decoration of other statuses. All other statuses extend this class.
 */
public class ServerStatus implements Status{

    private long id;
    private String contentHeader;
    protected String statusDesc = "Unknown";

    /**
     * Construct a ServerStatus using info passed in for identification, and obtaining current
     * server status from the appropriate Manager class.
     * This class must return a pretty, english-like representation of the server status.
     *
     * @param id                a numeric identifier/counter of which request this
     * @param contentHeader     info about the request
     */
    public ServerStatus(long id, String contentHeader) {
        this.id = id;
        this.contentHeader = contentHeader;

        // Obtain current status of server
        this.statusDesc = "Server is " + ServerManager.getCurrentServerStatus();
    }

    /**
     * Cunstucts a ServerStatus using the type of status passed in through the parameter.
     * @param status a status
     */
    public ServerStatus(Status status){
        id = status.getId();
        contentHeader = status.getContentHeader();
        statusDesc = status.getStatusDesc();
    }

    public ServerStatus() {}

    public long getId() {
        return id;
    }

    public String getContentHeader() {
        return contentHeader;
    }

    public String getStatusDesc() {
        return statusDesc;
    }
}
