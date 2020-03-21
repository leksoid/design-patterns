package com.structuralPatterns.Bridge;

/**
 * This is Abstraction
 */
public class BasicRemote implements Remote {

    /**
     * This is Implementor - device
     */
    protected DeviceImp deviceImp;

    public BasicRemote(DeviceImp deviceImp) {
        this.deviceImp = deviceImp;
    }

    @Override
    public void power() {
        System.out.println("Remote: power toggle");
        if (deviceImp.isEnabled()) {
            deviceImp.disable();
        } else {
            deviceImp.enable();
        }
    }

    @Override
    public void volumeUp() {
        System.out.println("Remote: volume up");
        deviceImp.setVolume(deviceImp.getVolume() + 10);
    }

    @Override
    public void volumeDown() {
        System.out.println("Remote: volume down");
        deviceImp.setVolume(deviceImp.getVolume() - 10);
    }

    @Override
    public void channelUp() {
        System.out.println("Remote: channel up");
        deviceImp.setChannel(deviceImp.getChannel() + 1);
    }

    @Override
    public void channelDown() {
        System.out.println("Remote: channel down");
        deviceImp.setChannel(deviceImp.getChannel() - 1);
    }
}
