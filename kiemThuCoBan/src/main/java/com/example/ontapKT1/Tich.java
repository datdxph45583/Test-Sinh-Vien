package com.example.ontapKT1;

public class Tich {
    public int tich(String a, String b) {
        try {
            if (Integer.parseInt(a) < -10000 || Integer.parseInt(a) > 10000 || Integer.parseInt(b) < -10000 || Integer.parseInt(b) > 10000) {
                throw new IllegalArgumentException("So a, b nam trong khoang tu -10000 den 10000");
            }else {
                int tich = 0;
                tich = Integer.parseInt(a) * Integer.parseInt(b);
                return tich;
            }
        }catch (IllegalArgumentException e){
            throw new IllegalArgumentException("a, b phai là so nguyen");
        }
    }
}
