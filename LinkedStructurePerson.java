public class LinkedStructurePerson {
    private String name;
    private String address;
    private LinkedStructurePerson next = null;

    public LinkedStructurePerson(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public LinkedStructurePerson getNext() {
        return next;
    }
    public void setNext(LinkedStructurePerson next) {
        this.next = next;
    }

    public String toString() {
        return "Name: " + name + ", Address: " + address + "\n";
    }
}
