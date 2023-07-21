//package com.example.spartaconding
//
//import android.media.VolumeShaper.Operation
//import java.util.Calendar
//
//
//fun main(){
//    var outnum1:Double = 0.0
//    var outnum2:Double = 0.0
//    var add = AddOperation_L4()
//    var sub = SubstractOperation_L4()
//    var mul = MultiplyOperation_L4()
//    var div = DivideOperation_L4()
//    var cal = Calculator()
//
//
//    println("더하기, 빼기, 나누기, 곱하기, 나머지 셈 중 원하는 기호를 선택하세요")
//    println("반드시 +, -, *, /, % 중에 선택")
//    var usersign = readLine()!!.toString()
//    println("첫번째 수를 입력하세요")
//    while (true) {
//        try {
//            var usernum1 = readLine()!!.toDouble()
//            outnum1 = usernum1
//            break
//        }catch (e:java.lang.NumberFormatException){
//            println("숫자만 입력하세요")
//        }
//    }
//    println("두번째 수를 입력하세요")
//    while (true) {
//        try {
//            var usernum2 = readLine()!!.toDouble()
//            outnum2 = usernum2
//            break
//        }catch (e:java.lang.NumberFormatException){
//            println("숫자만 입력하세요")
//        }
//    }
//    println(outnum1+outnum2)
//
//    var result = when(usersign){
//        "+" -> cal.lv4(add,outnum1,outnum2)
//        "-" -> cal.lv4(sub,outnum1,outnum2)
//        "*" -> cal.lv4(mul,outnum1,outnum2)
//        "/" -> cal.lv4(div,outnum1,outnum2)
//        else -> println("올바른 값을 입력하세요")
//    }
//    println("결과값은"+result+"입니다")
//
//
//
//}
//
//class Calculator{
//    fun lv4(sign:AbstractOperation,num1: Double, num2: Double){
//        return sign.Operation(num1,num2)
//    }
//}
//
//abstract class AbstractOperation{
//    abstract fun Operation(num1:Double, num2:Double)
//}
//
//class AddOperation_L4 : AbstractOperation(){
//    override fun Operation(num1: Double, num2: Double){
//        num1 + num2
//    }
//}
//class SubstractOperation_L4 : AbstractOperation(){
//    override fun Operation(num1: Double, num2: Double){
//        num1 - num2
//    }
//}
//class MultiplyOperation_L4 : AbstractOperation(){
//    override fun Operation(num1: Double, num2: Double){
//        num1 * num2
//    }
//}
//class DivideOperation_L4 : AbstractOperation(){
//    override fun Operation(num1: Double, num2: Double){
//        num1 / num2
//    }
//}
//
