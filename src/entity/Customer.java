package entity;

public class Customer {
    private String customerId;
    private String name;
    private String address;
    private String contact;
    private String nic;

    public Customer() { }

    public Customer(String customerId, String name, String address, String contact, String nic) {
        this.setCustomerId(customerId);
        this.setName(name);
        this.setAddress(address);
        this.setContact(contact);
        this.setNic(nic);
    }

    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String id) {
        this.customerId = id;
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

    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getNic() {
        return nic;
    }
    public void setNic(String nic) {
        this.nic = nic;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + getCustomerId() + '\'' +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", contact='" + getContact() + '\'' +
                ", nic='" + getNic() + '\'' +
                '}';
    }
}
