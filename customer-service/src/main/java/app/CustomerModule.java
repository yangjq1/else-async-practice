package app;

import api.kafka.OrderCreatedMessage;
import app.api.CustomerWebService;
import app.customer.job.PrintTimeJob;
import app.customer.kafka.OrderCreatedMessageHandler;
import app.customer.service.CustomerService;
import app.customer.web.CustomerWebServiceImpl;
import core.framework.module.Module;

import java.time.Duration;

/**
 * @author Else
 */
public class CustomerModule extends Module {
    @Override
    protected void initialize() {
        executor().add();
        kafka().subscribe("order-created", OrderCreatedMessage.class, bind(OrderCreatedMessageHandler.class));
        bind(CustomerService.class);
        api().service(CustomerWebService.class, bind(CustomerWebServiceImpl.class));
        schedule().fixedRate("schedule-print-time", new PrintTimeJob(), Duration.ofSeconds(10));
    }
}
