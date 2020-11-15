package com.acme.statusmgr;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * This class throws a BadRequestException when the parameters entered in the URL of the server are not correct
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason="Double check your details parameters")
public class BadRequestException extends RuntimeException {}
