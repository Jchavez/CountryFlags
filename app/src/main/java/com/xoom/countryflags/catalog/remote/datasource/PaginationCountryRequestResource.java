package com.xoom.countryflags.catalog.remote.datasource;

import java.util.List;

public class PaginationCountryRequestResource {

    private int totalItems;
    private int totalPages;
    private List<CountryRequestResource> items;

    public int getTotalItems() {
        return totalItems;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public List<CountryRequestResource> getItems() {
        return items;
    }
}

