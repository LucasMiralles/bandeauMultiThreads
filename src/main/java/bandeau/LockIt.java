package bandeau;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class LockIt extends Bandeau{
    private Lock theLock = new ReentrantLock();

    public void lock(){
        theLock.lock();
    }

    public void unlock(){
        theLock.unlock();
    }
}
