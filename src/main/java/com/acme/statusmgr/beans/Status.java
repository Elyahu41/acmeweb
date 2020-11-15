package com.acme.statusmgr.beans;

public interface Status {

    String statusDesc = null;
    String contentHeader = null;
    long id = 0;

    String getStatusDesc();
    String getContentHeader();
    long getId();
}
