public class TestGeneric {
    
    public static <T> double tinhTBC(T[] mang) {
        double tong = 0;
        for(int i=0;i<mang.length;i++) {
            double value = Double.valueOf(mang[i] + ""); //ép kiểu
            tong += value;
        }
        return tong/mang.length;
    }

    public static void main(String[] args) {
        Integer mangInt[] = {4,2,3};
        System.out.println("Mang int: " + tinhTBC(mangInt));
        Float mangFloat[] = {4.5f,1.5f};
        System.out.println("Mang float: " + tinhTBC(mangFloat));
    }
}
