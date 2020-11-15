package com.acme.servermgr;

/**
 * Manage all servers (service providers) being tracked by the Acme server tracking system
 * For now just some simple static methods for use in school project.
 * Treat this as a 'black box' that gives back indicators like up, running etc for
 * various 'services' that are being managed.
 */
public class ServerManager {

    static String operatingStatus = ", and is operating normally";
    static String memoryStatus = ", and its memory is running low";
    static String extensionsStatus = ", and is using these extensions - [Hypervisor, Kubernetes, RAID-6]";

    /**
     * Get the status of this server
     * @return a descriptive string about the servers status
     */
    static public String getCurrentServerStatus() {
        return "up";  // The server is up
    }

    /**
     * Find out if this server is operating normally
     * @return Boolean indicating if server is operating normally
     */
    static public Boolean isOperatingNormally() {
        return true;
    }

    /**
     * This method will return a string that says, ", and is operating normally"
     * @return The operating status
     */
    static public String getOperatingStatus(){return operatingStatus;}

    /**
     * This method will return a string that says, ", and its memory is running low"
     * @return The server's memory status
     */
    static public String getMemoryStatus(){return memoryStatus;}

    /**
     * This method will return a string that says, ", and is using these extensions - [Hypervisor, Kubernetes, RAID-6]"
     * @return The status of how many extensions are in use
     */
    static public String getExtensionsStatus(){return extensionsStatus;}
}
