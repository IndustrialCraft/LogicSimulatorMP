package com.github.industrialcraft.logicsimulatormp.server;

import com.github.industrialcraft.logicsimulatormp.common.net.MessageRegistryGenerator;
import com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateLogicGateMessage;
import com.github.industrialcraft.logicsimulatormp.common.proto.generated.UpdateWireMessage;
import com.github.industrialcraft.logicsimulatormp.common.proto.generated.WireStateMessage;
import com.github.industrialcraft.netx.NetXServer;
import com.github.industrialcraft.netx.ServerMessage;
import com.github.industrialcraft.netx.SocketUser;

/** Launches the server application. */
public class ServerLauncher {
	public static void main(String[] args) {
		NetXServer server = new NetXServer(5126, MessageRegistryGenerator.generate());
		server.start();
		ServerMessage.Visitor visitor = new ServerMessage.Visitor() {
			@Override
			public void connect(SocketUser user) {
				System.out.println("connect");
				user.send(UpdateLogicGateMessage.newBuilder().setId(55).setType(0).setNumInputs(2).setNumOutputs(1).setPosX(5).setPosY(-10).build());
				user.send(UpdateLogicGateMessage.newBuilder().setId(45).setType(1).setNumInputs(2).setNumOutputs(4).setPosX(60).setPosY(-10).build());
				user.send(UpdateWireMessage.newBuilder().setWireID(22).setIdA(55).setPinA(0).setOutputA(true).setIdB(45).setPinB(1).setOutputB(false).build());
				user.send(WireStateMessage.newBuilder().setWireID(22).setState(false).build());
			}

			@Override
			public void disconnect(SocketUser user) {

			}

			@Override
			public void message(SocketUser user, Object msg) {

			}
		};
		while (true){
			server.visitMessage(visitor);
		}
	}
}