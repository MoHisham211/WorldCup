package mo.zain.worldcup.ui

import android.util.Log
import android.view.LayoutInflater
import mo.zain.worldcup.data.DataManger
import mo.zain.worldcup.data.domain.Match
import mo.zain.worldcup.databinding.ActivityMainBinding
import mo.zain.worldcup.util.CSVParser
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val LOG_TAG: String ="MAIN_ACTIVITY"
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding =ActivityMainBinding::inflate

    override fun setUp() {
        openFile()
    }

    override fun callBack() {

        binding?.apply {
            next.setOnClickListener {
                bindingMatch(DataManger.getNextMatch())
            }
            previos.setOnClickListener {
                bindingMatch(DataManger.getpreviousMatch())
            }
        }

    }

    private fun openFile() {
        val inputStream=assets.open("worldcup.csv")
        val bufferedReader=BufferedReader(InputStreamReader(inputStream))
        val parser=CSVParser()
        bufferedReader.forEachLine {
            val currentMatch=parser.parse(it)
            DataManger.addMatch(currentMatch)
        }
        bindingMatch(DataManger.getCurrentMatch())
    }
    private fun bindingMatch(match: Match)
    {
        binding?.apply {
            yearTxt.text= match.Year
            homeTeamName.text=match.HomeTeamName
            awayTeamName.text =match.AwayTeamName

            homeGole.text=match.HomeTeamGoals
            awayGole.text=match.AwayTeamGoals

        }
    }

}