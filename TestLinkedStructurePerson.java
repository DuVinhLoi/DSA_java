public class TestLinkedStructurePerson {
    public static void main(String[] args) {
        LinkedStructurePerson p1 = new LinkedStructurePerson("Nguyễn Văn A","VN");
        LinkedStructurePerson p2 = new LinkedStructurePerson("Nguyễn Văn B","VN");
        LinkedStructurePerson p3 = new LinkedStructurePerson("Nguyễn Văn Thiệu","Vịt ngang cọng hành");
        LinkedStructurePerson p4 = new LinkedStructurePerson("Elon Musk","USA");
        LinkedStructurePerson p5 = new LinkedStructurePerson("Robute Gulliman","Imperium of Mankind");

        p1.setNext(p2);
        p2.setNext(p3);
        p3.setNext(p4);
        p4.setNext(p5);

        LinkedStructurePerson p = p1;
        while (p != null) {
            System.out.println(p);
            p = p.getNext();
        }
    }
}
