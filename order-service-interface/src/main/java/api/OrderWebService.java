package api;

import api.order.CreateOrderRequest;
import core.framework.api.web.service.POST;
import core.framework.api.web.service.Path;

/**
 * @author Else
 */
public interface OrderWebService {
    @POST
    @Path("/order")
    void create(CreateOrderRequest request);
}
