package com.mercadolibre.dojos;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nferreyra on 15/2/18.
 */
public class Congrats {
    Order order;

    public Congrats(Order order) {
        this.order = order;
    }

    public Map asMap() {
        Map result = order.getPayment().asMap();

        return result;
    }
}
