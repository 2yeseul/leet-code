function reverse(x: number): number {
  if (x / 10 === 0) {
    return x
  }

  const isNegative: boolean = x.toString()[0] === '-'
  const parsedInput = isNegative ? x.toString().slice(1, x.toString().length) : x.toString()

  let reversed = ''
  for (let i = parsedInput.length - 1; i >= 0; i--) {
    if (i === parsedInput.length - 1 && parsedInput[i] === '0') {
      continue
    }
    reversed += parsedInput[i]
  }

  const result = isNegative ? parseInt(`-${reversed}`) : parseInt(reversed)

  if (result >= 2147483648 || result <= -2147483649) {
    return 0
  }

  return result
}