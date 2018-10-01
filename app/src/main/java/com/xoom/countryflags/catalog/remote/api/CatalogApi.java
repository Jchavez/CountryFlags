package com.xoom.countryflags.catalog.remote.api;

import com.xoom.countryflags.catalog.remote.datasource.PaginationCountryRequestResource;

import retrofit2.http.GET;

public interface CatalogApi {

    @GET("v2/countries")
    PaginationCountryRequestResource getCountries();
}
