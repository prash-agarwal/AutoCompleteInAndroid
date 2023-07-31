package com.example.autocomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.autocomplete.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        ArrayList<String> arr=new ArrayList<>();
        arr.add("C");
        arr.add("C#");
        arr.add("Java");
        arr.add("Swift");
        arr.add("Kotlin");
        arr.add("R");
        arr.add("Python");
        arr.add("Javascript");
        arr.add("Perl");
        arr.add("Basic");
        arr.add("HTML");
        arr.add("CSS");
        arr.add("JQuery");
        arr.add("XML");
        arr.add("Dart");

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arr);
        binding.autoComplete.setAdapter(adapter);
        binding.autoComplete.setThreshold(1);
    }
}