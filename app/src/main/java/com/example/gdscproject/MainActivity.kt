package com.example.gdscproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newAarrayList: ArrayList<data>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>
    lateinit var info : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
            R.drawable.j,
            R.drawable.k,
            R.drawable.l
        )

        heading = arrayOf(
            "Bulbasaur #001",
            "Ivysaur #002",
            "Venusaur #003",
            "Charmander #004",
            "Charmeleon #005",
            "Charizard #006",
            "Squirtle #007",
            "Wartortle #008",
            "Blastoise #009",
            "Caterpie #010",
            "Metapod #011",
            "Butterfree #012"
        )

        info = arrayOf(
            "There is a plant seed on its back right from the day this Pokémon is born. The seed slowly grows larger.",
            "When the bulb on its back grows large, it appears to lose the ability to stand on its hind legs.",
            "Its plant blooms when it is absorbing solar energy. It stays on the move to seek sunlight.",
            "It has a preference for hot things. When it rains, steam is said to spout from the tip of its tail.",
            "It has a barbaric nature. In battle, it whips its fiery tail around and slashes away with sharp claws.",
            "It spits fire that is hot enough to melt boulders. It may cause forest fires by blowing flames.",
            "When it retracts its long neck into its shell, it squirts out water with vigorous force.",
            "It is recognized as a symbol of longevity. If its shell has algae on it, that Wartortle is very old.",
            "It crushes its foe under its heavy body to cause fainting. In a pinch, it will withdraw inside its shell.",
            "For protection, it releases a horrible stench from the antenna on its head to drive away enemies.",
            "It is waiting for the moment to evolve. At this stage, it can only harden, so it remains motionless to avoid attack.",
            "In battle, it flaps its wings at great speed to release highly toxic dust into the air."

        )
        newRecyclerView =  findViewById(R.id.recycle)
        newRecyclerView.layoutManager = LinearLayoutManager( this)
        newRecyclerView.setHasFixedSize(true)

        newAarrayList = arrayListOf<data>()
        getUserdata()
    }

    private fun getUserdata() {
        for(i in imageId.indices){
            val Data = data(imageId[i], heading[i], info[i])
            newAarrayList.add(Data)
        }

        newRecyclerView.adapter = MyAdaptor(newAarrayList)
    }
}