package app.order.service;

import api.kafka.OrderCreatedMessage;
import api.order.CreateOrderRequest;
import core.framework.inject.Inject;
import core.framework.kafka.MessagePublisher;

/**
 * @author Else
 */
public class OrderService {
    @Inject
    MessagePublisher<OrderCreatedMessage> orderCreatedMessageMessagePublisher;

    public void create(CreateOrderRequest request) {
        OrderCreatedMessage message = new OrderCreatedMessage();
        message.orderId = request.id;
        message.description = request.description;
        orderCreatedMessageMessagePublisher.publish(message.orderId, message);
    }
}
