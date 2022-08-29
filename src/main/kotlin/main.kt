import kotlin.random.Random

fun main() {
    var count = 0
    for (i in 1..2000){
        var number = Random.nextInt(20, 45)
        if (number > 38)
            count++
    }
    print(count)
}