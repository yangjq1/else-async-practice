package app;

import core.framework.module.App;
import core.framework.module.SystemModule;

/**
 * @author Else
 */
public class OrderServiceApp extends App {
    @Override
    protected void initialize() {
        load(new SystemModule("sys.properties"));
        load(new OrderModule());
    }
}
