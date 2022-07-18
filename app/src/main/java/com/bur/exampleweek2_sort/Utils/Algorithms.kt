package com.bur.exampleweek2_sort.Utils

import java.util.*


class Algorithms {

    //Сортировка пузырьком
    public fun bubbleSort(inputArray: IntArray): Double {
        val startAlg = System.currentTimeMillis().toDouble()
        var isSorted = false
        var temp: Int
        while (!isSorted) {
            isSorted = true
            for (i in 0 until inputArray.size - 1) {
                if (inputArray[i] > inputArray[i + 1]) {
                    isSorted = false
                    temp = inputArray[i]
                    inputArray[i] = inputArray[i + 1]
                    inputArray[i + 1] = temp
                }
            }
        }
        val finishAlg = System.currentTimeMillis().toDouble()
        return finishAlg - startAlg
    }

    public fun bubbleSort(inputArray: ArrayList<Int>): Double {
        val startAlg = System.currentTimeMillis().toDouble()
        var isSorted = false
        var temp: Int
        while (!isSorted) {
            isSorted = true
            for (i in 0 until inputArray.size - 1) {
                if (inputArray[i] > inputArray[i + 1]) {
                    isSorted = false
                    temp = inputArray[i]
                    inputArray[i] = inputArray[i + 1]
                    inputArray[i + 1] = temp
                }
            }
        }
        val finishAlg = System.currentTimeMillis().toDouble()
        return finishAlg - startAlg
    }

    public fun bubbleSort(inputArray: LinkedList<Int>): Double {
        val startAlg = System.currentTimeMillis().toDouble()
        var isSorted = false
        var temp: Int
        while (!isSorted) {
            isSorted = true
            for (i in 0 until inputArray.size - 1) {
                if (inputArray[i] > inputArray[i + 1]) {
                    isSorted = false
                    temp = inputArray[i]
                    inputArray[i] = inputArray[i + 1]
                    inputArray[i + 1] = temp
                }
            }
        }
        val finishAlg = System.currentTimeMillis().toDouble()
        return finishAlg - startAlg
    }
//--------------------------------------------------------------------------------------------------

    //Сортировка вставками
    public fun insertionSort(inputArray: IntArray): Double {
        val startAlg = System.currentTimeMillis().toDouble()
        for (i in 1 until inputArray.size) {
            val current = inputArray[i]
            var j = i - 1
            while (j >= 0 && current < inputArray[j]) {
                inputArray[j + 1] = inputArray[j]
                j--
            }
            inputArray[j + 1] = current
        }
        val finishAlg = System.currentTimeMillis().toDouble()
        return finishAlg - startAlg
    }

    public fun insertionSort(inputArray: ArrayList<Int>): Double {
        val startAlg = System.currentTimeMillis().toDouble()
        for (i in 1 until inputArray.size) {
            val current = inputArray[i]
            var j = i - 1
            while (j >= 0 && current < inputArray[j]) {
                inputArray[j + 1] = inputArray[j]
                j--
            }
            inputArray[j + 1] = current
        }
        val finishAlg = System.currentTimeMillis().toDouble()
        return finishAlg - startAlg
    }

    public fun insertionSort(inputArray: LinkedList<Int>): Double {
        val startAlg = System.currentTimeMillis().toDouble()
        for (i in 1 until inputArray.size) {
            val current = inputArray[i]
            var j = i - 1
            while (j >= 0 && current < inputArray[j]) {
                inputArray[j + 1] = inputArray[j]
                j--
            }
            inputArray[j + 1] = current
        }
        val finishAlg = System.currentTimeMillis().toDouble()
        return finishAlg - startAlg
    }
//--------------------------------------------------------------------------------------------------

    //Сортировка выбором
    public fun selectionSort(inputArray: IntArray): Double {
        val startAlg = System.currentTimeMillis().toDouble()
        for (i in inputArray.indices) {
            var min = inputArray[i]
            var minId = i
            for (j in i + 1 until inputArray.size) {
                if (inputArray[j] < min) {
                    min = inputArray[j]
                    minId = j
                }
            }
            // замена
            val temp = inputArray[i]
            inputArray[i] = min
            inputArray[minId] = temp
        }
        val finishAlg = System.currentTimeMillis().toDouble()
        return finishAlg - startAlg
    }

    public fun selectionSort(inputArray: ArrayList<Int>): Double {
        val startAlg = System.currentTimeMillis().toDouble()
        for (i in inputArray.indices) {
            var min = inputArray[i]
            var minId = i
            for (j in i + 1 until inputArray.size) {
                if (inputArray[j] < min) {
                    min = inputArray[j]
                    minId = j
                }
            }
            val temp = inputArray[i]
            inputArray[i] = min
            inputArray[minId] = temp
        }
        val finishAlg = System.currentTimeMillis().toDouble()
        return finishAlg - startAlg
    }

    public fun selectionSort(inputArray: LinkedList<Int>): Double {
        val startAlg = System.currentTimeMillis().toDouble()
        for (i in inputArray.indices) {
            var min = inputArray[i]
            var minId = i
            for (j in i + 1 until inputArray.size) {
                if (inputArray[j] < min) {
                    min = inputArray[j]
                    minId = j
                }
            }
            val temp = inputArray[i]
            inputArray[i] = min
            inputArray[minId] = temp
        }
        val finishAlg = System.currentTimeMillis().toDouble()
        return finishAlg - startAlg
    }
//--------------------------------------------------------------------------------------------------

    //Сортировка слиянием
    public fun mergeSort(inputArray: IntArray, left: Int, right: Int): Double {
        val startAlg = System.currentTimeMillis().toDouble()
        if (right <= left) {
            val finishAlg = System.currentTimeMillis().toDouble()
            return finishAlg - startAlg
        }
        val mid = (left + right) / 2
        mergeSort(inputArray, left, mid)
        mergeSort(inputArray, mid + 1, right)
        merge(inputArray, left, mid, right)
        val finishAlg = System.currentTimeMillis().toDouble()
        return finishAlg - startAlg
    }

    fun merge(inputArray: IntArray, left: Int, mid: Int, right: Int) {
        // вычисляем длину
        val lengthLeft = mid - left + 1
        val lengthRight = right - mid

        // создаем временные подмассивы
        val leftArray = IntArray(lengthLeft)
        val rightArray = IntArray(lengthRight)

        // копируем отсортированные массивы во временные
        for (i in 0 until lengthLeft) leftArray[i] = inputArray[left + i]
        for (i in 0 until lengthRight) rightArray[i] = inputArray[mid + i + 1]

        // итераторы содержат текущий индекс временного подмассива
        var leftIndex = 0
        var rightIndex = 0

        // копируем из leftArray и rightArray обратно в массив
        for (i in left until right + 1) {
            // если остаются нескопированные элементы в R и L, копируем минимальный
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    inputArray[i] = leftArray[leftIndex]
                    leftIndex++
                } else {
                    inputArray[i] = rightArray[rightIndex]
                    rightIndex++
                }
            } else if (leftIndex < lengthLeft) {
                inputArray[i] = leftArray[leftIndex]
                leftIndex++
            } else if (rightIndex < lengthRight) {
                inputArray[i] = rightArray[rightIndex]
                rightIndex++
            }
        }
    }

    public fun mergeSort(inputArray: ArrayList<Int>, left: Int, right: Int): Double {
        val startAlg = System.currentTimeMillis().toDouble()
        if (right <= left) {
            val finishAlg = System.currentTimeMillis().toDouble()
            return finishAlg - startAlg
        }
        val mid = (left + right) / 2
        mergeSort(inputArray, left, mid)
        mergeSort(inputArray, mid + 1, right)
        merge(inputArray, left, mid, right)
        val finishAlg = System.currentTimeMillis().toDouble()
        return finishAlg - startAlg
    }

    fun merge(inputArray: ArrayList<Int>, left: Int, mid: Int, right: Int) {
        // вычисляем длину
        val lengthLeft = mid - left + 1
        val lengthRight = right - mid

        // создаем временные подмассивы
        val leftArray = IntArray(lengthLeft)
        val rightArray = IntArray(lengthRight)

        // копируем отсортированные массивы во временные
        for (i in 0 until lengthLeft) leftArray[i] = inputArray[left + i]
        for (i in 0 until lengthRight) rightArray[i] = inputArray[mid + i + 1]

        // итераторы содержат текущий индекс временного подмассива
        var leftIndex = 0
        var rightIndex = 0

        // копируем из leftArray и rightArray обратно в массив
        for (i in left until right + 1) {
            // если остаются нескопированные элементы в R и L, копируем минимальный
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    inputArray[i] = leftArray[leftIndex]
                    leftIndex++
                } else {
                    inputArray[i] = rightArray[rightIndex]
                    rightIndex++
                }
            } else if (leftIndex < lengthLeft) {
                inputArray[i] = leftArray[leftIndex]
                leftIndex++
            } else if (rightIndex < lengthRight) {
                inputArray[i] = rightArray[rightIndex]
                rightIndex++
            }
        }
    }

    public fun mergeSort(inputArray: LinkedList<Int>, left: Int, right: Int): Double {
        val startAlg = System.currentTimeMillis().toDouble()
        if (right <= left) {
            val finishAlg = System.currentTimeMillis().toDouble()
            return finishAlg - startAlg
        }
        val mid = (left + right) / 2
        mergeSort(inputArray, left, mid)
        mergeSort(inputArray, mid + 1, right)
        merge(inputArray, left, mid, right)
        val finishAlg = System.currentTimeMillis().toDouble()
        return finishAlg - startAlg
    }

    fun merge(inputArray: LinkedList<Int>, left: Int, mid: Int, right: Int) {
        // вычисляем длину
        val lengthLeft = mid - left + 1
        val lengthRight = right - mid

        // создаем временные подмассивы
        val leftArray = IntArray(lengthLeft)
        val rightArray = IntArray(lengthRight)

        // копируем отсортированные массивы во временные
        for (i in 0 until lengthLeft) leftArray[i] = inputArray[left + i]
        for (i in 0 until lengthRight) rightArray[i] = inputArray[mid + i + 1]

        // итераторы содержат текущий индекс временного подмассива
        var leftIndex = 0
        var rightIndex = 0

        // копируем из leftArray и rightArray обратно в массив
        for (i in left until right + 1) {
            // если остаются нескопированные элементы в R и L, копируем минимальный
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    inputArray[i] = leftArray[leftIndex]
                    leftIndex++
                } else {
                    inputArray[i] = rightArray[rightIndex]
                    rightIndex++
                }
            } else if (leftIndex < lengthLeft) {
                inputArray[i] = leftArray[leftIndex]
                leftIndex++
            } else if (rightIndex < lengthRight) {
                inputArray[i] = rightArray[rightIndex]
                rightIndex++
            }
        }
    }
//--------------------------------------------------------------------------------------------------

    //Пирамидальная сортировка
    fun heapify(inputArray: IntArray, length: Int, i: Int) {
        val leftChild = 2 * i + 1
        val rightChild = 2 * i + 2
        var largest = i

        // если левый дочерний больше родительского
        if (leftChild < length && inputArray[leftChild] > inputArray[largest]) {
            largest = leftChild
        }

        // если правый дочерний больше родительского
        if (rightChild < length && inputArray[rightChild] > inputArray[largest]) {
            largest = rightChild
        }

        // если должна произойти замена
        if (largest != i) {
            val temp = inputArray[i]
            inputArray[i] = inputArray[largest]
            inputArray[largest] = temp
            heapify(inputArray, length, largest)
        }
    }

    public fun heapSort(inputArray: IntArray): Double {
        val startAlg = System.currentTimeMillis().toDouble()
        if (inputArray.size == 0) {
            val finishAlg = System.currentTimeMillis().toDouble()
            return finishAlg - startAlg
        }

        // Строим кучу
        val length = inputArray.size
        // проходим от первого без ответвлений к корню
        for (i in length / 2 - 1 downTo 0) heapify(inputArray, length, i)
        for (i in length - 1 downTo 0) {
            val temp = inputArray[0]
            inputArray[0] = inputArray[i]
            inputArray[i] = temp
            heapify(inputArray, i, 0)
        }
        val finishAlg = System.currentTimeMillis().toDouble()
        return finishAlg - startAlg
    }

    fun heapify(inputArray: ArrayList<Int>, length: Int, i: Int) {
        val leftChild = 2 * i + 1
        val rightChild = 2 * i + 2
        var largest = i

        // если левый дочерний больше родительского
        if (leftChild < length && inputArray[leftChild] > inputArray[largest]) {
            largest = leftChild
        }

        // если правый дочерний больше родительского
        if (rightChild < length && inputArray[rightChild] > inputArray[largest]) {
            largest = rightChild
        }

        // если должна произойти замена
        if (largest != i) {
            val temp = inputArray[i]
            inputArray[i] = inputArray[largest]
            inputArray[largest] = temp
            heapify(inputArray, length, largest)
        }
    }

    public fun heapSort(inputArray: ArrayList<Int>): Double {
        val startAlg = System.currentTimeMillis().toDouble()
        if (inputArray.size == 0) {
            val finishAlg = System.currentTimeMillis().toDouble()
            return finishAlg - startAlg
        }

        // Строим кучу
        val length = inputArray.size
        // проходим от первого без ответвлений к корню
        for (i in length / 2 - 1 downTo 0) heapify(inputArray, length, i)
        for (i in length - 1 downTo 0) {
            val temp = inputArray[0]
            inputArray[0] = inputArray[i]
            inputArray[i] = temp
            heapify(inputArray, i, 0)
        }
        val finishAlg = System.currentTimeMillis().toDouble()
        return finishAlg - startAlg
    }

    fun heapify(inputArray: LinkedList<Int>, length: Int, i: Int) {
        val leftChild = 2 * i + 1
        val rightChild = 2 * i + 2
        var largest = i

        // если левый дочерний больше родительского
        if (leftChild < length && inputArray[leftChild] > inputArray[largest]) {
            largest = leftChild
        }

        // если правый дочерний больше родительского
        if (rightChild < length && inputArray[rightChild] > inputArray[largest]) {
            largest = rightChild
        }

        // если должна произойти замена
        if (largest != i) {
            val temp = inputArray[i]
            inputArray[i] = inputArray[largest]
            inputArray[largest] = temp
            heapify(inputArray, length, largest)
        }
    }

    public fun heapSort(inputArray: LinkedList<Int>): Double {
        val startAlg = System.currentTimeMillis().toDouble()
        if (inputArray.size == 0) {
            val finishAlg = System.currentTimeMillis().toDouble()
            return finishAlg - startAlg
        }

        // Строим кучу
        val length = inputArray.size
        // проходим от первого без ответвлений к корню
        for (i in length / 2 - 1 downTo 0) heapify(inputArray, length, i)
        for (i in length - 1 downTo 0) {
            val temp = inputArray[0]
            inputArray[0] = inputArray[i]
            inputArray[i] = temp
            heapify(inputArray, i, 0)
        }
        val finishAlg = System.currentTimeMillis().toDouble()
        return finishAlg - startAlg
    }
//--------------------------------------------------------------------------------------------------

    //Шейкерная сортировка
    public fun shakerSort(inputArray: IntArray): Double {
        val startAlg = System.currentTimeMillis().toDouble()
        var temp: Int
        var leftSide = 0
        var rightSide = inputArray.size - 1
        do {
            for (i in leftSide until rightSide) {
                if (inputArray[i] > inputArray[i + 1]) {
                    temp = inputArray[i]
                    inputArray[i] = inputArray[i + 1]
                    inputArray[i + 1] = temp
                }
            }
            rightSide--
            for (i in rightSide downTo leftSide + 1) {
                if (inputArray[i] < inputArray[i - 1]) {
                    temp = inputArray[i]
                    inputArray[i] = inputArray[i - 1]
                    inputArray[i - 1] = temp
                }
            }
            leftSide++
        } while (leftSide < rightSide)
        val finishAlg = System.currentTimeMillis().toDouble()
        return finishAlg - startAlg
    }

    public fun shakerSort(inputArray: ArrayList<Int>): Double {
        val startAlg = System.currentTimeMillis().toDouble()
        var temp: Int
        var leftSide = 0
        var rightSide: Int = inputArray.size - 1
        do {
            for (i in leftSide until rightSide) {
                if (inputArray[i] > inputArray[i + 1]) {
                    temp = inputArray[i]
                    inputArray[i] = inputArray[i + 1]
                    inputArray[i + 1] = temp
                }
            }
            rightSide--
            for (i in rightSide downTo leftSide + 1) {
                if (inputArray[i] < inputArray[i - 1]) {
                    temp = inputArray[i]
                    inputArray[i] = inputArray[i - 1]
                    inputArray[i - 1] = temp
                }
            }
            leftSide++
        } while (leftSide < rightSide)
        val finishAlg = System.currentTimeMillis().toDouble()
        return finishAlg - startAlg
    }

    public fun shakerSort(inputArray: LinkedList<Int>): Double {
        val startAlg = System.currentTimeMillis().toDouble()
        var temp: Int
        var leftSide = 0
        var rightSide: Int = inputArray.size - 1
        do {
            for (i in leftSide until rightSide) {
                if (inputArray[i] > inputArray[i + 1]) {
                    temp = inputArray[i]
                    inputArray[i] = inputArray[i + 1]
                    inputArray[i + 1] = temp
                }
            }
            rightSide--
            for (i in rightSide downTo leftSide + 1) {
                if (inputArray[i] < inputArray[i - 1]) {
                    temp = inputArray[i]
                    inputArray[i] = inputArray[i - 1]
                    inputArray[i - 1] = temp
                }
            }
            leftSide++
        } while (leftSide < rightSide)
        val finishAlg = System.currentTimeMillis().toDouble()
        return finishAlg - startAlg
    }
//--------------------------------------------------------------------------------------------------

    //Сортировка расчёской
    fun getNextGap(gap: Int): Int {
        var gap = gap
        gap = gap * 10 / 13
        return if (gap < 1) 1 else gap
    }

    public fun combSort(inputArray: IntArray): Double {
        val startAlg = System.currentTimeMillis().toDouble()
        var temp: Int
        val arrLength = inputArray.size
        var gap = arrLength
        var swapped = true
        while (gap != 1 || swapped) {
            gap = getNextGap(gap)
            swapped = false
            for (i in 0 until arrLength - gap) {
                if (inputArray[i] > inputArray[i + gap]) {
                    temp = inputArray[i]
                    inputArray[i] = inputArray[i + gap]
                    inputArray[i + gap] = temp
                    swapped = true
                }
            }
        }
        val finishAlg = System.currentTimeMillis().toDouble()
        return finishAlg - startAlg
    }

    public fun combSort(inputArray: ArrayList<Int>): Double {
        val startAlg = System.currentTimeMillis().toDouble()
        var temp: Int
        val arrLength: Int = inputArray.size
        var gap = arrLength
        var swapped = true
        while (gap != 1 || swapped) {
            gap = getNextGap(gap)
            swapped = false
            for (i in 0 until arrLength - gap) {
                if (inputArray[i] > inputArray[i + gap]) {
                    temp = inputArray[i]
                    inputArray[i] = inputArray[i + gap]
                    inputArray[i + gap] = temp
                    swapped = true
                }
            }
        }
        val finishAlg = System.currentTimeMillis().toDouble()
        return finishAlg - startAlg
    }

    public fun combSort(inputArray: LinkedList<Int>): Double {
        val startAlg = System.currentTimeMillis().toDouble()
        var temp: Int
        val arrLength: Int = inputArray.size
        var gap = arrLength
        var swapped = true
        while (gap != 1 || swapped) {
            gap = getNextGap(gap)
            swapped = false
            for (i in 0 until arrLength - gap) {
                if (inputArray[i] > inputArray[i + gap]) {
                    temp = inputArray[i]
                    inputArray[i] = inputArray[i + gap]
                    inputArray[i + gap] = temp
                    swapped = true
                }
            }
        }
        val finishAlg = System.currentTimeMillis().toDouble()
        return finishAlg - startAlg
    }

    //--------------------------------------------------------------------------------------------------
    //Быстрая сортировка
    fun partition(inputArray: IntArray, begin: Int, end: Int): Int {
        val pivot = inputArray[end]
        var i = begin - 1
        for (j in begin until end) {
            if (inputArray[j] <= pivot) {
                i++
                val swapTemp = inputArray[i]
                inputArray[i] = inputArray[j]
                inputArray[j] = swapTemp
            }
        }
        val swapTemp = inputArray[i + 1]
        inputArray[i + 1] = inputArray[end]
        inputArray[end] = swapTemp
        return i + 1
    }

    public fun quickSort(inputArray: IntArray, begin: Int, end: Int): Double {
        val startAlg = System.currentTimeMillis().toDouble()
        if (begin < end) {
            val partitionIndex = partition(inputArray, begin, end)
            quickSort(inputArray, begin, partitionIndex - 1)
            quickSort(inputArray, partitionIndex + 1, end)
        }
        val finishAlg = System.currentTimeMillis().toDouble()
        return finishAlg - startAlg
    }

    fun partition(inputArray: ArrayList<Int>, begin: Int, end: Int): Int {
        val pivot = inputArray[end]
        var i = begin - 1
        for (j in begin until end) {
            if (inputArray[j] <= pivot) {
                i++
                val swapTemp = inputArray[i]
                inputArray[i] = inputArray[j]
                inputArray[j] = swapTemp
            }
        }
        val swapTemp = inputArray[i + 1]
        inputArray[i + 1] = inputArray[end]
        inputArray[end] = swapTemp
        return i + 1
    }

    public fun quickSort(inputArray: ArrayList<Int>, begin: Int, end: Int): Double {
        val startAlg = System.currentTimeMillis().toDouble()
        if (begin < end) {
            val partitionIndex = partition(inputArray, begin, end)
            quickSort(inputArray, begin, partitionIndex - 1)
            quickSort(inputArray, partitionIndex + 1, end)
        }
        val finishAlg = System.currentTimeMillis().toDouble()
        return finishAlg - startAlg
    }

    fun partition(inputArray: LinkedList<Int>, begin: Int, end: Int): Int {
        val pivot = inputArray[end]
        var i = begin - 1
        for (j in begin until end) {
            if (inputArray[j] <= pivot) {
                i++
                val swapTemp = inputArray[i]
                inputArray[i] = inputArray[j]
                inputArray[j] = swapTemp
            }
        }
        val swapTemp = inputArray[i + 1]
        inputArray[i + 1] = inputArray[end]
        inputArray[end] = swapTemp
        return i + 1
    }

    public fun quickSort(inputArray: LinkedList<Int>, begin: Int, end: Int): Double {
        val startAlg = System.currentTimeMillis().toDouble()
        if (begin < end) {
            val partitionIndex = partition(inputArray, begin, end)
            quickSort(inputArray, begin, partitionIndex - 1)
            quickSort(inputArray, partitionIndex + 1, end)
        }
        val finishAlg = System.currentTimeMillis().toDouble()
        return finishAlg - startAlg
    }
}