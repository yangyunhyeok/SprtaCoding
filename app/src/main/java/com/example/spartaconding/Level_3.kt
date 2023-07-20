package com.example.spartaconding

fun main(){
    println("더하기, 빼기, 나누기, 곱하기, 나머지 셈 중 원하는 기호를 선택하세요")
    println("반드시 +, -, *, /, % 중에 선택")
    var usersign = readLine()!!.toString()
    println("첫번째 수를 입력하세요")
    var usernum1 = readLine()!!.toDouble()
    println("두번째 수를 입력하세요")
    var usernum2 = readLine()!!.toDouble()


    var add = AddOperation()
    var sub = SubstractOperation()
    var mul = MultiplyOperation()
    var div = DivideOperation()

    var calculator: Any = when(usersign){
        "+" -> add.lv3(usernum1, usernum2)
        "-" -> sub.lv3(usernum1, usernum2)
        "*" -> mul.lv3(usernum1, usernum2)
        "/" -> div.lv3(usernum1, usernum2)
        else -> println("잘못된 값을 입력하셨습니다")
    }

    println(calculator)

}

    class AddOperation{
        fun lv3(num1:Double, num2:Double):Double {
            return num1 + num2
        }
    }
    class SubstractOperation{
        fun lv3(num1:Double, num2:Double): Double {
            return num1 - num2
        }
    }
    class MultiplyOperation{
        fun lv3(num1:Double, num2:Double):Double {
            return num1 * num2
        }
    }
    class DivideOperation{
        fun lv3(num1:Double, num2:Double): Double{
            return num1 / num2
        }
    }

