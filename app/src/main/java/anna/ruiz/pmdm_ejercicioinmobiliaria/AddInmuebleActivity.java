package anna.ruiz.pmdm_ejercicioinmobiliaria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import anna.ruiz.pmdm_ejercicioinmobiliaria.databinding.ActivityAddInmuebleBinding;

public class AddInmuebleActivity extends AppCompatActivity {

    private ActivityAddInmuebleBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_add_inmueble);
        binding = ActivityAddInmuebleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}