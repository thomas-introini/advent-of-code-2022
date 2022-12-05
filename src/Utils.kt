import java.io.File
import java.math.BigInteger
import java.security.MessageDigest

/**
 * Reads lines from the given input txt file.
 */
fun readInput(name: String) = File("src", "$name.txt")
        .readLines()
fun readInput(name: String, delimiter: String) = File("src", "$name.txt")
        .readText().split(delimiter)

fun readInputAndSplit(name: String, delimiter: String = " ") = File("src", "$name.txt")
        .readLines().map { it.split(delimiter) }
fun readInputAndSplitInPairs(name: String, delimiter: String = " ") = File("src", "$name.txt")
    .readLines().map { it.split(delimiter).let { it.first() to it[1] } }

/**
 * Converts string to md5 hash.
 */
fun String.md5() = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray()))
    .toString(16)
    .padStart(32, '0')
