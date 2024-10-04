package io.github.jsousa32.lib_bigdata.companies.entities.registration_data;

import com.fasterxml.jackson.annotation.JsonAlias;

public class RegistrationData {

    @JsonAlias("BasicData")
    private BasicData basicData;

    @JsonAlias("Emails")
    private Ordinaldata<Email> emails;

    @JsonAlias("Addresses")
    private Ordinaldata<Address> addresses;

    @JsonAlias("Phones")
    private Ordinaldata<Phones> phones;

    public BasicData getBasicData() {
        return basicData;
    }

    public void setBasicData(BasicData basicData) {
        this.basicData = basicData;
    }

    public Ordinaldata<Email> getEmails() {
        return emails;
    }

    public void setEmails(Ordinaldata<Email> emails) {
        this.emails = emails;
    }

    public Ordinaldata<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Ordinaldata<Address> addresses) {
        this.addresses = addresses;
    }

    public Ordinaldata<Phones> getPhones() {
        return phones;
    }

    public void setPhones(Ordinaldata<Phones> phones) {
        this.phones = phones;
    }
}
