function numUniqueEmails(emails: string[]): number {
  const splitLocalAndDomain = (email: string) => email.split('@')
  // 1. parse . from local
  const parsePeriodFromLocal = (email: string) => {
    const [local, domain] = splitLocalAndDomain(email)

    const parsed = local.includes('.') ? local.replaceAll('.', '') + '@' + domain : email
    console.log(`parsed :: ${parsed}`)
    return parsed
  }

  // 2. local + 이하 절삭
  const removeAfterAddition = (email: string) => {
    const [local, domain] = splitLocalAndDomain(email)

    const removed = local.includes('+') ? local.slice(0, local.indexOf('+')) + '@' + domain : email

    console.log(`removed :: ${removed}`)
    return removed
  }

  const uniqueEmails = Array.from(new Set(emails.map(parsePeriodFromLocal).map(removeAfterAddition)))

  console.log(uniqueEmails)

  return uniqueEmails.length
}