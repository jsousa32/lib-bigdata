package io.github.jsousa32.lib_bigdata.companies.entities.registration_data;

public class RegistrationData {

    private BasicData basicData;

    private Ordinaldata<Email> emails;

    private Ordinaldata<Address> addresses;

    private Ordinaldata<Phones> phones;

    public BasicData getBasicData() {
        return basicData;
    }

    public Ordinaldata<Email> getEmails() {
        return emails;
    }

    public Ordinaldata<Address> getAddresses() {
        return addresses;
    }

    public Ordinaldata<Phones> getPhones() {
        return phones;
    }
}
