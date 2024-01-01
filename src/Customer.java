public class Customer {
    private String name;
    private String contactInformation;
    
    public Customer(String name, String contactInformation) {
        this.name = name;
        this.contactInformation = contactInformation;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContactInformation() {
        return contactInformation;
    }
    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }
    @Override
    public String toString() {
        return "Customer [name=" + name + ", contactInformation=" + contactInformation + "]";
    }
    


    
}
