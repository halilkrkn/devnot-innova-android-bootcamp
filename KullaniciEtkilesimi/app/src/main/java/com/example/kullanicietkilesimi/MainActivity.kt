package com.example.kullanicietkilesimi

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.kullanicietkilesimi.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            buttonToast.setOnClickListener{
                Toast.makeText(applicationContext,"Merhaba",Toast.LENGTH_SHORT).show()
            }

            buttonSnackBar.setOnClickListener{
               val sb = Snackbar.make(it,"İnternet Bağlantısı Yok!",Snackbar.LENGTH_LONG)
                sb.setAction("TEKRAR DENE"){
//                        Snackbar.make(it,"Silindi",Snackbar.LENGTH_LONG).show()
                    }
                sb.setActionTextColor(Color.RED) // Action veya  Button Rengi
                sb.setTextColor(Color.BLUE) // Mesaj Rengi
                sb.setBackgroundTint(Color.WHITE) // Arkaplan Rengi
                sb.show()
            }

            buttonAlert.setOnClickListener{
                val alertDialog = AlertDialog.Builder(this@MainActivity)
                alertDialog.setTitle("Başlik")
                alertDialog.setMessage("İçerik")

                alertDialog.setPositiveButton("Tamam"){ text,listener ->
                    Log.e("Alert", "Tamam Seçildi.")
                }

                alertDialog.setNegativeButton("İptal Et"){ text,listener ->
                    Log.e("Alert", "İptal Seçildi.")
                }

                alertDialog.create().show()
            }

        }

    }
}