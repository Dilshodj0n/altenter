package service;

import entity.User;

public class Auth {

    private User ser;
    private User use;

    public void service(){

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Dilshod nima gap?");
    }

    public Auth(User ser, User use) {
        this.ser = ser;
        this.use = use;
    }

    public User getSer() {
        return ser;
    }

    public void setSer(User ser) {
        this.ser = ser;
    }

    public User getUse() {
        return use;
    }

    public void setUse(User use) {
        this.use = use;
    }

    @Override
    public String toString() {
        return "Auth{" +
                "ser=" + ser +
                ", use=" + use +
                '}';
    }
}
