package io.github.jsousa32.lib_bigdata.addresses.controls;

import io.github.jsousa32.lib_bigdata.addresses.entities.basic_data.BasicData;
import io.github.jsousa32.lib_bigdata.application.entities.enums.Scope;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class DefaultAddressService implements AddressService {

    private final UriComponentsBuilder uri;

    private final HttpEntity<String> httpEntity;

    private final RestTemplate restTemplate = new RestTemplate();

    public DefaultAddressService(UriComponentsBuilder uri, HttpEntity<String> httpEntity) {
        this.uri = uri;
        this.httpEntity = httpEntity;
    }

    @Override
    public BasicData basicData(String zipCode) {
        return execute(zipCode, Scope.BASIC_DATA, BasicData.class);
    }

    private <T> T execute(String zipCode, Scope scope, Class<T> responseType) {
        this.uri.queryParam("zipCode", zipCode);
        this.uri.path(scope.getDataset());

        return restTemplate.exchange(this.uri.toUriString(), HttpMethod.GET, this.httpEntity, responseType).getBody();
    }
}
