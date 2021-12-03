package com.studyProgramming.squizgame.Model

import java.util.*


class GameButton {
    var clikedInfo : Array<ButtonInfo> =  emptyArray<ButtonInfo>()

    fun resetInfo(){
        clikedInfo = emptyArray<ButtonInfo>()
    }

    fun clickButton(clickData : ButtonInfo){
        clikedInfo.plus(clickData)
    }

    fun isCombo(lastButton:ButtonInfo,indexCombo:Int,gameRule:ComboRule){
        //콥보룸과 현재 저장된 데이터 순서 비교
        var combo = 0
        clikedInfo = arrayOf(lastButton) + clikedInfo

        for(currentButton in clikedInfo){
            if()
        }
    }

    fun calcCombo(gameRule:ComboRule){

    }

}

class ButtonInfo {
    var buttonType : Int = 0
    var clikedTime : Double = 0.0

    constructor(buttonType: Int, clikedTime: Double) {
        this.buttonType = buttonType
        this.clikedTime = clikedTime
    }
}

class ComboRule{
    var buttonRule = emptyList<ButtonInfo>()

    constructor(buttonRule:List<ButtonInfo>){
        this.buttonRule = buttonRule
    }

}