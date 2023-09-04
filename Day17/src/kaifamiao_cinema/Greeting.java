package kaifamiao_cinema;

/**
 * ClassName:Greeting
 * Package: kaifamiao_cinema
 * Description:
 *
 * @Author Neko
 * @Create 4/9/20232:06 pm
 * @Version 1.0
 */
public enum Greeting {
    Morning("早上好"), noon("中午好"), afternoon("下午好"), evening("晚上好");
    private String name;
    Greeting() {
    }
    Greeting(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





}
