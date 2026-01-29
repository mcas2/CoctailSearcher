package com.mcas2.coctails.dto;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class CoctailDetailDTO {
    @SerializedName("drinks")
    public List<CoctailDetail> drinks = new ArrayList<>();

    public class CoctailDetail {
        @SerializedName("idDrink")
        public String idDrink;
        @SerializedName("strDrink")
        public String strDrink;
        @SerializedName("strDrinkAlternate")
        public String strDrinkAlternate;
        @SerializedName("strTags")
        public String strTags;
        @SerializedName("strVideo")
        public String strVideo;
        @SerializedName("strCategory")
        public String strCategory;
        @SerializedName("strIBA")
        public String strIBA;
        @SerializedName("strAlcoholic")
        public String strAlcoholic;
        @SerializedName("strGlass")
        public String strGlass;
        @SerializedName("strInstructions")
        public String strInstructions;
        @SerializedName("strInstructionsES")
        public String strInstructionsES;
        @SerializedName("strInstructionsDE")
        public String strInstructionsDE;
        @SerializedName("strInstructionsFR")
        public String strInstructionsFR;
        @SerializedName("strInstructionsIT")
        public String strInstructionsIT;
        @SerializedName("strInstructionsZH")
        public String strInstructionsZH;
        @SerializedName("strDrinkThumb")
        public String strDrinkThumb;
        @SerializedName("strIngredient1")
        public String strIngredient1;
        @SerializedName("strIngredient2")
        public String strIngredient2;
        @SerializedName("strIngredient3")
        public String strIngredient3;
        @SerializedName("strIngredient4")
        public String strIngredient4;
        @SerializedName("strIngredient5")
        public String strIngredient5;
        @SerializedName("strIngredient6")
        public String strIngredient6;
        @SerializedName("strIngredient7")
        public String strIngredient7;
        @SerializedName("strIngredient8")
        public String strIngredient8;
        @SerializedName("strIngredient9")
        public String strIngredient9;
        @SerializedName("strIngredient10")
        public String strIngredient10;
        @SerializedName("strIngredient11")
        public String strIngredient11;
        @SerializedName("strIngredient12")
        public String strIngredient12;
        @SerializedName("strIngredient13")
        public String strIngredient13;
        @SerializedName("strIngredient14")
        public String strIngredient14;
        @SerializedName("strIngredient15")
        public String strIngredient15;
        @SerializedName("strMeasure1")
        public String strMeasure1;
        @SerializedName("strMeasure2")
        public String strMeasure2;
        @SerializedName("strMeasure3")
        public String strMeasure3;
        @SerializedName("strMeasure4")
        public String strMeasure4;
        @SerializedName("strMeasure5")
        public String strMeasure5;
        @SerializedName("strMeasure6")
        public String strMeasure6;
        @SerializedName("strMeasure7")
        public String strMeasure7;
        @SerializedName("strMeasure8")
        public String strMeasure8;
        @SerializedName("strMeasure9")
        public String strMeasure9;
        @SerializedName("strMeasure10")
        public String strMeasure10;
        @SerializedName("strMeasure11")
        public String strMeasure11;
        @SerializedName("strMeasure12")
        public String strMeasure12;
        @SerializedName("strMeasure13")
        public String strMeasure13;
        @SerializedName("strMeasure14")
        public String strMeasure14;
        @SerializedName("strMeasure15")
        public String strMeasure15;
        @SerializedName("strImageSource")
        public String strImageSource;
        @SerializedName("strImageAttribution")
        public String strImageAttribution;
        @SerializedName("strCreativeCommonsConfirmed")
        public String strCreativeCommonsConfirmed;
        @SerializedName("dateModified")
        public String dateModified;
    }

}
