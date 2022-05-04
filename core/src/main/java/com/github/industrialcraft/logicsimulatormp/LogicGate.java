package com.github.industrialcraft.logicsimulatormp;

import com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage;

public class LogicGate {
    private long id;
    private int type;
    private int numInput;
    private int numOutput;
    private long posX;
    private long posY;
    public LogicGate(UpdateLogicGateMessage msg) {
        updateFromMessage(msg);
    }
    public void updateFromMessage(UpdateLogicGateMessage msg){
        this.id = msg.getId();
        this.type = msg.getType();
        this.numInput = msg.getNumInputs();
        this.numOutput = msg.getNumOutputs();
        this.posX = msg.getPosX();
        this.posY = msg.getPosY();
    }

    public long getId() {
        return id;
    }
    public int getType() {
        return type;
    }
    public int getNumInput() {
        return numInput;
    }
    public int getNumOutput() {
        return numOutput;
    }
    public long getPosX() {
        return posX;
    }
    public long getPosY() {
        return posY;
    }
}
