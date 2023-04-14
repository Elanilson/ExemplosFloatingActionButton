package br.com.cashpago.exemplofloatingactionbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import br.com.cashpago.exemplofloatingactionbutton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            fabBotton.setOnClickListener {
                if(groupMenu.isVisible){
                    groupMenu.visibility = View.INVISIBLE
                }else{
                    groupMenu.visibility = View.VISIBLE
                }
            }
        }

    }
}