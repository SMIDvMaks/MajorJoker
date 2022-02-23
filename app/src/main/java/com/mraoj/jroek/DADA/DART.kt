package com.mraoj.jroek.DADA

import com.mraoj.jroek.DICTOR.Dep
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

val upan = "aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9TTUlEdk1ha3MvNTU3OGU1Njg1YmFmYWY4M2ZmZDY3YTE4Y2RlN2IxOGEvcmF3L01ham9yJTI1MjBKb2tlci8="
var lilip:String? = null
var pivpaq:String? = null
var loyba:String? = null
class DART {
  val rene = Retrofit.Builder()
      .baseUrl(Dep.Muoq(upan))
      .addConverterFactory(ScalarsConverterFactory.create())
      .addConverterFactory(GsonConverterFactory.create())
      .build()
    suspend fun GG(){
        val dindon:DAT = rene.create(DAT::class.java)
        val gyu = dindon.DADY().body()
        val RioDE = gyu!!.split("|").toTypedArray()
        lilip = RioDE[0]
        pivpaq = RioDE[1]
        loyba = RioDE[2]
    }
}