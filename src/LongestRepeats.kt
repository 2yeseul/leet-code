class LongestRepeats {
    // 중복되지 않는 문자열 길이 구해야함
    // 현재 위치 필요
    companion object {
        fun getLengthOfLongestSubstring(value: String): Int {
            // 1. 문자열을 하나 씩 읽는다.
            var cursor = 0
            var head = 0
            var maxLength = 0
            var compareValue = ""

            // anviaj
            while (cursor < value.length) {
                // 1) 저장된 문자열에 현재 커서가 가리키는 값이 포함되어 있지 않다면 문자열에 현재 가리켜진 값을 추가하고, cursor도 한 칸 증가시킨다.
                println("######### [head is $head cursor is $cursor] #########")
                val nowValue = value[cursor]
                if (!compareValue.contains(value[cursor])) {
                    compareValue += nowValue
                    cursor++
                }
                // 2) 저장된 문자열에 현재 커서가 가리키는 값이 포함되어 있다면, head를 한 칸 이동 시키고, cursor를 head로 이동시킨다. compareValue를 현재 커서로 할당한다
                else {
                    // head와 cursor 초기화
                    println("[$head, $cursor], $compareValue contains $nowValue")
                    head += 1
                    cursor = head
                    compareValue = ""
                }

                maxLength = if (compareValue.length > maxLength) compareValue.length else maxLength
            }
            if (maxLength == 0) maxLength = value.length
            return maxLength
        }
    }
}

fun main() {
    val input = "abcabcbb"
    val count = LongestRepeats.getLengthOfLongestSubstring(input)
    println(count)
}