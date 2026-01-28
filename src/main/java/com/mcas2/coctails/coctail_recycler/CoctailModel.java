package com.mcas2.coctails.coctail_recycler;

import java.util.List;

public class CoctailModel {
    public String coctailName;
    public String coctailImageUrl;

    public CoctailModel(String coctailName, String coctailImageUrl) {
        this.coctailName = coctailName;
        this.coctailImageUrl = coctailImageUrl;
    }

    public String getCoctailName() {
        return coctailName;
    }

    public String getCoctailImageUrl() {
        return coctailImageUrl;
    }
}
