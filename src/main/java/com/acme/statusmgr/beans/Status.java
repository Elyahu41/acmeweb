package com.acme.statusmgr.beans;

/**
 * This interface specifies what methods and variables a Server's Status needs
 */
public interface Status {

    String statusDesc = null;
    String contentHeader = null;
    long id = 0;

    String getStatusDesc();
    String getContentHeader();
    long getId();
}
