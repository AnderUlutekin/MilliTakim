package com.example.millitakim

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.millitakim.databinding.CardLayoutBinding

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private val images = intArrayOf(R.drawable.ugurcancakir, R.drawable.altaybayindir,
        R.drawable.mertgunok, R.drawable.caglarsoyuncu, R.drawable.merihdemiral, R.drawable.ozankabak,
        R.drawable.kaanayhan, R.drawable.umutmeras, R.drawable.ridvanyilmaz, R.drawable.zekicelik,
        R.drawable.mertmuldur, R.drawable.okayyokuslu, R.drawable.taylanantalyali, R.drawable.orkunkokcu,
        R.drawable.ozantufan, R.drawable.irfankahveci, R.drawable.dorukhantokoz, R.drawable.hakancalhanoglu,
        R.drawable.abdulkadiromur, R.drawable.keremakturkoglu, R.drawable.cengizunder, R.drawable.yusufyazici,
        R.drawable.enesunal, R.drawable.halildervisoglu, R.drawable.burakyilmaz, R.drawable.kenankaraman)

    private var names = arrayOf("Uğurcan Çakır", "Altay Bayındır", "Mert Günok", "Çağlar Söyüncü",
        "Merih Demiral", "Ozan Kabak", "Kaan Ayhan", "Umut Meraş", "Rıdvan Yılmaz", "Zeki Çelik",
        "Mert Müldür", "Okay Yokuşlu", "Taylan Antalyalı", "Orkun Kökçü", "Ozan Tufan",
        "Irfan C. Kahveci", "Dorukhan Toköz", "Hakan Çalhanoğlu", "Abdülkadir Ömür", "Kerem Aktürkoğlu",
        "Cengiz Ünder", "Yusuf Yazıcı", "Enes Ünal", "Halil Dervişoğlu", "Burak Yılmaz", "Kenan Karaman")

    private var teams = arrayOf("Trabzonspor", "Fenerbahçe SK", "Başakşehir", "Leicester City",
        "Juventus", "Liverpool", "Sassuolo", "Le Havre AC", "Beşiktaş JK", "Lille OSC", "Sassuolo",
        "West Bromwich", "Galatasaray A.Ş.", "Feyenoord", "Fenerbahçe SK", "Fenerbahçe SK", "Beşiktaş JK",
        "Milan", "Trabzonspor", "Galatasaray A.Ş.", "Leicester City", "Lille OSC", "Getafe", "Galatasaray A.Ş.",
        "Lille OSC", "Fortuna Düsseldorf")

    private var logos = intArrayOf(R.drawable.trabzonspor, R.drawable.fenerbahce, R.drawable.basaksehir,
        R.drawable.leicester, R.drawable.juventus, R.drawable.liverpool, R.drawable.sassuolo, R.drawable.lehavre,
        R.drawable.besiktas, R.drawable.losc, R.drawable.sassuolo, R.drawable.bromwich, R.drawable.galatasaray,
        R.drawable.feyenoord, R.drawable.fenerbahce, R.drawable.fenerbahce, R.drawable.besiktas, R.drawable.milan,
        R.drawable.trabzonspor, R.drawable.galatasaray, R.drawable.leicester, R.drawable.losc, R.drawable.getafe,
        R.drawable.galatasaray, R.drawable.losc, R.drawable.dusseldorf)

    private var positions = arrayOf("kaleci", "kaleci", "kaleci", "stoper", "stoper", "stoper", "stoper",
        "sol bek", "sol bek", "sağ bek", "sağ bek", "önlibero", "önlibero", "orta saha", "orta saha",
        "orta saha", "orta saha", "orta saha", "orta saha", "sol kanat", "sağ kanat", "forvet arkası",
        "santrafor", "santrafor", "santrafor", "santrafor")

    inner class ViewHolder(private val binding: CardLayoutBinding): RecyclerView.ViewHolder(binding.root){
        var itemImage: ImageView
        var itemName: TextView
        var itemTeam: TextView
        var itemLogo: ImageView
        var itemPosition: TextView

        init {
            itemImage = binding.ivImage
            itemName = binding.tvName
            itemTeam = binding.tvTeam
            itemLogo = binding.ivLogo
            itemPosition = binding.tvPosition
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        return ViewHolder(CardLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, pos: Int) {
        holder.itemName.text = names[pos]
        holder.itemTeam.text = teams[pos]
        holder.itemPosition.text = positions[pos]
        holder.itemImage.setImageResource(images[pos])
        holder.itemLogo.setImageResource(logos[pos])
    }

    override fun getItemCount(): Int {
        return names.size
    }
}