package com.example.workmanagerkullanimi

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import android.util.Log
import androidx.core.app.NotificationCompat
import androidx.work.Worker
import androidx.work.WorkerParameters

class MyWorkerNotification(appContext: Context, workerParams: WorkerParameters): Worker(appContext,workerParams) {

    override fun doWork(): Result {
        bildirimOluştur()
        return Result.success()
    }


    fun bildirimOluştur(){
        val builder: NotificationCompat.Builder

        val bildirimYoneticisi = applicationContext.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val intent = Intent(applicationContext,MainActivity::class.java)
        val gidilecekIntent = PendingIntent.getActivity(applicationContext,1,intent,PendingIntent.FLAG_UPDATE_CURRENT)

        // Version Kontrol İşlemi
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){

            // Yeni Versiyon işlemi Bildirim Oluşturma
            // kanalId ye göre bildirimleri sıralayacak
            val kanalId = "kanalId"
            var kanal: NotificationChannel ?= bildirimYoneticisi.getNotificationChannel(kanalId)

            if (kanal == null){
                kanal = NotificationChannel(kanalId, "kanalAd", NotificationManager.IMPORTANCE_HIGH)
                kanal.description = "Kanal Açıklama"
                bildirimYoneticisi.createNotificationChannel(kanal)
            }

            builder = NotificationCompat.Builder(applicationContext,kanalId)
            builder.setContentTitle("Baslik")
                .setContentText("İçerik")
                .setSmallIcon(R.drawable.ic_baseline_notifications_active_24)
                .setContentIntent(gidilecekIntent)
                .setAutoCancel(true)
                .priority = Notification.PRIORITY_HIGH

        }else{ // Eski Versiyon İÇin Bildirim Oluşturma
            builder = NotificationCompat.Builder(applicationContext)
            builder.setContentTitle("Baslik")
                .setContentText("İçerik")
                .setSmallIcon(R.drawable.ic_baseline_notifications_active_24)
                .setContentIntent(gidilecekIntent)
                .setAutoCancel(true)
                .priority = Notification.PRIORITY_HIGH
        }
        bildirimYoneticisi.notify(1,builder.build())
    }
}

