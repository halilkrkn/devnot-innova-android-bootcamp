package com.example.locationkullanimi

import android.Manifest
import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.location.Location
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.locationkullanimi.databinding.ActivityMainBinding
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.tasks.Task

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var izinKontrol = 0
    private lateinit var flpc: FusedLocationProviderClient
    private lateinit var locationTask: Task<Location>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        flpc = LocationServices.getFusedLocationProviderClient(this)
        binding.buttonKonumAl.setOnClickListener {
            izinKontrol = ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)

            if (izinKontrol != PackageManager.PERMISSION_GRANTED){
                // Daha önce izin verilmediyse/onaylanmamışsa
                ActivityCompat.requestPermissions(this,
                    arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                    100)
            }else {
                // Daha önce izin onaylanmışsa/verilmişse
                locationTask = flpc.lastLocation
                konumBilgisiAl()

            }
        }
    }

    fun konumBilgisiAl(){
        locationTask.addOnSuccessListener { location ->
            if (location != null){
                binding.textViewEnlem.text = "Enlem : ${location.latitude}"
                binding.textViewBoylam.text = "Boylam : ${location.longitude}"
            }else{
                binding.textViewEnlem.text = "Enlem : Alınamadı"
                binding.textViewEnlem.text = "Boylam : Alınamadı"
            }

        }
    }

    @SuppressLint("MissingSuperCall")
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 100){
            izinKontrol = ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
            if (grantResults.size > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                Toast.makeText(this,"İzin Kabul Edildi.",Toast.LENGTH_SHORT).show()
                locationTask = flpc.lastLocation
                konumBilgisiAl()
            }else{
                Toast.makeText(this,"İzin Reddedildi.",Toast.LENGTH_SHORT).show()

            }
        }
    }
}