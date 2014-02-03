package com.seven4n.trianguloPascal

//**************************************************************************************************
// Ejercicio # 1 Coursera (Triangulo de Pascal)
//**************************************************************************************************

object Main {

	//**************************************************************************************************
	private def pascal(columna: Int, fila: Int): Int={
			if (columna == 0) 1
			else if (columna>fila) 0
			else pascal(columna-1, fila-1) + pascal(columna, fila-1)
	}	

	//**************************************************************************************************
	def obtenerFila():Int={
			println("Digite la fila")
			readInt
	}

	//**************************************************************************************************
	def obtenerColumna():Int={
			println("Digite la Columna")
			readInt
	}

	//**************************************************************************************************
	def main(args: Array[String]): Unit = {
			println("Digite las coordenadas, para buscar en el triangulo")
			val fila = obtenerFila
			val columna = obtenerColumna
			println("el valor en esa posicion = " + pascal(columna, fila))
	}
	//**************************************************************************************************
	//Prueba Commit 5
	//**************************************************************************************************
}
