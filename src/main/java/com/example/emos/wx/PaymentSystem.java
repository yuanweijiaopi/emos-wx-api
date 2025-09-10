package com.example.emos.wx;

import java.util.Arrays;
import java.util.List;

public enum PaymentSystem {

    PAYSHIELD("PayShield", "PayShield",
            Arrays.asList(
                    "siteName", "sid", "rcode", "requestUrl"
            ),
            Arrays.asList(
                    "reject", "transfer", "coerce", "fee"
            ));

    private final String code;
    private final String name;
    private final List<String> Servicer;
    private final List<String> configs;


    PaymentSystem(String code, String name, List<String> Servicer, List<String> configs) {
        this.code = code;
        this.name = name;
        this.Servicer = Servicer;
        this.configs = configs;
    }


    public static PaymentSystem getByName(String name) {
        if (name == null || name.trim().isEmpty()) {
            return null; // 允许 name 为空
        }
        return Arrays.stream(values())
                .filter(e -> e.name.equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public static String getNameByCode(String code) {
        for (PaymentSystem servicer : PaymentSystem.values()) {
            if (servicer.code.equalsIgnoreCase(code)) {
                return servicer.name;
            }
        }
        return null;
    }


    public static List<String> getServiceByCode(String code) {
        for (PaymentSystem servicer : PaymentSystem.values()) {
            if (servicer.code.equalsIgnoreCase(code)) {
                return servicer.Servicer;
            }
        }
        return null;
    }


    public static void main(String[] args) {

        List<String> serviceByCode = PaymentSystem.getServiceByCode("PayShield");
        String s = serviceByCode.get(1);
        System.out.println(s);
        System.out.println(serviceByCode);


    }






}
