package com.adidas.email.application.rest;


import com.adidas.email.application.request.EmailRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Send email controller.
 *
 */
@Slf4j
@RestController
@Api(tags = "Email")
@RequestMapping("/email")
public class SendEmailController {

    /**
     * Send email for a subscription.
     *
     * @param request subscription data.
     * @return
     *  - 200 email sent successfully.
     *  - 500 internal error server (unexpected error).
     */
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation("Send email")
    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    public void sendEmail(@RequestHeader("Authorization") String authorization,
                          @Valid @RequestBody EmailRequest request) {
        // TODO implement -- it is a mock
        log.info("Sending email...");
    }

}
