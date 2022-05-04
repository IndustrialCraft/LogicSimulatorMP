package com.github.industrialcraft.logicsimulatormp;

import com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateWireMessage;

public class Wire {
    private long wireID;
    private long gateA;
    private int pinA;
    private boolean outputA;
    private long gateB;
    private int pinB;
    private boolean outputB;
    public boolean powered;
    public Wire(UpdateWireMessage msg) {
        updateFromMessage(msg);
        this.powered = false;
    }
    public void updateFromMessage(UpdateWireMessage msg){
        this.wireID = msg.getWireID();
        this.gateA = msg.getIdA();
        this.pinA = msg.getPinA();
        this.outputA = msg.getOutputA();
        this.gateB = msg.getIdB();
        this.pinB = msg.getPinB();
        this.outputB = msg.getOutputB();
    }

    public long getWireID() {
        return wireID;
    }
    public long getGateA() {
        return gateA;
    }
    public int getPinA() {
        return pinA;
    }
    public long getGateB() {
        return gateB;
    }
    public int getPinB() {
        return pinB;
    }
    public boolean isOutputA() {
        return outputA;
    }
    public boolean isOutputB() {
        return outputB;
    }
}
