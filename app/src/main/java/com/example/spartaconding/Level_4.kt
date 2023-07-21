//package com.example.spartaconding
//
//import android.media.VolumeShaper.Operation
//
//
//fun main(){
//    println("더하기, 빼기, 나누기, 곱하기, 나머지 셈 중 원하는 기호를 선택하세요")
//    println("반드시 +, -, *, /, % 중에 선택")
//    var usersign = readLine()!!.toString()
//    println("첫번째 수를 입력하세요")
//    var usernum1 = readLine()!!.toDouble()
//    println("두번째 수를 입력하세요")
//    var usernum2 = readLine()!!.toDouble()
//
//    var add = AddOperation_L4()
//    var sub = SubstractOperation_L4()
//    var mul = MultiplyOperation_L4()
//    var div = DivideOperation_L4()
//    var cal = Calculator()
//
//    var result = when(usersign){
//        "+" -> cal.lv4(add,usernum1,usernum2)
//        "-" -> cal.lv4(sub,usernum1,usernum2)
//        "*" -> cal.lv4(mul,usernum1,usernum2)
//        "/" -> cal.lv4(div,usernum1,usernum2)
//        else -> println("올바른 값을 입력하세요")
//    }
//    print("결과값은 : $result")
//
//}
//    class Calculator{
//    fun lv4(usersign: AbstractOperation, num1: Double, num2: Double):Double{
//        return usersign.Operation(num1,num2)
//        }
//    }
//
//
//    abstract class AbstractOperation{
//        abstract fun Operation(num1:Double, num2:Double):Double
//    }
//
//    class AddOperation_L4 : AbstractOperation(){
//        override fun Operation(num1: Double, num2: Double):Double {
//            return num1 + num2
//        }
//    }
//    class SubstractOperation_L4 : AbstractOperation(){
//        override fun Operation(num1: Double, num2: Double):Double{
//            return num1 - num2
//        }
//    }
//    class MultiplyOperation_L4 : AbstractOperation(){
//        override fun Operation(num1: Double, num2: Double):Double{
//           return num1 * num2
//        }
//    }
//    class DivideOperation_L4 : AbstractOperation(){
//        override fun Operation(num1: Double, num2: Double):Double{
//            return num1 / num2
//        }
//    }
//
//
