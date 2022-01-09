package com.example.introkotlin.nesnetabanliprogramlama.interfacee

class ClassA: Interface1 {
    override val degisken: Int
        get() = 20

    override fun method1() {
        println("Method1 Başlatıldı.")
    }

    override fun method2(): String {
        val method2 : String = "Method2 Başlatıldı"
        return method2
    }
}