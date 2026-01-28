package com.mcas2.coctails;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textfield.TextInputEditText;
import com.mcas2.coctails.coctail_recycler.CoctailModel;
import com.mcas2.coctails.coctail_recycler.CoctailRecycler;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    CoctailRecycler adaptador;
    ArrayList<CoctailModel> coctailModels = new ArrayList<>();
    ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        RecyclerView coctailRecycler = findViewById(R.id.coctailRecycler);
        TextInputEditText editText = findViewById(R.id.searchBar);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                fillCoctails(coctailRecycler, s.toString());
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}
        });


    }

    public void fillCoctails(RecyclerView coctailRecycler, String search) {
        if (search.length() >= 3) {
            Call<Drinks> call = apiInterface.getCoctailsByIngredient(search);
            call.enqueue(new Callback<Drinks>() {
                @Override
                public void onResponse(Call<Drinks> call, Response<Drinks> response) {
                    Drinks coctails = response.body();
                    for (Drinks.Coctail coctail : coctails.drinks) {
                        CoctailModel coctailModel = new CoctailModel(coctail.coctailName, coctail.coctailImageUrl);
                        coctailModels.add(coctailModel);
                    }

                    int numberOfColums = 1;
                    coctailRecycler.setLayoutManager(new GridLayoutManager(getApplicationContext(), numberOfColums));
                    adaptador = new CoctailRecycler(getApplicationContext(), coctailModels);
                    coctailRecycler.setAdapter(adaptador);
                }

                @Override
                public void onFailure(Call<Drinks> call, Throwable t) {
                    Log.d("CALL -> no funcionó", t.toString());
                }
            });
        }
    }
}