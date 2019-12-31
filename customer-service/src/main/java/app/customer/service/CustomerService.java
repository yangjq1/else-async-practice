package app.customer.service;

import core.framework.async.Executor;
import core.framework.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;


/**
 * @author Else
 */
public class CustomerService {
    private final Logger logger = LoggerFactory.getLogger(CustomerService.class);

    @Inject
    Executor executor;

    public String print() {
        String time = LocalDateTime.now().toString();
        executor.submit("one-print-time", () -> {
            logger.info("***** one-print-time **** " + time);
        });
        return time;
    }
}
