package com.xoom.countryflags.catalog.repository;

import com.xoom.countryflags.catalog.remote.api.CatalogApi;
import com.xoom.countryflags.catalog.remote.datasource.CountryRequestResource;

import java.util.List;

import javax.inject.Inject;

public class CatalogRepository {

    @Inject CatalogApi catalogApi;

    private List<CountryRequestResource> getCountries() {
        return catalogApi.getCountries().getItems();
    }
}
