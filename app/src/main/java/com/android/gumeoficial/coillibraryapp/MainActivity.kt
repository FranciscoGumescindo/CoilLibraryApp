package com.android.gumeoficial.coillibraryapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import coil.api.load
import coil.transform.CircleCropTransformation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object{
        private const val IMAGE_URL = "https://9to5google.com/wp-content/uploads/sites/4/2019/03/android_figure_1.jpg?quality=82&strip=all&w=1600"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1.- Cargar imagen desde una url a traves de Coil
       // imagen.load("https://9to5google.com/wp-content/uploads/sites/4/2019/03/android_figure_1.jpg?quality=82&strip=all&w=1600")

        //2.- Cargar imagen a traves de resource
        //solo carga imagenes de mipmap mas no de drawable
       // imagen.load(R.mipmap.ic_launcher)

        //3.- Cargar imagen circular y placeholder
        imagen.load(IMAGE_URL){
            placeholder(R.mipmap.ic_launcher)
            transformations(CircleCropTransformation())

            //Nota esta libreria funciona solo con el minSdkVersion 24 en adelante
        }
    }
}
