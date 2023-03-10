package com.ihsan.cricplanet.model.fixture.result.manofseries

import android.os.Parcelable
import com.ihsan.cricplanet.model.fixture.TeamDlData
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ManOfSeries(
    val draw_noresult: String?,
    val elected: String?,
    val first_umpire_id: Int?,
    val follow_on: Boolean?,
    val id: Int,
    val last_period: String?,
    val league_id: Int?,
    val live: Boolean?,
    val localteam_dl_data: TeamDlData?,
    val localteam_id: Int?,
    val man_of_match_id: Int?,
    val man_of_series_id: Int?,
    val manofseries: String?,
    val note: String?,
    val referee_id: Int?,
    val resource: String?,
    val round: String?,
    val rpc_overs: String?,
    val rpc_target: String?,
    val season_id: Int?,
    val second_umpire_id: Int?,
    val stage_id: Int?,
    val starting_at: String?,
    val status: String?,
    val super_over: Boolean?,
    val toss_won_team_id: Int?,
    val total_overs_played: Int?,
    val tv_umpire_id: Int?,
    val type: String?,
    val venue_id: Int?,
    val visitorteam_dl_data: TeamDlData?,
    val visitorteam_id: Int?,
    val weather_report: List<String>?,
    val winner_team_id: Int?
):Parcelable
{
    constructor():this(
        null,
        null,
        null,
        null,
        0,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null,
        null
    )
}