fun main() {
    println(agoToText(60));
    println(agoToText(2 * 60));
    println(agoToText(3 * 60));
    println(agoToText(5 * 60));
    println(agoToText(10 * 60));
    println(agoToText(11 * 60));
    println(agoToText(16 * 60));
    println(agoToText(21 * 60));
    println(agoToText(22 * 60));
    println(agoToText(25 * 60));
    println(agoToText(60 * 60));
    println(agoToText(2 * 60 * 60));
    println(agoToText(3 * 60 * 60));
    println(agoToText(5 * 60 * 60));
    println(agoToText(10 * 60 * 60));
    println(agoToText(11 * 60 * 60));
    println(agoToText(16 * 60 * 60));
    println(agoToText(21 * 60 * 60));
    println(agoToText(22 * 60 * 60));
    println(agoToText(24 * 60 * 60 - 30));
    println(agoToText(48 * 60 * 60 - 30));
    println(agoToText(72 * 60 * 60 - 30));
    println(agoToText(172 * 60 * 60 - 30));
}

fun agoToText(ago: Int): String {
    return when {
        ago <= 60 -> "только что"
        ago <= 60 * 60 -> getMinutesText(ago)
        ago <= 24 * 60 * 60 -> getHoursText(ago)
        ago <= 48 * 60 * 60 -> "сегодня"
        ago <= 72 * 60 * 60 -> "вчера"
        else -> "давно"
    };
}

fun getHoursText(ago: Int): String {
    val hour = ago / 60 / 60
    val ending = when {
        hour % 10 == 1 && hour != 11 -> ""
        hour % 10 in 2..4 && (hour < 10 || hour > 20) -> "а"
        else -> "ов"
    }
    return "$hour час$ending";
}

fun getMinutesText(ago: Int): String {
    val min = ago / 60;
    val ending = when {
        min % 10 == 1 && min != 11 -> "у"
        min % 10 in 2..4 && (min < 10 || min > 20) -> "ы"
        else -> ""
    }
    return "$min минут$ending";
}

