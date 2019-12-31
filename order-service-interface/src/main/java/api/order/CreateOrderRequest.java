package api.order;

import core.framework.api.json.Property;
import core.framework.api.validate.NotBlank;
import core.framework.api.validate.NotNull;

/**
 * @author Else
 */
public class CreateOrderRequest {
    @NotBlank
    @NotNull
    @Property(name = "id")
    public String id;

    @NotNull
    @Property(name = "description")
    public String description;
}
