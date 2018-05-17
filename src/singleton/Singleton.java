package singleton;

public class Singleton {
    private static Object uniqueObject;
    
    public Object getInstance() {
        if(uniqueObject == null) {
            //默认组件是在多线程环境上使用
            synchronized(this) {
                //判断两次
                if(uniqueObject == null) {
                    uniqueObject = new Object();
                }
            }
        }
        return uniqueObject;
    }
}
