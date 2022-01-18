package com.example.widgets

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.SeekBar
import com.example.widgets.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // WIDGETS KULLLLANIMI
        binding.apply {
            // Button Kullanımı
            // resources.getIdentifier kullanımı ilede resimleri getirebiliriz. Tavsiye edilen yöntemdir tavsiye edilir.
            buttonResim1.setOnClickListener{
                imageView.setImageResource(R.drawable.resim1)
            }
            buttonResim2.setOnClickListener{
                imageView.setImageResource(resources.getIdentifier("resim2", "drawable", packageName))
            }


            // Switch Kullanımı
            switch1.setOnCheckedChangeListener { s,button ->
                if (button){
                    Log.e("Widgets", "Switch : ON")
                }else{
                    Log.e("Widgets", "Switch : OFF")
                }
            }
            // Switchin durumunu buttonGöster butonu ile loogcatte gösterdik.
            buttonGoster.setOnClickListener {
            }

            // CheckBox Kullanımı
            checkBoxKotlin.setOnCheckedChangeListener { s,button ->
                if (button){
                    Log.e("Widgets", "Kotlin Seçildi.")
                }
            }
            radioButtonRealMadrid.setOnCheckedChangeListener { s,button ->
                if (button){
                    Log.e("Widgets", "Real Madrid Seçildi.")
                }
            }

            buttonBasla.setOnClickListener {
                binding.progressBar.visibility = View.VISIBLE
            }
            buttonDur.setOnClickListener {
                binding.progressBar.visibility = View.INVISIBLE
            }

            seekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
                override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                    textViewSonuc.text = p1.toString()
                }

                override fun onStartTrackingTouch(p0: SeekBar?) {}

                override fun onStopTrackingTouch(p0: SeekBar?) {}

            })
            // TimePickerDialog ile Saatin drumunlarını EditTextle Kullanma
            buttonSaat.setOnClickListener{
                val calendar = Calendar.getInstance()
                val saat = calendar.get(Calendar.HOUR_OF_DAY)
                val dakika = calendar.get(Calendar.MINUTE)
                val ay = calendar.get(Calendar.MONTH)
                val gun = calendar.get(Calendar.DAY_OF_MONTH)


                val tp = TimePickerDialog(this@MainActivity,TimePickerDialog.OnTimeSetListener{ timePicker,saat,dk ->
                    editTextTextSaat.setText("$saat : $dk")
                },saat,dakika,true)

                tp.setButton(DialogInterface.BUTTON_POSITIVE, "Seç", tp)
                tp.setButton(DialogInterface.BUTTON_NEGATIVE, "İptal", tp)
                tp.show()
            }

            buttonTarih.setOnClickListener{
                val calendar = Calendar.getInstance()
                val saat = calendar.get(Calendar.HOUR_OF_DAY)
                val yil = calendar.get(Calendar.YEAR)
                val ay = calendar.get(Calendar.MONTH)
                val gun = calendar.get(Calendar.DAY_OF_MONTH)

                // DatePickerDialog ile Tarihin drumunlarını EditTextle Kullanma
                val dp = DatePickerDialog(this@MainActivity,DatePickerDialog.OnDateSetListener{ d,y,a,g ->
                    editTextTextTarih.setText("$g/${a+1}/$y")
                },yil,ay,gun)

                dp.setButton(DialogInterface.BUTTON_POSITIVE, "Seç", dp)
                dp.setButton(DialogInterface.BUTTON_NEGATIVE, "İptal", dp)
                dp.show()
            }

            // Spinner Kullanımı
            val ulkeler = ArrayList<String>()
            ulkeler.add("Türkiye")
            ulkeler.add("İtalya")
            ulkeler.add("Japonya")

            // Adapter = Veri kümesini alır/düzenler ve arayüzde(UI) da göstermemizi sağlar. Düzenleme Kısmıdır.
            val adapter = ArrayAdapter(this@MainActivity,android.R.layout.simple_list_item_1,android.R.id.text1, ulkeler)

            spinner.adapter = adapter

            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
                override fun onItemSelected(p0: AdapterView<*>?, view: View, position: Int, id: Long) {
                   Snackbar.make(view,"${ulkeler.get(position)} seçildi",Snackbar.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {}

            }

            // widgetsların durumunu buttonGöster butonu ile logcatte gösterdik.
            buttonGoster.setOnClickListener {
                Log.e("Widgets", "Switch en son durum : ${binding.switch1.isChecked}")
                Log.e("Widgets", "CheckBox en son durum : ${binding.checkBoxKotlin.isChecked}")
                Log.e("Widgets", "RadioButton en son durum : ${binding.checkBoxJava.isChecked}")
                Log.e("Widgets", "SeekBar en son durum : ${binding.seekBar.progress}")
                Log.e("Widgets", "Spinner en son durum : ${ulkeler.get(spinner.selectedItemPosition)}")

            }
        }
    }
}