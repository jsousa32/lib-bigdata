package io.github.jsousa32.lib_bigdata.addresses.controls;

import io.github.jsousa32.lib_bigdata.addresses.entities.basic_data.BasicData;

public interface AddressService {

    BasicData basicData(String zipCode);
}
