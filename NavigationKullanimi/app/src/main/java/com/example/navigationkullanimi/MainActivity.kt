package com.example.navigationkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.example.navigationkullanimi.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var navController: NavController
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main) Navigation Component İlk dersi içindi.
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        // Oluşturmuş olduğumuz bottom_nav_graph özelliği oluşturmş olduğumuz fragmentlerle kullanabilmek için navHostFragment e aktarıyoruz.
//        val navHostFragment =
//            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
//        // navHostFragment içerisinde sayfalar arası geçiş olması için findNavController() fonksiyonu kullanıldı.
//        navController = navHostFragment.findNavController()
//
//        // activity_main içerisinde oluşturduğumuz bottom navigation view bileşeninin kurulumunu yaptık ve sayfalar arası geçişleri sağlaması içinde navControllerı veriyoruz.
//        bottomNav.setupWithNavController(navController)


        // Bottom Navigation Kodlaması
        val nav_hos_fragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        NavigationUI.setupWithNavController(binding.bottomNav,nav_hos_fragment.navController)


    }
}