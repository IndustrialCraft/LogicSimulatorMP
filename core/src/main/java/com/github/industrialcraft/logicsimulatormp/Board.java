package com.github.industrialcraft.logicsimulatormp;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.github.industrialcraft.logicsimulatormp.common.proto.generated.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    private static final int GATE_WIDTH = 30;
    private static final int PIN_LENGTH = 7;

    public Map<Long,LogicGate> gates;
    public Map<Long,Wire> wires;
    private BitmapFont font;
    private GlyphLayout layout;
    public Board() {
        this.gates = new HashMap<>();
        this.wires = new HashMap<>();
        this.font = new BitmapFont();
        this.layout = new GlyphLayout();
    }
    public void render(ShapeRenderer renderer){
        renderer.setColor(0, 0, 0, 1);
        for(LogicGate gate : gates.values()){
            renderer.rect(gate.getPosX(), gate.getPosY(), GATE_WIDTH, getGateHeight(gate));
            for(int i = 0;i < gate.getNumInput();i++){
                int height = getPinHeight(gate, true, i);
                renderer.line(gate.getPosX()-PIN_LENGTH, gate.getPosY()+height, gate.getPosX(), gate.getPosY()+height);
            }
            for(int i = 0;i < gate.getNumOutput();i++){
                int height = getPinHeight(gate, false, i);
                renderer.line(gate.getPosX()+GATE_WIDTH, gate.getPosY()+height, gate.getPosX()+GATE_WIDTH+PIN_LENGTH, gate.getPosY()+height);
            }
        }
        for(Wire wire : wires.values()){
            renderer.setColor(wire.powered?1:0, 0, 0, 1);
            LogicGate A = gates.get(wire.getGateA());
            LogicGate B = gates.get(wire.getGateB());
            long xA = wire.isOutputA()?A.getPosX()+GATE_WIDTH+PIN_LENGTH:A.getPosX()-PIN_LENGTH;
            long xB = wire.isOutputB()?B.getPosX()+GATE_WIDTH+PIN_LENGTH:B.getPosX()-PIN_LENGTH;
            renderer.line(xA, A.getPosY()+getPinHeight(A, !wire.isOutputA(), wire.getPinA()), xB, B.getPosY()+getPinHeight(B, !wire.isOutputB(), wire.getPinB()));
        }
    }
    public void renderText(SpriteBatch batch){
        font.setColor(0, 0, 0, 1);
        for(LogicGate gate : gates.values()){
            String text = ""+gate.getType();
            layout.setText(font, text);
            font.draw(batch, text, gate.getPosX() + (GATE_WIDTH/2) - (layout.width/2), gate.getPosY() + (getGateHeight(gate)/2) + (layout.height/2));
        }
    }
    public int getGateHeight(LogicGate gate){
        int maxPins = Math.max(gate.getNumInput(), gate.getNumOutput());
        return 10+(maxPins*15);
    }
    public int getPinHeight(LogicGate gate, boolean input, int pin){
        int totalNum = input?gate.getNumInput():gate.getNumOutput();
        int height = getGateHeight(gate);
        return 5 + pin*15;
    }
    public void fromMessage(UpdateWireMessage msg){
        if(wires.containsKey(msg.getWireID()))
            wires.get(msg.getWireID()).updateFromMessage(msg);
        else
            wires.put(msg.getWireID(), new Wire(msg));
    }
    public void fromMessage(RemoveWireMessage msg){
        wires.remove(msg.getWireID());
    }
    public void fromMessage(UpdateLogicGateMessage msg){
        if(gates.containsKey(msg.getId()))
            gates.get(msg.getId()).updateFromMessage(msg);
        else
            gates.put(msg.getId(), new LogicGate(msg));
    }
    public void fromMessage(RemoveLogicGateMessage msg) {
        gates.remove(msg.getGateID());
    }
    public void fromMessage(WireStateMessage msg) {
        wires.get(msg.getWireID()).powered = msg.getState();
    }
}
