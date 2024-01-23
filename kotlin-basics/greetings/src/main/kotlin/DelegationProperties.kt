import kotlin.properties.Delegates

class User(map: Map<String, Any>) {
    var name: String by Delegates.observable("abc") {
            prop, old, new ->
        println("$old -> $new")
    }
    var value: Int by Delegates.vetoable(0) { property, oldValue, newValue ->
        // Veto the change if the new value is not positive
        if(newValue > 0) {
            println("$property: $oldValue -> $newValue")
            return@vetoable true
        } else false
    }

    var oldName: String by this::name

    val mapName by map

    val age by map
}

fun main(){
    var user = User(mapOf(
        "mapName" to "John Doe",
        "age"  to 25
    ))
    user.name = "Ritish"
    user.name = "Manan"

    // Setting a positive value, the change is allowed
    user.value = 42
    // Output: value: 0 -> 42

    // Setting a non-positive value, the change is vetoed
    user.value = -5
    // Output: (no output, value remains 42)

    user.value =10

    user.oldName = "old"

    println(user.name)
    println("Final value: ${user.value}")

    println("map name = ${user.mapName}, ${user.age}")
}