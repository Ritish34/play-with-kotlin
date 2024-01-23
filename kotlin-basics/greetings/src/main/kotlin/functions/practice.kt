package functions

fun main() {
    var ar = arrayOf(1, 5, 8, 12, 19, 27, 38, 40, 45, 50, 55, 57)
    var target = 60

    var size = ar.size
    var middle: Int = size/2

    var iteration : Int = 0
    var index = 0
    if (target > ar[size-1]){
        println("iteration = $iteration and index = $index and value = -1")
    }
    else{
        while (target > ar[0]){
            iteration++
            if (target == ar[middle]){
                index = middle
                break
            }
            if (target == ar[middle+1] || (target > ar[middle] && target < ar[middle+1])){
                index = middle+1
                break
            }
            if (target > ar[middle] && target > ar[middle+1]){
                middle += (size-middle)/2
            }
            if (target < ar[middle] && target < ar[middle+1]){
                middle /= 2
            }
        }
        println("iteration = $iteration and index = $index and value = ${ar[index]}")
    }

}