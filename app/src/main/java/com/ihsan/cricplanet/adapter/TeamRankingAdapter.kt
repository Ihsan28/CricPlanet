package com.ihsan.cricplanet.adapter

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Typeface
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.ihsan.cricplanet.R
import com.ihsan.cricplanet.model.team.GlobalTeamRanking
import com.ihsan.cricplanet.model.team.TeamIncludeRanking
import com.ihsan.cricplanet.utils.Utils

class TeamRankingAdapter(private val teamList: List<TeamIncludeRanking>) : RecyclerView.Adapter<TeamRankingAdapter.TeamViewHolder>() {

    class TeamViewHolder(private val binding: View) : RecyclerView.ViewHolder(binding){
        val teamName: TextView =binding.findViewById(R.id.team)
        val image: ImageView =itemView.findViewById(R.id.image)
        val source: TextView =itemView.findViewById(R.id.source)
        val teamRanking: TextView =itemView.findViewById(R.id.team_ranking)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        val root= LayoutInflater.from(parent.context).inflate(R.layout.team_item,parent,false)
        Log.d("teamAdapter", "onCreateViewHolder: ${teamList.size}")
        return TeamViewHolder(root)
    }

    override fun getItemCount(): Int {
        return teamList.size
    }

    @SuppressLint("SetTextI18n", "NotifyDataSetChanged")
    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        val team=teamList[position]
        Log.d("teamAdapter", "BindViewHolder: ${teamList.size}")
        holder.teamName.text=team.name
        holder.teamRanking.text=team.ranking?.position.toString()
        holder.source.text=team.ranking?.rating.toString()
        Utils().also {
            it.loadImageWithPicasso(team.image_path,holder.image)
        }

        holder.itemView.setOnClickListener{
            showStyledSnackbar(it, team?.name)
            notifyDataSetChanged()
        }
    }

    private fun showStyledSnackbar(view: View, text: String?) {
        var showText=""
        if (text!=null){
            showText=text
        }
        val snackbar = Snackbar.make(view, showText, Snackbar.LENGTH_LONG)
        val snackbarView = snackbar.view
        snackbarView.setBackgroundColor(Color.parseColor("#3F51B5"))
        val textView = snackbarView.findViewById<TextView>(com.google.android.material.R.id.snackbar_text)
        textView.setTextColor(Color.WHITE)
        textView.textSize = 20f
        textView.setTypeface(null, Typeface.BOLD)
        snackbar.show()
    }
}