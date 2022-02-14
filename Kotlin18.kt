// 7. Написать функцию, которая принимает на вход массив, и возвращает на выходе другой массив,
// в котором каждый элемент = предыдущий * 10 / 2. Дескриптор: (Array<Int> -> Array<Int>)
fun main() {
    val array = arrayOf(1, 2, 3, 4, 5)
    println(check(array).contentToString())
}

fun check(array: Array<Int>): Array<Int> {
    for (i in array.indices) {
        if (i == 0) {
            continue
        }
        val previous = array[i - 1]
        array[i] = previous * 10 / 2
    }
    return array
}