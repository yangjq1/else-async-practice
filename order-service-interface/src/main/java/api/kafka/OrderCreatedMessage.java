package api.kafka;

import core.framework.api.json.Property;
import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;

/**
 * @author Else
 */
public class OrderCreatedMessage {
    @NotBlank
    @NotNull
    @Property(name = "order_id")
    public String orderId;

    @NotNull
    @Property(name = "description")
    public String description;

}
