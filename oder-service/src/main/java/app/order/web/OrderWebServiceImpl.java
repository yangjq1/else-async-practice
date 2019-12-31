package app.order.web;

import api.OrderWebService;
import api.order.CreateOrderRequest;
import app.order.service.OrderService;
import core.framework.inject.Inject;

/**
 * @author Else
 */
public class OrderWebServiceImpl implements OrderWebService {
    @Inject
    OrderService orderService;

    @Override
    public void create(CreateOrderRequest request) {
        orderService.create(request);
    }
}
