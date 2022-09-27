package com.dam.t02p01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.dam.t02p01.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvTexto.setText(R.string.msg_bt2);
            }
        });
        binding.bt3.setOnClickListener(bt3_OnClickListener);
        binding.bt4.setOnClickListener(new bt4_OnClickListener());

        Log.i(
                getResources().getString(R.string.app_name),
                getResources().getString(R.string.msg_onCreate));
    }

    @Override
    public void onClick(@NonNull View view) {
        if (view.getId() == binding.bt1.getId()) {
            binding.tvTexto.setText(R.string.msg_bt1);
        }
    }

    private final View.OnClickListener bt3_OnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            binding.tvTexto.setText(R.string.msg_bt3);
        }
    };

    private class bt4_OnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            binding.tvTexto.setText(R.string.msg_bt4);
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(
                getResources().getString(R.string.app_name),
                getResources().getString(R.string.msg_onStart));
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(
                getResources().getString(R.string.app_name),
                getResources().getString(R.string.msg_onResume));
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(
                getResources().getString(R.string.app_name),
                getResources().getString(R.string.msg_onPause));
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(
                getResources().getString(R.string.app_name),
                getResources().getString(R.string.msg_onStop));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(
                getResources().getString(R.string.app_name),
                getResources().getString(R.string.msg_onDestroy));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(
                getResources().getString(R.string.app_name),
                getResources().getString(R.string.msg_onRestart));
    }


}