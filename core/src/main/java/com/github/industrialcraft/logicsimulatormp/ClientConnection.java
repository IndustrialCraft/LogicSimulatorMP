package com.github.industrialcraft.logicsimulatormp;

import com.github.industrialcraft.logicsimulatormp.common.net.MessageRegistryGenerator;
import com.github.industrialcraft.logicsimulatormp.common.proto.generated.*;
import com.github.industrialcraft.netx.ClientMessage;
import com.github.industrialcraft.netx.NetXClient;

public class ClientConnection {
    public final NetXClient client;
    private final ClientMessage.Visitor visitor;
    private final Board board;
    public ClientConnection(Board board) {
        this.board = board;
        this.client = new NetXClient("localhost", 5126, MessageRegistryGenerator.generate());
        this.client.start();
        this.visitor = new ClientMessage.Visitor() {
            @Override
            public void message(NetXClient user, Object msg) {
                System.out.println(msg);
                if(msg instanceof UpdateLogicGateMessage m)
                    board.fromMessage(m);
                if(msg instanceof RemoveLogicGateMessage m)
                    board.fromMessage(m);
                if(msg instanceof UpdateWireMessage m)
                    board.fromMessage(m);
                if(msg instanceof RemoveWireMessage m)
                    board.fromMessage(m);
                if(msg instanceof WireStateMessage m)
                    board.fromMessage(m);
            }
        };
    }
    void readAll(){
        while(client.visitMessage(visitor)){}
    }
    void dispose(){
        client.disconnect();
    }
}
