package app.customer.kafka;

import api.kafka.OrderCreatedMessage;
import core.framework.kafka.MessageHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Else
 */
public class OrderCreatedMessageHandler implements MessageHandler<OrderCreatedMessage> {
    private final Logger logger = LoggerFactory.getLogger(OrderCreatedMessageHandler.class);

    @Override
    public void handle(String key, OrderCreatedMessage value) throws Exception {
        logger.info("****** get message:" + key + ":" + value.description);
    }
}
