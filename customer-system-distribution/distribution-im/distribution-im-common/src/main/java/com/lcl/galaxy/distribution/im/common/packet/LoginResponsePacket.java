package com.lcl.galaxy.distribution.im.common.packet;


import com.lcl.galaxy.distribution.im.common.protocol.Command;

public class LoginResponsePacket extends BaseReponsePacket {

    @Override
    public Byte getCommand() {
        return Command.LOGIN_RESPONSE;
    }
}
