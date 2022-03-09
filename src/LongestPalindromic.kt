class LongestPalindromic {
    companion object {
        fun longestPalindrome(s: String): String {
            var maxLength = 0
            var result = ""

            for (i in s.indices) {
                for (j in i until s.length) {
                    val partial = s.substring(i, j + 1)
                    if (partial.length > maxLength && isPalindrome(partial)) {
                        maxLength = partial.length
                        result = partial
                    }
                }
            }
             return result
        }

        private fun isPalindrome(s: String): Boolean {
            var i = 0
            var j = s.length - 1
            while (i < j) {
                if (s[i] != s[j]) {
                    return false
                }
                i++
                j--
            }
            return true
        }
    }
}