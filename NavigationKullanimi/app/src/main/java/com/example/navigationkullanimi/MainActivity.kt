package com.example.navigationkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.example.navigationkullanimi.databinding.ActivityMainBinding
import com.example.navigationkullanimi.databinding.NavDrawerMainBinding
import com.example.navigationkullanimi.databinding.NavigationBaslikBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.nav_drawer_main.*
import kotlinx.android.synthetic.main.navigation_baslik.view.*

class MainActivity : AppCompatActivity() {
    lateinit var navController: NavController
    private lateinit var binding: NavDrawerMainBinding
    private lateinit var navigation_baslik: NavigationBaslikBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main) Navigation Component İlk dersi içindi.
        binding = NavDrawerMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        // Drawer Navigation Kodlaması
        // Oluşturmuş olduğumuz bottom_nav_graph özelliği oluşturmş olduğumuz fragmentlerle kullanabilmek için navHostFragment e aktarıyoruz.
        val nav_hos_fragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        // activity_main içerisinde oluşturduğumuz drawer navigation view bileşeninin kurulumunu yaptık ve sayfalar arası geçişleri sağlaması içinde navControllerı veriyoruz.
        NavigationUI.setupWithNavController(binding.navigationView,nav_hos_fragment.navController)


        // ToolBar Kodlaması
        binding.toolbar.title = "Başlık"

        // Toolbarda Toggle Koodlaması
        val toggle = ActionBarDrawerToggle(this,binding.drawer,binding.toolbar,0,0)
        // toogle ı drawer menu ye eklledik.
        binding.drawer.addDrawerListener(toggle)
        toggle.syncState()

        // toggle içerisine başka bir layout ile görselleştirdik ve görselleştirmiş olduğumuz layotu çağırıp içerisinde avar olan textview e burdan veri gönderdik..
        val navDrawerBaslik = binding.navigationView.inflateHeaderView(R.layout.navigation_baslik)
        navDrawerBaslik.textViewBaslik.text = "Merhaba"

    }

    // Toogle Drawer ın açıldığında geri tuşuna basıldığında sadece drawer ı kapatmak için yazılan bir kodtur.
    // Aksi halde yazılmasaydı drawerı geri tuşu ile kapatmaya çalıştığımızda uygulamadan çıkıyordu.
    override fun onBackPressed() {
        if (binding.drawer.isDrawerOpen(GravityCompat.START)){
            binding.drawer.closeDrawer(GravityCompat.START)
        }else {
            super.onBackPressed()
        }
    }
}


/* todo: BURADAKİ KODLAR BOTTOM NAVİGATİON KODLARI

class MainActivity : AppCompatActivity() {
    lateinit var navController: NavController
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main) Navigation Component İlk dersi içindi.
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        // Bottom Navigation Kodlaması
        // Oluşturmuş olduğumuz bottom_nav_graph özelliği oluşturmş olduğumuz fragmentlerle kullanabilmek için navHostFragment e aktarıyoruz.
        val nav_hos_fragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        //        // activity_main içerisinde oluşturduğumuz bottom navigation view bileşeninin kurulumunu yaptık ve sayfalar arası geçişleri sağlaması içinde navControllerı veriyoruz.
        NavigationUI.setupWithNavController(binding.bottomNav,nav_hos_fragment.navController)


    }
}*/
