package app;

import api.OrderWebService;
import api.kafka.OrderCreatedMessage;
import app.order.service.OrderService;
import app.order.web.OrderWebServiceImpl;
import core.framework.module.Module;

/**
 * @author Else
 */
public class OrderModule extends Module {
    @Override
    protected void initialize() {
        kafka().publish("order-created", OrderCreatedMessage.class);
        bind(OrderService.class);
        api().service(OrderWebService.class, bind(OrderWebServiceImpl.class));
    }
}
