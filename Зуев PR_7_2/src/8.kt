fun main(){
    try
    {
        println("Введи первое число:")
        var a = readln().toDouble()

        println("Введи второе число:")
        var b = readln().toDouble()

        var resultA = when {
            a <= b -> 0
            else -> a
        }
        println("Было: $a, $b")
        println("Стало: $resultA, $b")

    }
    catch (e:NumberFormatException)
    {
        println("Неверный формат данных")
    }
}