package com.example.amazonuiclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.amazonuiclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // Bottom Navigation Kodlaması
        // Oluşturmuş olduğumuz bottom_nav_graph özelliği oluşturmş olduğumuz fragmentlerle kullanabilmek için navHostFragment e aktarıyoruz.
        val nav_hos_fragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        //        // activity_main içerisinde oluşturduğumuz bottom navigation view bileşeninin kurulumunu yaptık ve sayfalar arası geçişleri sağlaması içinde navControllerı veriyoruz.
        NavigationUI.setupWithNavController(binding.bottomNav, nav_hos_fragment.navController)

    }
}