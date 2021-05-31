package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val str1: List<String> = arrayListOf("(", "<", "[")
        val str2: List<String> = arrayListOf(")", ">", "]")

        val count: MutableList<MutableList<Int>> = arrayListOf(arrayListOf(),
            arrayListOf(), arrayListOf())

        var i = 0
        val result: MutableList<Pair<Int, Int>> = arrayListOf()

        while (i < inputString.length) {
           val str = inputString.substring(i, i+1);
            val index1 = str1.indexOf(str)
            if (index1 != -1) {
                count[index1].add(i)
            } else {
                val index2 = str2.indexOf(str)
                if (index2 != -1) {
                    val size = count[index2].size
                    if (size > 0) {
                        val startIndex = count[index2][size - 1]
                        result.add(Pair(startIndex+1, i))
                        count[index2].removeAt(size - 1)
                    }
                }
            }
            i++
        }

        result.sortBy { it.first }

        val rezultStr: MutableList<String> = arrayListOf()
        result.forEach {
            val allStr = inputString.substring(it.first, it.second)
            rezultStr.add(allStr)
        }

        return rezultStr.toTypedArray()
    }
}
