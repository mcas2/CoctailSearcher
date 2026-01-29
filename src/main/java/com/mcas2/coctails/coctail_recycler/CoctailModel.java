package com.mcas2.coctails.coctail_recycler;

import java.util.List;

public class CoctailModel {
    private String coctailId;
    private String coctailName;
    private String coctailImageUrl;

    public CoctailModel(String coctailName, String coctailImageUrl, String coctailId) {
        this.coctailName = coctailName;
        this.coctailImageUrl = coctailImageUrl;
        this.coctailId = coctailId;
    }

    public String getCoctailId() {
        return coctailId;
    }

    public String getCoctailName() {
        return coctailName;
    }

    public String getCoctailImageUrl() {
        return coctailImageUrl;
    }
}
