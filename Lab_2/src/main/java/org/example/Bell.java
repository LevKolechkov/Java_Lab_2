package org.example;

//Задание 3
class Bell {
    boolean dingTime;

    public Bell() {
        this.dingTime = true;
    }

    public String sound() {
        if (dingTime) {
            System.out.println("ding dong");
            dingTime = false;
            return "ding dong";
        } else {
            System.out.println("dong ding");
            dingTime = true;
            return "dong ding";
        }
    }
}
