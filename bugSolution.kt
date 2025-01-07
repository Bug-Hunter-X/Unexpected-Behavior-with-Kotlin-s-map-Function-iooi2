fun main() {
    var list = mutableListOf(1, 2, 3, 4, 5)
    list = list.map { it * 2 }.toMutableList()
    println(list) // Output: [2, 4, 6, 8, 10]

    //Alternative solution using mapIndexedTo
    var list2 = mutableListOf(1,2,3,4,5)
    list2.mapIndexedTo(list2){index, i -> i*2}
    println(list2)// Output: [2, 4, 6, 8, 10]
} 