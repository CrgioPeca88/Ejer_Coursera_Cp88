package funsets

//************************************************
//Cambio numero 4 (commit 4 prueba)

object Main extends App {
	import FunSets._
	println(contains(singletonSet(1), 1))
	println(contains(singletonSet(8), 88))
	//****************************************
	printSet(union(Set(5,4,8,9,6,23), Set(1,2,5,8,9,6,4,88)))
	//****************************************
	printSet(intersect(Set(5,4,8,9,6,23), Set(1,2,5,8,9,6,4,88)))
	//****************************************
	printSet(diff(Set(5,4,8,9,6,23), Set(1,2,5,8,9,6,4,88)))
	printSet(filter(Set(1,2,5,6,4,9,8,88), (x:Int) => x > 3))
	//****************************************
	println(forall(Set(1,2,5,6,45,8,88,8), (x:Int) => x%2!=0))
	println(forall(Set(1,7,3,9,33,881), (x:Int) => x%2!=0))
	//****************************************
	println(exists(Set(1,2,3,4,5,6,7,54,67,77,88), (x: Int) => x%2!=0))
	println(exists(Set(11,9,3,1,5,15,53,65,77,87), (x: Int) => x%2==0))
	//****************************************
	printSet(map(Set(8,2,5), (x:Int) => x*x))
}
