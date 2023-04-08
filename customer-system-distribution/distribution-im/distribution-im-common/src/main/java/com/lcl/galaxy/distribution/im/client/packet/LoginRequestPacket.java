package com.lcl.galaxy.distribution.im.client.packet;

import com.lcl.galaxy.distribution.im.client.protocol.Command;
import com.lcl.galaxy.distribution.im.client.protocol.Packet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequestPacket extends Packet {

    private String userId;
    private String userName;
    //private String password;

    @Override
    public Byte getCommand() {
        return Command.LOGIN_REQUEST;
    }
}