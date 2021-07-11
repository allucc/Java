package win.icpc.tacocloud.service;

import win.icpc.tacocloud.controller.Entity.Taco;

/**
 * @author lucy
 * @date 2021/4/14 23:12
 */
public interface TacoRepository {
    Taco save(Taco design);
}
