package org.lili.behavioral.state.ex7;

import java.util.Random;

/**
 * Created by lili on 2017/8/6
 */
public enum Input{
    NICKEL(5),DIME(10),QUARTER(25),DOLLAR(100),
    TOOTHPASTE(200),CHIPS(75),SODA(100),SOAP(50),
    ABORT_TRANSACTION{
        public int amount(){
            throw new RuntimeException("ABORT.amount()");
        }
    },
    STOP{
        public int amount(){
            throw new RuntimeException("SHUT_DOWN.amount()");
        }
    };

    int value;

    Input(int value) {

    }

    Input(){}

    int amount(){
        return value;
    };

    static Random rand = new Random(47);

    public static Input randomSelection(){
        return values()[rand.nextInt(values().length-1)];
    }
}