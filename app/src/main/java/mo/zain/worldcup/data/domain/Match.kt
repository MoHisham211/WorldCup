package mo.zain.worldcup.data.domain

data class Match(
    val Year:String,
    val Stadium:String,
    val City:String,
    val HomeTeamName:String,
    val AwayTeamName:String,
    val HomeTeamGoals:String,
    val AwayTeamGoals:String,
    val Referee:String
)
