package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btEntrar: Button = findViewById(R.id.btEntrar)

        btEntrar.setOnClickListener {
            val etUsuario = findViewById<EditText>(R.id.etUsuario)
            val etSenha = findViewById<EditText>(R.id.etSenha)

            if (etUsuario.text.toString() != "" && etSenha.text.toString() !=""){

                val sysUser = "admin"
                val sysSenha = 123456

                if (etSenha.text.toString().toInt() == sysSenha){
                    Toast.makeText(this, "Seja bem-vindo(a) " + etUsuario.text.toString(), Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(this, "Usuário ou senha inválida!", Toast.LENGTH_LONG).show()
                }
            } else {
                Toast.makeText(this, "Digite o usuário e senha", Toast.LENGTH_LONG).show()
            }
        }

        val btCadastrar : Button = findViewById(R.id.btCadastrar)
        btCadastrar.setOnClickListener {
            Toast.makeText(this, "Funcionalidade em desenvolvimento", Toast.LENGTH_LONG).show()
        }
    }

}