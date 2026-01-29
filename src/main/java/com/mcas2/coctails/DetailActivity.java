package com.mcas2.coctails;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.mcas2.coctails.api_handler.ApiClient;
import com.mcas2.coctails.api_handler.ApiInterface;
import com.mcas2.coctails.dto.CoctailDetailDTO;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailActivity extends AppCompatActivity {

    TextView coctailDetailName;
    TextView coctailDetailInstructions;
    ImageView coctailDetailImage;
    ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Bundle extras=getIntent().getExtras();
        String coctailId = extras.getString("coctailId");

        coctailDetailName = findViewById(R.id.detailCoctailName);
        coctailDetailInstructions = findViewById(R.id.detailCoctailInstructions);
        coctailDetailImage = findViewById(R.id.detailCoctailImage);



        Call<CoctailDetailDTO> call = apiInterface.getCoctailById(coctailId);
        call.enqueue(new Callback<CoctailDetailDTO>() {
            @Override
            public void onResponse(Call<CoctailDetailDTO> call, Response<CoctailDetailDTO> response) {
                CoctailDetailDTO coctails = response.body();
                Log.d("COCTEL", coctails.toString());
                Log.d("COCTEL", coctails.drinks.toString());
                if(!coctails.drinks.isEmpty()) {
                    CoctailDetailDTO.CoctailDetail coctailDetail = coctails.drinks.get(0);
                    coctailDetailName.setText(coctailDetail.strDrink);
                    coctailDetailInstructions.setText(coctailDetail.strInstructionsES);
                    Glide.with(getApplicationContext())
                            .load(coctailDetail.strDrinkThumb)
                            .centerCrop()
                            .placeholder(R.drawable.beber)
                            .into(coctailDetailImage);
                }
            }

            @Override
            public void onFailure(Call<CoctailDetailDTO> call, Throwable t) {

            }
        });


    }
}