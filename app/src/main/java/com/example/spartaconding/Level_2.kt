//package com.example.spartaconding
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
//    var input = Lv2()
//    var calculator = input.lv2(usersign, usernum1, usernum2)
//    println(calculator)
//
//}
//    class Lv2 {
//    fun lv2(sign: String, num1: Double, num2: Double): Any {
//        return when (sign) {
//            "+" -> num1 + num2
//            "-" -> num1 - num2
//            "*" -> num1 * num2
//            "/" -> num1 / num2
//            "%" -> num1 % num2
//            else -> println("잘못된 연산자 입니다.")
//        }
//    }
//}