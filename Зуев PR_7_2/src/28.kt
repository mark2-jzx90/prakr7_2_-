fun main(){
    try
    {
        println("Введи а: ")
        var a = readln().toDouble()
        println("Введи б: ")
        var b = readln().toDouble()
        println("Введи с: ")
        var c = readln().toDouble()
        println("Введи f: ")
        var f = readln().toDouble()

        var det = a * (-a) - b * c
        when {
            det == 0.0 -> println("Нет един. решения")
            else -> {
                var x = (c * (-a) - b * f) / det
                var y = (a * f - c * c) / det
                println("x = $x и y = $y")
            }
        }
    }
    catch (e:NumberFormatException)
    {
        println("Неверный формат данных")
    }
}