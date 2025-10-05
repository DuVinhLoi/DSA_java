public class TestLinkedStructure2Person {
    public static void main(String[] args) {
        LinkedStructure2Person p1 = new LinkedStructure2Person("Hutao","liyue");
        LinkedStructure2Person p2 = new LinkedStructure2Person("Reyna","Smurf");
        LinkedStructure2Person p3 = new LinkedStructure2Person("Nguyễn Văn Thiệu","Vịt ngang cọng hành");
        LinkedStructure2Person p4 = new LinkedStructure2Person("Bill","USA");
        LinkedStructure2Person p5 = new LinkedStructure2Person("Robute Gulliman","Imperium of Mankind");

        LinkedStructure2NodePerson<LinkedStructure2Person> node1 = new LinkedStructure2NodePerson<>();
        node1.setData(p1);

        LinkedStructure2NodePerson<LinkedStructure2Person> node2 = new LinkedStructure2NodePerson<>(); //Node 2 tham chieu den node 1
        node2.setData(p2);

        LinkedStructure2NodePerson<LinkedStructure2Person> node3 = new LinkedStructure2NodePerson<>(); //Node 3 tham chieu den node 2
        node3.setData(p3);

        LinkedStructure2NodePerson<LinkedStructure2Person> node4 = new LinkedStructure2NodePerson<>(); //Node 4 tham chieu den node 3
        node4.setData(p4);

        LinkedStructure2NodePerson<LinkedStructure2Person> node5 = new LinkedStructure2NodePerson<>(); //Node 5 tham chieu den node 4
        node5.setData(p5);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);

        LinkedStructure2NodePerson<LinkedStructure2Person> head = node1;
        while (head != null) {
            System.out.println(head.getData());
            head = head.getNext();
        }
    }
}
