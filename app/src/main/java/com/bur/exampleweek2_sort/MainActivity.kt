package com.bur.exampleweek2_sort

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bur.exampleweek2_sort.Utils.Algorithms
import com.bur.exampleweek2_sort.Utils.ArraysCreate
import com.bur.exampleweek2_sort.databinding.ActivityMainBinding
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    val algorithms: Algorithms = Algorithms()
    val arraysCreate: ArraysCreate = ArraysCreate()

    private var arraySizeEditText: EditText? = null

    private lateinit var chipStatic: Chip
    private lateinit var chipDynamic: Chip
    private lateinit var chipList: Chip

    private lateinit var bubbleSortChip: Chip
    private lateinit var shakerSortChip: Chip
    private lateinit var combSortChip: Chip
    private lateinit var quickSortChip: Chip
    private lateinit var insertionSortChip: Chip
    private lateinit var selectionSortChip: Chip
    private lateinit var mergeSortChip: Chip
    private lateinit var heapSortChip: Chip

    private lateinit var startSortButton: Button

    private lateinit var chipDataTypeGroup: ChipGroup
    private lateinit var chipAlgorithmGroup: ChipGroup

    private var isStaticArray = false
    private var isDynamicArray = false
    private var isListArray = false

    private var isBubbleSort = false
    private var isInsertionSort = false
    private var isSelectionSort = false
    private var isMergeSort = false
    private var isHeapSort = false
    private var isShakerSort = false
    private var isCombSort = false
    private var isQuickSort = false

    private var resultTime = 0.0
    private var arrayNumbers = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initialization()
        chipGroupListener()

        binding.startSortButton.setOnClickListener {
            val editText = arraySizeEditText?.text.toString()

            if (editText.isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Введите целое число!",
                    Toast.LENGTH_LONG
                ).show();
            } else {
                arrayNumbers = editText.toInt()
                //=====StaticArray======================================================================
                //Сортировка пузырьком
                if (isStaticArray && isBubbleSort) {
                    resultTime =
                        algorithms.bubbleSort(arraysCreate.staticArrayCreation(arrayNumbers));
                    Toast.makeText(
                        applicationContext,
                        "Статический массив, Cортировка пузырьком. Время выполения алгоритма: " + resultTime + " мс",
                        Toast.LENGTH_LONG
                    ).show();
                }
                //Сортировка вставками
                else if (isStaticArray && isInsertionSort) {
                    resultTime =
                        algorithms.insertionSort(arraysCreate.staticArrayCreation(arrayNumbers));
                    Toast.makeText(
                        applicationContext,
                        "Статический массив, Сортировка вставками. Время выполения алгоритма: " + resultTime + " мс",
                        Toast.LENGTH_LONG
                    ).show();
                }
                //Сортировка выбором
                else if (isStaticArray && isSelectionSort) {
                    resultTime =
                        algorithms.selectionSort(arraysCreate.staticArrayCreation(arrayNumbers));
                    Toast.makeText(
                        applicationContext,
                        "Статический массив, Сортировка выбором. Время выполения алгоритма: " + resultTime + " мс",
                        Toast.LENGTH_LONG
                    ).show();
                }
                //Сортировка слиянием
                else if (isStaticArray && isMergeSort) {
                    resultTime = algorithms.mergeSort(
                        arraysCreate.staticArrayCreation(arrayNumbers),
                        0,
                        arraysCreate.staticArrayCreation(arrayNumbers).size - 1
                    );
                    Toast.makeText(
                        applicationContext,
                        "Статический массив, Сортировка слиянием. Время выполения алгоритма: " + resultTime + " мс",
                        Toast.LENGTH_LONG
                    ).show();
                }
                //Пирамидальная сортировка
                else if (isStaticArray && isHeapSort) {
                    resultTime =
                        algorithms.heapSort(arraysCreate.staticArrayCreation(arrayNumbers));
                    Toast.makeText(
                        applicationContext,
                        "Статический массив, Пирамидальная сортировка. Время выполения алгоритма: " + resultTime + " мс",
                        Toast.LENGTH_LONG
                    ).show();
                }
                //Шейкерная сортировка
                else if (isStaticArray && isShakerSort) {
                    resultTime =
                        algorithms.shakerSort(arraysCreate.staticArrayCreation(arrayNumbers));
                    Toast.makeText(
                        applicationContext,
                        "Статический массив, Шейкерная сортировка. Время выполения алгоритма: " + resultTime + " мс",
                        Toast.LENGTH_LONG
                    ).show();
                }
                //Сортировка расчёской
                else if (isStaticArray && isCombSort) {
                    resultTime =
                        algorithms.combSort(arraysCreate.staticArrayCreation(arrayNumbers));
                    Toast.makeText(
                        applicationContext,
                        "Статический массив, Сортировка расчёской. Время выполения алгоритма: " + resultTime + " мс",
                        Toast.LENGTH_LONG
                    ).show();
                }
                //Быстрая сортировка
                else if (isStaticArray && isQuickSort) {
                    resultTime = algorithms.quickSort(
                        arraysCreate.staticArrayCreation(arrayNumbers),
                        0,
                        arraysCreate.staticArrayCreation(arrayNumbers).size - 1
                    );
                    Toast.makeText(
                        applicationContext,
                        "Статический массив, Быстрая сортировка. Время выполения алгоритма: " + resultTime + " мс",
                        Toast.LENGTH_LONG
                    ).show();
                }


                //=====DynamicArray=====================================================================
                if (isDynamicArray && isBubbleSort) {
                    resultTime =
                        algorithms.bubbleSort(arraysCreate.dynamicArrayCreation(arrayNumbers));
                    Toast.makeText(
                        applicationContext,
                        "Динамический массив, Cортировка пузырьком. Время выполения алгоритма: " + resultTime + " мс",
                        Toast.LENGTH_LONG
                    ).show();
                }
                //Сортировка вставками
                else if (isDynamicArray && isInsertionSort) {
                    resultTime =
                        algorithms.insertionSort(arraysCreate.dynamicArrayCreation(arrayNumbers));
                    Toast.makeText(
                        applicationContext,
                        "Динамический массив, Сортировка вставками. Время выполения алгоритма: " + resultTime + " мс",
                        Toast.LENGTH_LONG
                    ).show();
                }
                //Сортировка выбором
                else if (isDynamicArray && isSelectionSort) {
                    resultTime =
                        algorithms.selectionSort(arraysCreate.dynamicArrayCreation(arrayNumbers));
                    Toast.makeText(
                        applicationContext,
                        "Динамический массив, Сортировка выбором. Время выполения алгоритма: " + resultTime + " мс",
                        Toast.LENGTH_LONG
                    ).show();
                }
                //Сортировка слиянием
                else if (isDynamicArray && isMergeSort) {
                    resultTime = algorithms.mergeSort(
                        arraysCreate.dynamicArrayCreation(arrayNumbers),
                        0,
                        arraysCreate.dynamicArrayCreation(arrayNumbers).size - 1
                    );
                    Toast.makeText(
                        applicationContext,
                        "Динамический массив, Сортировка слиянием. Время выполения алгоритма: " + resultTime + " мс",
                        Toast.LENGTH_LONG
                    ).show();
                }
                //Пирамидальная сортировка
                else if (isDynamicArray && isHeapSort) {
                    resultTime =
                        algorithms.heapSort(arraysCreate.dynamicArrayCreation(arrayNumbers));
                    Toast.makeText(
                        applicationContext,
                        "Динамический массив, Пирамидальная сортировка. Время выполения алгоритма: " + resultTime + " мс",
                        Toast.LENGTH_LONG
                    ).show();
                }
                //Шейкерная сортировка
                else if (isDynamicArray && isShakerSort) {
                    resultTime =
                        algorithms.shakerSort(arraysCreate.dynamicArrayCreation(arrayNumbers));
                    Toast.makeText(
                        applicationContext,
                        "Динамический массив, Шейкерная сортировка. Время выполения алгоритма: " + resultTime + " мс",
                        Toast.LENGTH_LONG
                    ).show();
                }
                //Сортировка расчёской
                else if (isDynamicArray && isCombSort) {
                    resultTime =
                        algorithms.combSort(arraysCreate.dynamicArrayCreation(arrayNumbers));
                    Toast.makeText(
                        applicationContext,
                        "Динамический массив, Сортировка расчёской. Время выполения алгоритма: " + resultTime + " мс",
                        Toast.LENGTH_LONG
                    ).show();
                }
                //Быстрая сортировка
                else if (isDynamicArray && isQuickSort) {
                    resultTime = algorithms.quickSort(
                        arraysCreate.dynamicArrayCreation(arrayNumbers),
                        0,
                        arraysCreate.dynamicArrayCreation(arrayNumbers).size - 1
                    );
                    Toast.makeText(
                        applicationContext,
                        "Динамический массив, Быстрая сортировка. Время выполения алгоритма: " + resultTime + " мс",
                        Toast.LENGTH_LONG
                    ).show();
                }


                //=====ListArray========================================================================
                if (isListArray && isBubbleSort) {
                    resultTime =
                        algorithms.bubbleSort(arraysCreate.listArrayCreation(arrayNumbers));
                    Toast.makeText(
                        applicationContext,
                        "Список, Cортировка пузырьком. Время выполения алгоритма: " + resultTime + " мс",
                        Toast.LENGTH_LONG
                    ).show();
                }
                //Сортировка вставками
                else if (isListArray && isInsertionSort) {
                    resultTime =
                        algorithms.insertionSort(arraysCreate.listArrayCreation(arrayNumbers));
                    Toast.makeText(
                        applicationContext,
                        "Список, Сортировка вставками. Время выполения алгоритма: " + resultTime + " мс",
                        Toast.LENGTH_LONG
                    ).show();
                }
                //Сортировка выбором
                else if (isListArray && isSelectionSort) {
                    resultTime =
                        algorithms.selectionSort(arraysCreate.listArrayCreation(arrayNumbers));
                    Toast.makeText(
                        applicationContext,
                        "Список, Сортировка выбором. Время выполения алгоритма: " + resultTime + " мс",
                        Toast.LENGTH_LONG
                    ).show();
                }
                //Сортировка слиянием
                else if (isListArray && isMergeSort) {
                    resultTime = algorithms.mergeSort(
                        arraysCreate.listArrayCreation(arrayNumbers),
                        0,
                        arraysCreate.listArrayCreation(arrayNumbers).size - 1
                    );
                    Toast.makeText(
                        applicationContext,
                        "Список, Сортировка слиянием. Время выполения алгоритма: " + resultTime + " мс",
                        Toast.LENGTH_LONG
                    ).show();
                }
                //Пирамидальная сортировка
                else if (isListArray && isHeapSort) {
                    resultTime = algorithms.heapSort(arraysCreate.listArrayCreation(arrayNumbers));
                    Toast.makeText(
                        applicationContext,
                        "Список, Пирамидальная сортировка. Время выполения алгоритма: " + resultTime + " мс",
                        Toast.LENGTH_LONG
                    ).show();
                }
                //Шейкерная сортировка
                else if (isListArray && isShakerSort) {
                    resultTime =
                        algorithms.shakerSort(arraysCreate.listArrayCreation(arrayNumbers));
                    Toast.makeText(
                        applicationContext,
                        "Список, Шейкерная сортировка. Время выполения алгоритма: " + resultTime + " мс",
                        Toast.LENGTH_LONG
                    ).show();
                }
                //Сортировка расчёской
                else if (isListArray && isCombSort) {
                    resultTime = algorithms.combSort(arraysCreate.listArrayCreation(arrayNumbers));
                    Toast.makeText(
                        applicationContext,
                        "Список, Сортировка расчёской. Время выполения алгоритма: " + resultTime + " мс",
                        Toast.LENGTH_LONG
                    ).show();
                }
                //Быстрая сортировка
                else if (isListArray && isQuickSort) {
                    resultTime = algorithms.quickSort(
                        arraysCreate.listArrayCreation(arrayNumbers),
                        0,
                        arraysCreate.listArrayCreation(arrayNumbers).size - 1
                    );
                    Toast.makeText(
                        applicationContext,
                        "Список, Быстрая сортировка. Время выполения алгоритма: " + resultTime + " мс",
                        Toast.LENGTH_LONG
                    ).show();
                }
            }
        }
    }

    private fun initialization() {
        arraySizeEditText = binding.arraySizeEditText

        chipDataTypeGroup = binding.chipDataTypeGroup
        chipAlgorithmGroup = binding.chipAlgorithmGroup

        chipStatic = binding.chipStatic
        chipDynamic = binding.chipDynamic
        chipList = binding.chipList

        bubbleSortChip = binding.bubbleSortChip
        insertionSortChip = binding.insertionSortChip
        selectionSortChip = binding.selectionSortChip
        mergeSortChip = binding.mergeSortChip
        heapSortChip = binding.heapSortChip
        shakerSortChip = binding.shakerSortChip
        combSortChip = binding.combSortChip
        quickSortChip = binding.quickSortChip

        startSortButton = binding.startSortButton
    }

    private fun chipGroupListener() {
        binding.chipDataTypeGroup.setOnCheckedStateChangeListener { group, checkedIds ->
            if (chipStatic.isChecked) {
                isStaticArray = true
                isDynamicArray = false
                isListArray = false
            } else if (chipDynamic.isChecked) {
                isStaticArray = false
                isDynamicArray = true
                isListArray = false
            } else if (chipList.isChecked) {
                isStaticArray = false
                isDynamicArray = false
                isListArray = true
            }
        }
        binding.chipAlgorithmGroup.setOnCheckedStateChangeListener { group, checkedIds ->
            if (bubbleSortChip.isChecked) {
                isBubbleSort = true
                isInsertionSort = false
                isSelectionSort = false
                isMergeSort = false
                isHeapSort = false
                isShakerSort = false
                isCombSort = false
                isQuickSort = false
            } else if (insertionSortChip.isChecked) {
                isBubbleSort = false
                isInsertionSort = true
                isSelectionSort = false
                isMergeSort = false
                isHeapSort = false
                isShakerSort = false
                isCombSort = false
                isQuickSort = false
            } else if (selectionSortChip.isChecked) {
                isBubbleSort = false
                isInsertionSort = false
                isSelectionSort = true
                isMergeSort = false
                isHeapSort = false
                isShakerSort = false
                isCombSort = false
                isQuickSort = false
            } else if (mergeSortChip.isChecked) {
                isBubbleSort = false
                isInsertionSort = false
                isSelectionSort = false
                isMergeSort = true
                isHeapSort = false
                isShakerSort = false
                isCombSort = false
                isQuickSort = false
            } else if (heapSortChip.isChecked) {
                isBubbleSort = false
                isInsertionSort = false
                isSelectionSort = false
                isMergeSort = false
                isHeapSort = true
                isShakerSort = false
                isCombSort = false
                isQuickSort = false
            } else if (shakerSortChip.isChecked) {
                isBubbleSort = false
                isInsertionSort = false
                isSelectionSort = false
                isMergeSort = false
                isHeapSort = false
                isShakerSort = true
                isCombSort = false
                isQuickSort = false
            } else if (combSortChip.isChecked) {
                isBubbleSort = false
                isInsertionSort = false
                isSelectionSort = false
                isMergeSort = false
                isHeapSort = false
                isShakerSort = false
                isCombSort = true
                isQuickSort = false
            } else if (quickSortChip.isChecked) {
                isBubbleSort = false
                isInsertionSort = false
                isSelectionSort = false
                isMergeSort = false
                isHeapSort = false
                isShakerSort = false
                isCombSort = false
                isQuickSort = true
            }
        }
    }
}