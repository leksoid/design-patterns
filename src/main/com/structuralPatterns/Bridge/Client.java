package com.structuralPatterns.Bridge;

public class Client {
    public static void main (String[] args) {
        testDevice(new RadioImp());
        testDevice(new TvImp());
    }

    public static void testDevice(DeviceImp deviceImp) {
        System.out.println("Tests with basic remote");
        BasicRemote basicRemote = new BasicRemote(deviceImp);
        basicRemote.power();
        deviceImp.printStatus();

        System.out.println("Tests with advanced remoote");
        AdvancedRemote advancedRemote = new AdvancedRemote(deviceImp);
        advancedRemote.power();
        advancedRemote.mute();
        deviceImp.printStatus();
    }

}
