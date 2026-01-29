package com.mcas2.coctails.dto;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class DrinksDTO {
    @SerializedName("drinks")
    public List<Coctail> drinks = new ArrayList<>();
    public class Coctail {
        @SerializedName("strDrink")
        public String coctailName;

        @SerializedName("strDrinkThumb")
        public String coctailImageUrl;

        @SerializedName("idDrink")
        public String coctailId;

    }
}
