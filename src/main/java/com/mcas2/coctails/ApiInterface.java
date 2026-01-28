package com.mcas2.coctails;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("filter.php")
    Call<Drinks> getCoctailsByIngredient(@Query("i") String ingredient);

    @GET("search.php")
    Call<Drinks> getCoctailsByName(@Query("s") String name);
}
