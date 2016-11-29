package cn.rayest.effective.enums;

/**
 * Created by Rayest on 2016/11/29 0029.
 */
public enum 县衙 {
    // 一般县衙的组成及其等级
    县令(1),
    师爷(2),
    小厮(6),
    捕头(3),
    门房(4),
    衙役(5),;

    // 县衙官员的等级属性
    private final int levelOfOfficer;

    // 县衙构造器，并将枚举的序数(等级)保存在县衙的实例域中
    县衙(int level) {
        this.levelOfOfficer = level;
    }

    // 等级属性的 get 方法，获取等级
    public int getLevelOfOfficer() {
        return levelOfOfficer;
    }
}
