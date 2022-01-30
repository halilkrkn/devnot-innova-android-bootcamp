package com.example.kisileruygulamasi.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.kisileruygulamasi.entity.Kisiler



@Database(
    entities = [Kisiler::class],
    version = 1
)
abstract class KisilerDatabase: RoomDatabase() {
    abstract fun KisilerDao(): KisilerDao

    companion object{
        var INSTANCE : KisilerDatabase?= null


        fun veriTabaniErisim(context: Context): KisilerDatabase?{
            if (INSTANCE == null) {
                synchronized(KisilerDatabase::class){
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        KisilerDatabase::class.java,
                        "rehber.sqlite"
                        )
                        .createFromAsset("rehber.sqlite")
                        .build()
                }
            }
            return INSTANCE
        }

    }
}