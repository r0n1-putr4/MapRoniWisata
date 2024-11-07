package roni.putra.maproni

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import roni.putra.maproni.adapter.AdapterWisata
import roni.putra.maproni.model.ModelWisata

class ListWisataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_wisata)

        //data list wisata
        val listWisata = listOf<ModelWisata>(
            ModelWisata("Wisata Bukittinggi","Bukittinggi",
                R.drawable.destinasi_wisata1,"Taman Margasatwa dan Budaya Kinantan atau dikenal sebagai Kebun Binatang Bukittinggi Taman Margasatwa dan Budaya Kinantan atau dikenal sebagai Kebun Binatang Bukittinggi  Taman Margasatwa dan Budaya Kinantan atau dikenal  Taman Margasatwa dan Budaya Kinantan atau dikenal sebagai Kebun Binatang Bukittinggi  Taman Margasatwa dan Budaya Kinantan atau dikenal sebagai Kebun Binatang Bukittinggi  Taman Margasatwa dan Budaya Kinantan atau dikenal sebagai Kebun Binatang Bukittinggi sebagai Kebun Binatang Bukittinggi  merupakan taman margastwa tertua peninggalan Belanda di Indonesia Taman Margasatwa dan Budaya Kinantan atau dikenal sebagai Kebun Binatang Bukittinggi merupakan taman margastwa tertua peninggalan Belanda di Indonesia Taman Margasatwa dan Budaya Kinantan atau dikenal sebagai Kebun Binatang Bukittinggi merupakan taman margastwa tertua peninggalan Belanda di Indonesia",
                -0.9273816654084776, 100.35043781036401),

            ModelWisata("Lokasi 2","Alamat 2",
                R.drawable.destinasi_wisata2,"Deskripsi 2",
                -0.6256045581827863, 100.11500367717315
                )
        )

        //Panggil adapter
        val adapterWisata = AdapterWisata(listWisata)
        //Recycler view
        val rvWisata: RecyclerView = findViewById(R.id.rvWisata)
        rvWisata.adapter = adapterWisata
        //set layout untuk recycler view
        rvWisata.apply {
            layoutManager = LinearLayoutManager(this@ListWisataActivity)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}