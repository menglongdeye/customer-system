package com.lcl.galaxy.distribution.im.client.server;

import com.lcl.galaxy.distribution.im.client.handler.LoginRequestHandler;
import com.lcl.galaxy.distribution.im.client.handler.MessageRequestHandler;
import com.lcl.galaxy.distribution.im.client.handler.PacketCodecHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Server {

    private static int port = 8886;

    public static void start(){
        NioEventLoopGroup boss = new NioEventLoopGroup();
        NioEventLoopGroup worker = new NioEventLoopGroup();
        ServerBootstrap bootstrap = new ServerBootstrap();
        bootstrap.group(boss, worker).channel(NioServerSocketChannel.class)
                .childHandler(new ChannelInitializer<NioSocketChannel>() {
                    @Override
                    protected void initChannel(NioSocketChannel nioSocketChannel) throws Exception {
                        nioSocketChannel.pipeline().addLast(PacketCodecHandler.getInstance());
                        nioSocketChannel.pipeline().addLast(LoginRequestHandler.getInstance());
                        nioSocketChannel.pipeline().addLast(MessageRequestHandler.getInstance());
                    }
                });

        ChannelFuture future = bootstrap.bind(port);
        future.addListener(new ChannelFutureListener() {
            @Override
            public void operationComplete(ChannelFuture channelFuture) throws Exception {
                if(channelFuture.isSuccess()){
                    log.info("server 启动成功，端口号：{}", port);
                }else {
                    log.info("server 启动失败，端口号：{}", port);
                    channelFuture.cause().printStackTrace();
                    System.exit(0);
                }
            }
        });
    }
}