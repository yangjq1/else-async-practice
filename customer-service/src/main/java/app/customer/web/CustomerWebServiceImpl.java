package app.customer.web;

import app.api.CustomerWebService;
import app.customer.service.CustomerService;
import core.framework.inject.Inject;

/**
 * @author Else
 */
public class CustomerWebServiceImpl implements CustomerWebService {
    @Inject
    CustomerService customerService;

    @Override
    public void print() {
        customerService.print();
    }
}
