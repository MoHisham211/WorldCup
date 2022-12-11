package mo.zain.worldcup.data

import mo.zain.worldcup.data.domain.Match

object DataManger {
    private val listOfMath= mutableListOf<Match>()
    private var mathIndex:Int=0

    fun addMatch(math: Match){
        listOfMath.add(math)
    }
    fun getCurrentMatch():Match{
        return listOfMath.get(mathIndex)
    }
    fun getNextMatch():Match{
        if (mathIndex<= listOfMath.size)
        {
            ++mathIndex
        }else {
            mathIndex=listOfMath.size
        }
        return listOfMath.get(mathIndex)
    }
    fun getpreviousMatch():Match{
        if (mathIndex>0)
        {
            --mathIndex
        }else{
            mathIndex=0
        }
        return listOfMath.get(mathIndex)
    }
}