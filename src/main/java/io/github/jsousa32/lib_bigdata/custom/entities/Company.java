package io.github.jsousa32.lib_bigdata.custom.entities;

import java.util.List;

public abstract class Company {

    private String name;

    private String document;

    private List<Email> emails;

    private List<Telephone> telephones;

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

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public List<Telephone> getTelephones() {
        return telephones;
    }

    public void setTelephone(List<Telephone> telephones) {
        this.telephones = telephones;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public List<Address> getAddress() {
        return address;
    }
}
