import java.util.Scanner;
public class TestBaiTapGenericDictionary {
    public static void main(String[] args) {
        BaiTapGenericDictionary<String, String> d1 = new BaiTapGenericDictionary<String, String>("hello", "xin chao");
        System.err.println(d1.toString());

    }
}