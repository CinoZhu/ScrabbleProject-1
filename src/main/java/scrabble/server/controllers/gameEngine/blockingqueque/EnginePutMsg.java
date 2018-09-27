package scrabble.server.controllers.gameEngine.blockingqueque;

import scrabble.protocols.Package;

import java.util.concurrent.BlockingQueue;

public class EnginePutMsg implements Runnable {
    public EnginePutMsg(BlockingQueue<Package> toCenter) {
        this.toCenter = toCenter;
    }

    private BlockingQueue<Package> toCenter;
    @Override
    public void run() {
        try {
            toCenter.put(new Package(1,""));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
