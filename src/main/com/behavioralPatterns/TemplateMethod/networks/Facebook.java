package com.behavioralPatterns.TemplateMethod.networks;

public class Facebook extends Network {

    public Facebook(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    @Override
    boolean logIn(String userName, String password) {
        System.out.println("Checking user's params");
        System.out.println("Name " + userName);
        System.out.println("Password");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.println("*");
        }
        simulateNetworkLatency();
        System.out.println("Login success on Facebook");
        return true;
    }

    @Override
    boolean sendData(byte[] data) {
        boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("message " + new String(data) + " was posted");
            return true;
        } else {
            return false;
        }
    }

    @Override
    void logOut() {
        System.out.println("User " + userName + " has been logged out");
    }

    private void simulateNetworkLatency() {
        try {
            int i =0;
            System.out.println();
            while (i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
