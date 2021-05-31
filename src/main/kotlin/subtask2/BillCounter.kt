package subtask2


class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var sumBrain = 0
        var sumAll = 0
        bill.forEachIndexed { index, item ->
            if (index != k) {
                sumBrain += item
            }
            sumAll += item
        }

        if ((sumBrain.toDouble() / 2.0) == b.toDouble()) {
            return "Bon Appetit"
        }

        val result = b.toDouble() - sumBrain.toDouble() / 2.0
        val intResult = result.toInt()

        if (intResult.toDouble() == result) {
            return intResult.toString()
        }

        return result.toString()
    }
}
