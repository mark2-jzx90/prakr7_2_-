fun main(){
    try
    {
       println("Введи номер дня недели (1-7): ")
        var Num = readln().toInt()
       var result = when(Num){
           1, 2, 3, 4, 5 -> "Рабочий день! К сожалению..."
           6,7 -> "Выходной день! УРА!!"
           else -> "Введи число от 1-7!! Не зли меня.."
       }
        println("Ты ввёл $Num, а значит это $result")
    }
    catch (e:NumberFormatException)
    {
        println("Неверный формат данных")
    }
}