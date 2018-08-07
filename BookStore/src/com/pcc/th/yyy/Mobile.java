package com.pcc.th.yyy;

public class Mobile {
    void call() {
        System.out.println("call");
    }

    void playMusic() {
        System.out.println();
    }
}

class SamSung extends Mobile {
}

class IPhone extends Mobile {
    @Override
    void call() {
        super.call();
    }
}