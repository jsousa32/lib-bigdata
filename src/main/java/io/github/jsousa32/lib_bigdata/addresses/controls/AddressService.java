package io.github.jsousa32.lib_bigdata.addresses.controls;

import io.github.jsousa32.lib_bigdata.addresses.entities.basic_data.BasicData;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.util.UriComponentsBuilder;

public interface AddressService {

    static AddressService builder(UriComponentsBuilder uri, HttpHeaders headers) {
        return new DefaultAddressService(uri, headers);
    }

    BasicData basicData(String zipCode);
}
