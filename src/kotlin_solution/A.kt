package kotlin_solution

import java.util.*

fun numberMirror(n: Int?) {
    println(n)
}

fun addTwoNumber(a: Int, b: Int): Int {
    return a + b
}

fun factorial() {
    val t = Integer.valueOf(readLine())
    var prod = 1
    for (i in 0 until t) {
        val n = Integer.valueOf(readLine())
        for (j in 1..n) {
            prod *= j

        }
        println(prod)
        prod = 1
    }
}

fun sumOfDigits() {
    val t = Integer.valueOf(readLine())
    var sum = 0
    var count = 0

    for (i in 0 until t) {
        var n = Integer.valueOf(readLine())

        while (n > 0) {
            val r = n % 10
            sum += r
            n /= 10
        }
        println(sum)
        sum = 0
    }
}

fun firstAndLast() {
    val t = Integer.valueOf(readLine())
    var sum = 0
    var reversed = 0

    for (i in 0 until t) {
        var n = Integer.valueOf(readLine())

        val last = n % 10

        while (n > 0) {
            val digit = n % 10
            reversed = reversed * 10 + digit
            n /= 10
        }

        val first = reversed % 10

        sum = first + last

        println(sum)
        reversed = 0
    }
}

fun reverse() {
    val t = Integer.valueOf(readLine())
    var reversed = 0

    for (i in 0 until t) {
        var n = Integer.valueOf(readLine())



        while (n > 0) {
            val digit = n % 10
            reversed = reversed * 10 + digit
            n /= 10
        }

        println(reversed)
        reversed = 0
    }
}

fun tram() {
    var max = 0
    var flag = 0
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    for (i in 0 until n) {
        val a = scanner.nextInt()
        val b = scanner.nextInt()

        flag += b
        flag -= a

        if (max < flag) {
            max = flag
        }
    }
    println(max)
}

fun nearlyLucky() {
    val scanner = Scanner(System.`in`)
    val s = scanner.next()
    var count = 0

    for (i in s.indices) {
        if (s[i] == '4' || s[i] == '7') {
            count++
        }
    }
    if (count == 4 || count == 7) {
        println("YES")
    } else {
        println("NO")
    }
}

fun antonDanik() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val s = scanner.next()
    var countA = 0
    var countD = 0

    for (i in s.indices) {
        if (s[i] == 'A') {
            countA++
        } else {
            countD++
        }
    }
    if (countA > countD) {
        println("Anton")
    } else if (countA < countD) {
        println("Danik")
    } else {
        println("Friendship")
    }

}

fun capsLock() {
    val scanner = Scanner(System.`in`)
    val s = scanner.next()
    val s1 = s[0].uppercase()
    print(s1)
    for (i in 1 until s.length) {
        val s2 = s[i].lowercase()
        print(s2)
    }
}

fun fence() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val h = scanner.nextInt()
    var flag = 0

    for (i in 0 until n) {
        val a = scanner.nextInt()

        flag += if (a <= h) {
            1
        } else {
            2
        }
    }
    println(flag)
}

fun magnets() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var count = 0
    val arr = Array(n) { scanner.next() }

    for (i in 0 until arr.size - 1) {
        if (arr[i] != arr[i + 1]) {
            count++
        }
    }
    println(count + 1)
}

fun calFun(){
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var sum = 0L

    for (i in 1 until  n+1){
        if (i % 2 == 0){
            sum += i
        }
        else{
            sum -= i
        }
    }
    println(sum)
}


fun main() {
//    val n: Int? = readLine()?.toInt()
//    numberMirror(n)

//    factorial()
//    sumOfDigits()
//    firstAndLast()
//    reverse()
//    tram()
//nearlyLucky()
//    antonDanik()
//    capsLock()
//    fence()
//    magnets()
    calFun()

}