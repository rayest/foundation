package cn.rayest.thread.create;

/**
 * Created by Rayest on 2016/7/8 0008.
 */
/**
 * 代理模式
 * 1. 真实角色
 * 2. 代理角色，持有真实角色的引用
 * 3. 二者实现相同的接口
 *
 * */
public class StaticProxyApp {
    public static void main(String[] args) {
        Marry you = new You();
        WeddingCompany company = new WeddingCompany(you);
        company.marry();
    }
}

interface Marry {
    void marry();
}

// 真实角色
class You implements Marry {
    @Override
    public void marry() {
        System.out.println("you和嫦娥结婚了！");
    }
}

// 代理角色
class WeddingCompany implements Marry{
    private Marry you;

    public WeddingCompany() {
    }

    public WeddingCompany(Marry you) {
        this.you = you;
    }

    private void before(){
        System.out.println("布置猪窝...");
    }

    private void after(){
        System.out.println("闹玉兔...");
    }

    @Override
    public void marry() {
        before();
        you.marry();
        after();
    }
}
