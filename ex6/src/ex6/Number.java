package ex6;

import java.util.Random;
import java.util.HashMap;

class Number {
    private int power;
    private int base;

    public Number(int power, int base) {
        this.power = power;
        this.base = base;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}

class NumberFactory {

    private static HashMap <String, Number> hm =
            new HashMap<String, Number>();

    public static Number getPlayer(int power, int number) {
        String numberId = Integer.toString(power) + "#" + Integer.toString(number);
        Number num = hm.get(numberId);

        if(num == null) {
            num = new Number(power, number);
            hm.put(Integer.toString(power) + "#" + Integer.toString(number), num);
            System.out.println("Creating number with these params : " + num + ", " + power);
        }
        return num;
    }
}
