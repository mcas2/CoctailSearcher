package com.mcas2.coctails.api_handler;

import com.mcas2.coctails.dto.CoctailDetailDTO;
import com.mcas2.coctails.dto.DrinksDTO;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("filter.php")
    Call<DrinksDTO> getCoctailsByIngredient(@Query("i") String ingredient);

    @GET("lookup.php")
    Call<CoctailDetailDTO> getCoctailById(@Query("i") String id);

    @GET("search.php")
    Call<DrinksDTO> getCoctailsByName(@Query("s") String name);
}
