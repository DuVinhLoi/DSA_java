public class LinkedStructure2Person {
    private String name;
    private String address;
    
    public LinkedStructure2Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public void setName(String Name){
        this.name = Name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String Address){
        this.address = Address;
    }

    public String toString() {
        return "Name: " + name + ", Address: " + address + "\n";
    }
}
