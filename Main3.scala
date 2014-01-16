package com.seven4n.darCambio

//**************************************************************************************************
// Ejercicio # 3 Coursera (Monedas)
//**************************************************************************************************

object Main {

  //**************************************************************************************************
	def countChange(money: Int, coins:List[Int]):Int ={
			if (coins.isEmpty) 0
			else if (money == 0) 1
			else if (money < 0) 0
			else countChange(money, coins.tail) + countChange(money - coins.head, coins) 
	}

	//**************************************************************************************************
	def main(args: Array[String]): Unit = {
			println("El saldo de 4$ se puede cancelar de "+ countChange(4, List(2,1)) +" formas")
	}
	//**************************************************************************************************
	
}