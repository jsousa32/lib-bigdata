package io.github.jsousa32.lib_bigdata.addresses.controls;

import io.github.jsousa32.lib_bigdata.addresses.entities.basic_data.BasicData;
import io.github.jsousa32.lib_bigdata.application.entities.enums.Dataset;
import io.github.jsousa32.lib_bigdata.application.entities.enums.Scope;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

final class DefaultAddressService implements AddressService {

    private final UriComponentsBuilder uri;

    private final HttpEntity<String> httpEntity;

    private final RestTemplate restTemplate = new RestTemplate();

    public DefaultAddressService(UriComponentsBuilder uri, HttpEntity<String> httpEntity) {
        this.uri = uri;
        this.httpEntity = httpEntity;
    }

    @Override
    public BasicData basicData(String zipCode) {
        return execute(zipCode, Dataset.BASIC_DATA, BasicData.class);
    }

    private <T> T execute(String zipCode, Dataset dataset, Class<T> responseType) {
        this.uri.pathSegment(Scope.ADDRESS.getLabel()).pathSegment(dataset.getLabel()).queryParam("zipCode", zipCode);

        return restTemplate.exchange(this.uri.toUriString(), HttpMethod.GET, this.httpEntity, responseType).getBody();
    }
}
