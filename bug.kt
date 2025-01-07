fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    // This is incorrect, it doesn't modify the original list
    list.map { it * 2 }
    println(list) // Output: [1, 2, 3, 4, 5]
}