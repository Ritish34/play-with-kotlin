fun main(){
    val listWithNulls: List<String?> = listOf("Kotlin", null,null)
    println(listWithNulls)
    listWithNulls.dropLast(1)
    for (item in listWithNulls) {
        item?.let { println(it) } // prints Kotlin and ignores null
    }
    println(listWithNulls)
    var b: String? = "null null"
    val l = b!!.length
    val aInt: Int? = b as? Int
    println("$l  $aInt")

    val nullableList= arrayOf(1, 2, null, 4)
    val nullableList1= arrayOf(1, 2, null, 5, 4)

    println(nullableList.contentEquals(nullableList1))
    val intList: List<Int> = nullableList.filterNotNull()

    println(intList)
}


