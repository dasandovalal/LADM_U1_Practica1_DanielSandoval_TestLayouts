package mx.tecnm.ladm_u1_practica1_danielsandovalalvarez_layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mx.tecnm.ladm_u1_practica1_danielsandovalalvarez_layouts.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        this.setTitle("NUESTROS MEJORES ALBUMES")

        binding.salirboton.setOnClickListener {
            finish()
        }
    }



}