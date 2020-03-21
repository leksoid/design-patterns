package com.structuralPatterns.Bridge;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(DeviceImp deviceImp) {
        super(deviceImp);
    }

    public void mute() {
        System.out.println("Remote: mute");
        deviceImp.setVolume(0);
    }
}
