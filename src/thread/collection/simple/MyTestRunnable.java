package thread.collection.simple;

import static thread.util.MyLogger.log;

public class MyTestRunnable implements Runnable{
    SimpleList list ;
    int addInt ;
    public MyTestRunnable(SimpleList list,int addInt) {
        this.list = list;
        addInt = addInt;
    }

    @Override
    public void run() {
        list.add(addInt);
        log("myTestlog = " + this.getClass().getSimpleName());
    }
}
