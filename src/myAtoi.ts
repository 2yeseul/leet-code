function myAtoi(s: string) {
  const numbers: number[] = []
  const sign = s.trim()[0] === '-' || s.trim()[0] === '+' ? s.trim()[0] : undefined
  const trimmedInput = sign ? s.trim().slice(1, s.length) : s.trim()
  const max = Math.pow(2, 31) - 1
  const min = -Math.pow(2, 31)

  for (const value of trimmedInput) {
    if (!parseInt(value)) {
      break
    }
    
    numbers.push(parseInt(value))
  }

  if (numbers.length === 0) {
    return 0
  }

  const result = sign === '-' ? Number(numbers.join('')) * -1 : Number(numbers.join(''))
  return result >= max ? max : result <= min ? min : result
}

