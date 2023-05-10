package net.vidal.generaterest.controller;

import net.vidal.generaterest.dto.SomeResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeRestController {
    private static final Logger logger = LoggerFactory.getLogger(SomeRestController.class);

    @GetMapping
    public SomeResponse someResponse() {
        logger.info("rest call");
        return new SomeResponse("Some text", 123);
    }
}
