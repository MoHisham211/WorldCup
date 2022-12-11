package mo.zain.worldcup.util

import mo.zain.worldcup.data.domain.Match

class CSVParser {
    fun parse(line:String):Match{

        val token=line.split(",")

        return Match(
            token[Constants.ColumnIndex.YEAR],
            token[Constants.ColumnIndex.STADIUM],
            token[Constants.ColumnIndex.CITY],
            token[Constants.ColumnIndex.HOME_TEAM_NAME],
            token[Constants.ColumnIndex.AWAY_TEAM_NAME],
            token[Constants.ColumnIndex.HOME_TEAM_GOALS],
            token[Constants.ColumnIndex.AWAY_TEAM_GOALS],
            token[Constants.ColumnIndex.REFEREE_NAME])
    }
}