package com.acme.statusmgr;

import java.security.cert.Extension;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.acme.statusmgr.beans.ExtensionsStatus;
import com.acme.statusmgr.beans.MemoryStatus;
import com.acme.statusmgr.beans.OperatingStatus;
import com.acme.statusmgr.beans.ServerStatus;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

/**
 * Controller for all web/REST requests about the status of servers
 *
 * For initial school project - just handles info about this server
 * Syntax for URLS:
 *    All start with /server
 *    /status  will give back status of server
 *    a param of 'name' specifies a requestor name to appear in response
 *
 * Examples:
 *    http://localhost:8080/server/status
 *
 *    http://localhost:8080/server/status?name=Noach
 *
 *
 *
 */
@RestController
@RequestMapping("/server")
public class StatusController {

    protected static final String template = "Server Status requested by %s";
    protected final AtomicLong counter = new AtomicLong();



    @RequestMapping("/status")
    public ServerStatus statusResponse(@RequestParam(value="name", defaultValue="Anonymous") String name) {
        return new ServerStatus(counter.incrementAndGet(), String.format(template, name));
    }

    @RequestMapping("/details")
    public void detailsResponse(@RequestParam() List<String> id) {
        System.out.println("*** DEBUG INFO ***" + id);
    }

    @RequestMapping("/status/detailed")
    public ServerStatus detailedStatusResponse(@RequestParam(value="name", defaultValue="Anonymous") String name,
                                       @RequestParam() List<String> details) {
        ServerStatus serverStatus = statusResponse(name);
        detailsResponse(details);

        for (String detail:details) {
            switch (detail) {
                case "operations":
                    serverStatus = new OperatingStatus(serverStatus);
                    break;
                case "extensions":
                    serverStatus = new ExtensionsStatus(serverStatus);
                    break;
                case "memory":
                    serverStatus = new MemoryStatus(serverStatus);
                    break;
                default:
                    throw new BadRequestException();
            }
        }
        return serverStatus;
    }
}
