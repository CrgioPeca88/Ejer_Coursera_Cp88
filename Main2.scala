package com.seven4n.parentesis

import scala.annotation.tailrec
import scala.util.control.BreakControl

//**************************************************************************************************
// Ejercicio # 2 Coursera (Parentesis)
//**************************************************************************************************

object Main {

  //**************************************************************************************************
	def balance(chars: List[Char]):Boolean ={
			@annotation.tailrec		
			def hallar(chars: List[Char], resultado: Boolean, abrio: Boolean, countA: Int) : Boolean = {
					if(chars.isEmpty) resultado
					else if (chars.head.equals('(')) hallar(chars.tail, false, true, countA+1)
					else if (chars.head.equals(')') && abrio == false) false
					else if (chars.head.equals(')') && abrio == true && countA-1 == 0) hallar(chars.tail, true, false, countA-1)
					else if (chars.head.equals(')') && abrio == true && countA-1 != 0) hallar(chars.tail, false, true, countA-1)
					else hallar(chars.tail, resultado, abrio, countA)
			}
			hallar(chars, false, false, 0)
	}

	//**************************************************************************************************
	def main(args: Array[String]): Unit = {
			println(balance(":-)".toList))
	}
	//**************************************************************************************************
}