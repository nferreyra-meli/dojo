package com.mercadolibre.dojos;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nferreyra on 15/2/18.
 */
public class Efecty extends Payment{

    Map efectyFromApi;

    public Efecty(Map efectyFromApi) {
        this.efectyFromApi = efectyFromApi;
    }

    public String getPaymentMethodId() {
        return efectyFromApi.get("payment_method_id").toString();
    }

    public Map asMap() {
        return new HashMap(){{
            put("status", "success");
            put("substatus", null);
            put("heading", "¡Apúrate a pagar!");
            put("title", "Paga ${price} en ${paymentMethodName} para reservar tu compra");
        }};
    }
}
