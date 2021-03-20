import kotlin.random.Random as KRandom
import java.util.Random as JRandom

fun useDifferentRandomClasses(): String {
    return "Kotlin random: " +
            KRandom.nextInt(5) +
            " Java random:" +
            JRandom().nextInt(5) +
            "."
}