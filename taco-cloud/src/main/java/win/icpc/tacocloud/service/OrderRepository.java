package win.icpc.tacocloud.service;

import win.icpc.tacocloud.controller.Entity.Order;

/**
 * @author lucy
 * @date 2021/4/14 23:13
 */
public interface OrderRepository {
    Order save(Order order);
}
