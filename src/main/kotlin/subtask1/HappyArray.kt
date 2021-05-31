package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        if (sadArray.size < 3) {
            return sadArray
        }
        val result: MutableList<Int> = sadArray.toMutableList()
        var i = 1

        while (i < result.size - 1) {
            if (result[i-1] + result[i+1] < result[i]) {
                result.removeAt(i)
                i = 1
                continue
            }
            i++
        }
        return result.toIntArray()
    }
}
