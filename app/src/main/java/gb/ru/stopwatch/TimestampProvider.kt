package gb.ru.stopwatch

interface TimestampProvider {
    fun getMilliseconds(): Long
}