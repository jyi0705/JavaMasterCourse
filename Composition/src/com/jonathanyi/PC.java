package com.jonathanyi;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;
    // PC has Case, Monitor, and motherboard
    // this is composition
    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // fancy graphics

        // instead of using monitor.drawPixelAt you can do getMonitor().drawPixelAt
        // but monitor.drawPixelAt is recommended.
        // getMonitor.drawPixelAt(1200, 50, "yellow");
        monitor.drawPixelAt(1200, 50, "yellow");
    }
//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }

}
