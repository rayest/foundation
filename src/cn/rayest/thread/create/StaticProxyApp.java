package cn.rayest.thread.create;

/**
 * Created by Rayest on 2016/7/8 0008.
 */
/**
 * ����ģʽ
 * 1. ��ʵ��ɫ
 * 2. �����ɫ��������ʵ��ɫ������
 * 3. ����ʵ����ͬ�Ľӿ�
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

// ��ʵ��ɫ
class You implements Marry {
    @Override
    public void marry() {
        System.out.println("you���϶����ˣ�");
    }
}

// �����ɫ
class WeddingCompany implements Marry{
    private Marry you;

    public WeddingCompany() {
    }

    public WeddingCompany(Marry you) {
        this.you = you;
    }

    private void before(){
        System.out.println("��������...");
    }

    private void after(){
        System.out.println("������...");
    }

    @Override
    public void marry() {
        before();
        you.marry();
        after();
    }
}
