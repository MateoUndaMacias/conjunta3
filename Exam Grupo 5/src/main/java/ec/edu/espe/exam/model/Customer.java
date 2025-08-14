package ec.edu.espe.exam.model;

/**
 *
 * @author danielpalacios
 */
public class Customer {

    private int idClient;
    private String name;
    private String phone;
    private String email;
    private String address;
    private boolean vip;

    public Customer(int idClient, String name, String phone, String email, String address, boolean vip) {
        this.idClient = idClient;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.vip = vip;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

}
