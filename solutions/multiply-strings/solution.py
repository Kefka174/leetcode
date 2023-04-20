"""
:type num1: str
:type num2: str
:rtype: str
"""
def multiply(num1, num2):
    num1 = stringToInt(num1)
    num2 = stringToInt(num2)
    return intToString(num1 * num2)

def stringToInt(str):
    result = 0
    for digit in str:
        result *= 10
        result += ord(digit) - 48
    return result

def intToString(int):
    if int == 0: return "0"
    returnString = ""
    digitList = []
    while int:
        digit = int % 10
        int = (int - digit) // 10
        digitList.append(chr(digit + 48))
    # manualy convert list to string
    for i in range(len(digitList)): returnString += digitList.pop()
    return returnString



assert multiply("2", "3") == "6"
assert multiply("123", "456") == "56088"
assert multiply("0", "0") == "0"