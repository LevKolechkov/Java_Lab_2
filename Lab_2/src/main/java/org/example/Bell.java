package org.example;

//Задание 3
class Bell {
    boolean dingTime;

    public Bell() {
        this.dingTime = true;
    }

    public void sound() {
        if (dingTime) {
            System.out.println("ding dong");
            dingTime = false;
        } else {
            System.out.println("dong ding");
            dingTime = true;
        }
    }
}
