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
    // 定义静态方法 tune()，参数为父类型引用

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
        // upcasting：由 Wind 子类型象上转型为 Instrument
        // 调用静态方法，传入的参数类型是 Wind 子类型
        // 也即：父类引用指向子类对象 / 父类型变量引用子类型对象 /
        tune(flute);
        tune(violin);

    }
}