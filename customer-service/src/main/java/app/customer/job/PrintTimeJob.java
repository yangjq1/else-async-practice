package app.customer.job;

import core.framework.scheduler.Job;
import core.framework.scheduler.JobContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

/**
 * @author Else
 */
public class PrintTimeJob implements Job {
    private final Logger logger = LoggerFactory.getLogger(PrintTimeJob.class);

    @Override
    public void execute(JobContext context) throws Exception {
        logger.info("***** schedule-print-time **** " + LocalDateTime.now().toString() + "*****");
    }
}
