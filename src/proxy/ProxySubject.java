package proxy;

public class ProxySubject implements ISubject {

    private RealSubject realSubject;

    @Override
    public void request() {
        this.preRequest();
        if (null == realSubject) {
            this.realSubject = new RealSubject();
        }
        this.realSubject.request();
        this.postRequest();
    }

    //代理的自己事情
    public void preRequest() {
        System.out.println("在请求前代理加了前提！");
    }

    public void postRequest() {
        System.out.println("在请求后代理加了事后处理！");
    }
}
