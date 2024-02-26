package com.enrique.myproductos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var lista : MutableList<Productos> = mutableListOf()
    private lateinit var recycler: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lista.add(
            Productos("0001","palos de golf","$100","$50")
        )
        lista.add(
            Productos("0002","playera sin manga","$200","$100")
        )
        lista.add(
            Productos("0003","pantalon mezclilla","$106","$190")
        )
        lista.add(
            Productos("0004", "tenis", "$250", "$199")
        )

        lista.add(
            Productos("0005", "zapatos de vestir", "$200", "$100")
        )

        lista.add(
            Productos("0006", "abrigo de mezclilla", "$300", "$45")
        )

        lista.add(
            Productos("0007", "abrigo de licra", "$255", "$130")
        )

        lista.add(
            Productos("0008", "camisa deportiva", "$150", "$60")
        )

        lista.add(
            Productos("0009", "shorts", "$80", "$100")
        )

        lista.add(
            Productos("0010", " pans deportivos", "$150", "$180")
        )

        lista.add(
            Productos("0011", "zapatillas para ciclismo", "$250", "$110")
        )

        lista.add(
            Productos("0012", "patinetas", "$102", "$205")
        )

        lista.add(
            Productos("0013", "tachos para futbol", "$100", "229")
        )

        lista.add(
            Productos("0014", "tenis de futbol rapido", "$300", "$208")
        )

        lista.add(
            Productos("0015", "bicicletas", "$400", "$500")
        )

        lista.add(
            Productos("0016", "patines para hielo", "$150", "$200")
        )

        lista.add(
            Productos("0017", "balon de basquetbol", "$190", "$200")
        )

        lista.add(
            Productos("0018", "balon de voleibol", "$80", "$100")
        )

        lista.add(
            Productos("0019", "balon de futbol", "$200", "$105")
        )

        lista.add(
            Productos("0020", "pelotas de tenis ", "$190", "$90")
        )

        lista.add(
            Productos("0021", "pelotas de beisbol", "$200", "$50")
        )

        lista.add(
            Productos("0022", "pelotas de golf", "$200", "$90")
        )

        lista.add(
            Productos("0023", "bates de beisbol", "$160", "$75")
        )
        var tabla = findViewById<RecyclerView>(R.id.tablapro)
        recycler=tabla
        recycler.layoutManager= LinearLayoutManager(this)
        recycler.adapter=Pro(this,lista)



    }
}