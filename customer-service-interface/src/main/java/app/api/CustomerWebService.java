package app.api;

import core.framework.api.web.service.GET;
import core.framework.api.web.service.Path;

import java.util.concurrent.ExecutionException;

/**
 * @author Else
 */
public interface CustomerWebService {
    @GET
    @Path("/customer/print")
    void print() throws ExecutionException, InterruptedException;
}
