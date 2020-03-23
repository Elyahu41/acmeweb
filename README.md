# acmeweb
sample web server for class exercises on IoC, DIP, DI

This sample shows how to leverage the Spring framework, for simulating a production control server that reports on 
and manages other manufactoring servers, machinery and processes at the Acme Disk Drive company.

Syntax for URLS:
 *    All start with /server
 *    /status  will give back status of server
 *    a param of 'name' specifies a requestor name to appear in response
 *
 * Examples:
 *    http://localhost:8080/server/status
 *
 *    http://localhost:8080/server/status?name=Noach


