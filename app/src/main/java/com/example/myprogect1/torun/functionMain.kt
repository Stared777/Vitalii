package com.example.myprogect1.torun
import com.example.myprogect1.model.Herbivories
import com.example.myprogect1.model.Predators

fun main() {
    val panda = Herbivories(nickName = "Sony", habitat = "jungle")
    val squirrel = Herbivories(nickName = "Palpy", habitat = "forest")

    val dinos = Predators(theName = "Rex", eat = "meat")
    val bear = Predators(theName = "Ballu", eat = "fish")

    val animalList1: MutableList<Herbivories> = mutableListOf(panda, squirrel)
    val animalList2: MutableList<Predators> = mutableListOf(dinos, bear)
      println(animalList1[0].nickName)
      println(animalList1[1].nickName)
      println(animalList2[0].theName)
      println(animalList2[1].theName)

}




