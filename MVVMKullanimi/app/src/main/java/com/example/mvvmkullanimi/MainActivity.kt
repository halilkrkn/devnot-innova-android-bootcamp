package com.example.mvvmkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LifecycleOwner
import com.example.mvvmkullanimi.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Databinding için ActivityMainBinding bind ettik.
    private lateinit var binding: ActivityMainBinding
    private val viewModel:MainActivityViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Databinding i activityle yani layouta bağlıyoruz.
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        // DataBİnding Kullanılarak yapılan yöntem
        binding.mainActivityNesnesi = this



        // Viewmodelde yazdığımız livedata tanımlanması ve kullanımı ile arayüzde tetiklediğimiz işlemleri dinleyeceğiz.
        // Ve MainActivityViewModel de init içerisinde yazdığımız işleme aktaracağız.
        // Sonrasında ise arayüxdce sonuc kısmıda gözükmektedir.
        // Dinleme işlemi Observer methodur.
        viewModel.sonuc.observe(this,{
            // arayüz içerisinde tetikleyerek sonuc kısmını dinliyoruz ve sonucları getiriyoruz.
            binding.hesaplamaSonucu = it
        })

/*      Normal(Klasik) Kullanım ile Yapılan Yöntemler.
        binding.apply{
            textViewSonuc.text = "0"

            buttonToplama.setOnClickListener {
                val alinanSayi1 = editTextTextSayi1.text.toString()
                val alinanSayi2 = editTextTextSayi2.text.toString()

                val sayi1 = alinanSayi1.toInt()
                val sayi2 = alinanSayi2.toInt()

                val toplam = sayi1 + sayi2
                textViewSonuc.text = "$toplam"
            }

            buttonCarpma.setOnClickListener {
                val alinanSayi1 = editTextTextSayi1.text.toString()
                val alinanSayi2 = editTextTextSayi2.text.toString()

                val sayi1 = alinanSayi1.toInt()
                val sayi2 = alinanSayi2.toInt()

                val carpma = sayi1 * sayi2
                textViewSonuc.text = "$carpma"

            }
        }*/
    }

    // DataBinding Kullanılarak yapılan yöntem
    fun buttonToplamaTikla(alinanSayi1:String, alinanSayi2:String){
        viewModel.toplamaYap(alinanSayi1, alinanSayi2)
    }

    // DataBİnding Kullanılarak yapılan yöntem
    fun buttonCarpmaTikla(alinanSayi1:String, alinanSayi2:String){
        viewModel.carpmaYap(alinanSayi1, alinanSayi2)
    }
}