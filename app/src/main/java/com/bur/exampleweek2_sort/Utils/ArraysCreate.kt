package com.bur.exampleweek2_sort.Utils

import java.util.*
import kotlin.collections.ArrayList

class ArraysCreate {
    fun staticArrayCreation(arraySize: Int): IntArray {
        val random = Random()
        val randomArray = IntArray(arraySize)
        for (i in randomArray.indices) {
            randomArray[i] = random.nextInt()
        }
        return randomArray
    }

    fun dynamicArrayCreation(arraySize: Int): ArrayList<Int> {
        val random = Random()
        val randomArray: ArrayList<Int> = ArrayList()
        for (i in 0 until arraySize) {
            randomArray.add(i, random.nextInt())
        }
        return randomArray
    }

    fun listArrayCreation(arraySize: Int): LinkedList<Int> {
        val random = Random()
        val randomArray: LinkedList<Int> = LinkedList()
        for (i in 0 until arraySize) {
            randomArray.add(i, random.nextInt())
        }
        return randomArray
    }
}