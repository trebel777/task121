fun main() {
    val percentOfCommission = 0.0075
    val roublesCommission = 3500
    val amount = 10_000
    val percentCommission = amount * percentOfCommission
    val totalCommission = if (percentCommission >= roublesCommission) percentCommission else roublesCommission
    println("Ваша комиссия за перевод в $amount копеек составляет $totalCommission  копеек")
}