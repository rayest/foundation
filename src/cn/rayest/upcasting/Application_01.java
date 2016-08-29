package cn.rayest.upcasting;


import static cn.rayest.upcasting.Music.tune;

enum Note{
    MIDDLE_C, C_SHARP, B_FLAT;
}

class Music{
    static void tune(Instrument instrument) {
         instrument.play(Note.MIDDLE_C);
    }
}

class Instrument {
    public void play(Note note) {
        System.out.println("Instrument.play()...");
    }
    // ���徲̬���� tune()������Ϊ����������

}
class Wind extends Instrument {
    public void play(Note note){
        System.out.println("Wind.play()...");
    }
}
class Stringed extends Instrument {
    public void play(Note note){
        System.out.println("Stringed.play()...");
    }
}

public class Application_01 {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        // upcasting���� Wind ����������ת��Ϊ Instrument
        // ���þ�̬����������Ĳ��������� Wind ������
        // Ҳ������������ָ��������� / �����ͱ������������Ͷ��� /
        tune(flute);
        tune(violin);

    }
}