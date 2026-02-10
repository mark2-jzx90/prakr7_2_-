fun main(){
    try
    {
        println("Введи a: ")
        var a = readln().toDouble()
        println("Введи б: ")
        var b = readln().toDouble()
        println("Введи с: ")
        var c = readln().toDouble()
        println("Введи d: ")
        var d = readln().toDouble()
        println("Введи x: ")
        var x = readln().toDouble()
        var result = when {
    x >= a && x <= b && x >= c && x <= d -> "в общей части"
    x >= a && x <= b -> "только в [a,b]"
    x >= c && x <= d -> "только в [c,d]"
    else -> "ни в одной тчасти"
}
        println("Результат: x принадлежит $result")
    }
    catch (e:NumberFormatException)
    {
        println("Неверный формат данных")
    }
}