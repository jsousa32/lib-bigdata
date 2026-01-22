package io.github.jsousa32.lib_bigdata.custom.entities;

import java.util.List;

public abstract class Company {

    private String name;

    private String document;

    private List<Email> email;

    private List<Telephone> telephone;

    private List<Address> address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public List<Email> getEmail() {
        return email;
    }

    public void setEmail(List<Email> email) {
        this.email = email;
    }

    public List<Telephone> getTelephone() {
        return telephone;
    }

    public void setTelephone(List<Telephone> telephone) {
        this.telephone = telephone;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public List<Address> getAddress() {
        return address;
    }
}
