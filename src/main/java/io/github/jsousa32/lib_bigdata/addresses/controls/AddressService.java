package io.github.jsousa32.lib_bigdata.addresses.controls;

import io.github.jsousa32.lib_bigdata.addresses.entities.basic_data.BasicData;
import org.springframework.http.HttpEntity;
import org.springframework.web.util.UriComponentsBuilder;

public interface AddressService {

    static AddressService builder(UriComponentsBuilder uri, HttpEntity<String> httpEntity) {
        return new DefaultAddressService(uri, httpEntity);
    }

    BasicData basicData(String zipCode);
}
