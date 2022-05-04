package com.github.industrialcraft.logicsimulatormp.common.net;

import com.github.industrialcraft.logicsimulatormp.common.proto.generated.*;
import com.github.industrialcraft.netx.MessageRegistry;

public class MessageRegistryGenerator {
    public static MessageRegistry generate(){
        MessageRegistry registry = new MessageRegistry();
        registry.register(1, new MessageRegistry.MessageDescriptor(UpdateLogicGateMessage.class, stream -> UpdateLogicGateMessage.parseFrom(stream), (obj, stream) -> ((UpdateLogicGateMessage)obj).writeTo(stream)));
        registry.register(2, new MessageRegistry.MessageDescriptor(RemoveLogicGateMessage.class, stream -> RemoveLogicGateMessage.parseFrom(stream), (obj, stream) -> ((RemoveLogicGateMessage)obj).writeTo(stream)));
        registry.register(3, new MessageRegistry.MessageDescriptor(UpdateWireMessage.class, stream -> UpdateWireMessage.parseFrom(stream), (obj, stream) -> ((UpdateWireMessage)obj).writeTo(stream)));
        registry.register(4, new MessageRegistry.MessageDescriptor(RemoveWireMessage.class, stream -> RemoveWireMessage.parseFrom(stream), (obj, stream) -> ((RemoveWireMessage)obj).writeTo(stream)));
        registry.register(5, new MessageRegistry.MessageDescriptor(WireStateMessage.class, stream -> WireStateMessage.parseFrom(stream), (obj, stream) -> ((WireStateMessage)obj).writeTo(stream)));
        return registry;
    }
}
