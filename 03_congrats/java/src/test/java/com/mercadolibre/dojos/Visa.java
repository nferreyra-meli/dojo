package com.mercadolibre.dojos;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nferreyra on 15/2/18.
 */
public class Visa extends Payment{
    Map visaFromApi;

    public Visa(Map visaFromApi) {
        this.visaFromApi = visaFromApi;
    }

    public Map asMap() {
        return new HashMap(){{
            put("status", "success");
            put("substatus", null);
            put("heading", "¡Tu pago está aprobado!");
            put("title", "Coordina con el vendedor el envío");
        }};
    }
}
