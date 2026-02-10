fun main(){
    try
    {
        println("Введите A и B (отверстие):")
        var A = readln().toDouble()
        val B = readln().toDouble()

        println("Введите x, y, z (кирпича):")
        var x = readln().toDouble()
        var y = readln().toDouble()
        var z = readln().toDouble()

        if (A <= 0 || B <= 0 || x <= 0 || y <= 0 || z <= 0) {
            println("Все размеры должны быть больше 0")
            return
        }
        var result = when {
            (x <= A && y <= B) || (y <= A && x <= B) -> "ДА"

            (x <= A && z <= B) || (z <= A && x <= B) -> "ДА"

            (y <= A && z <= B) || (z <= A && y <= B) -> "ДА"
            else -> "НЕТ"
        }
        println("Результат: $result")
    }
    catch (e:NumberFormatException)
    {
        println("Неверный формат данных")
    }
}