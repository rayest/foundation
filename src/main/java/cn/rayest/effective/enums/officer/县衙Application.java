package cn.rayest.effective.enums.officer;

/**
 * Created by Rayest on 2016/11/29 0029.
 */
public class 县衙Application {
    public static void main(String[] args) {
        System.out.println(县衙.县令.getLevelOfOfficer());
        System.out.println(县衙.师爷.getLevelOfOfficer());
        System.out.println(县衙.捕头.getLevelOfOfficer());
        System.out.println(县衙.门房.getLevelOfOfficer());
        System.out.println(县衙.衙役.getLevelOfOfficer());
        System.out.println(县衙.小厮.getLevelOfOfficer());
    }
}
