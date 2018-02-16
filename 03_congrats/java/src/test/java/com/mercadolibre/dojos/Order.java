package com.mercadolibre.dojos;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by nferreyra on 15/2/18.
 */
public class Order {

    private final Map orderFromAPI;

    public Order(Map orderFromAPI) {
        this.orderFromAPI = orderFromAPI;
    }

    public Payment getPayment() {
        ArrayList<Map> payments = (ArrayList<Map>) orderFromAPI.get("payments");

        if(payments.get(0).get("payment_method_id").toString().equals("efecty")){
            return new Efecty(payments.get(0));
        }else{
            return new Visa(payments.get(0));
        }

        //return payments.get(0).get("payment_method_id").toString();
    }
}
