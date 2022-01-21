import java.math.BigInteger

class TwoSum {
    // 문제 요악 :
    // - 양수, not empty, 정수 링크드 리스트 배열
    // - 각각의 숫자들은 정반대 순서로 저장되어 있다.
    // - 0은 제외하기
    // 두 링크드 리스트 (정방향의 숫자를) 더한 결과를 리스트 노드로 반환하기
    fun addTwoNumbers(l1: ListNode, l2: ListNode): ListNode {
        // 1.  각각의 노드들에서 원래의 숫자 반환하기
        val firstNumber = getOriginalNumber(l1)
        val secondNumber = getOriginalNumber(l2)

        // 2. 각각의 숫자를 더하기
        val addedValue = firstNumber + secondNumber

        // 3. 각 자리의 숫자를 노드에 집어넣기
        return setEachDigitsToList(addedValue.toString().reversed())
    }

    private fun getOriginalNumber(listNode: ListNode): BigInteger {
        var originalValue: String = ""
        var nodeValue = listNode

        while (true) {
            originalValue = nodeValue.`val`.toString() + originalValue
            if (nodeValue.next == null) break else nodeValue = nodeValue.next
        }

        return if (originalValue.isNotEmpty()) originalValue.toBigInteger() else 0.toBigInteger()
    }

    private fun setEachDigitsToList(value: String): ListNode {
        val root: ListNode = ListNode(0)
        var cursor = root

        for (i in value.indices) {
            val item = value[i].toString().toInt()
            cursor.next = ListNode(item)
            cursor = cursor.next
        }
        return root.next
    }
}
