"""
:type s: str
:rtype: int
"""
def calculate(s): # converts string into list of numbers and operators, takes 2 passes to process */ then +-
    expression = []
    for char in s:
        if char != ' ':
            if char.isdigit():
                if expression and isinstance(expression[-1], int): expression[-1] = (expression[-1] * 10) + (ord(char) - 48)
                else: expression.append(ord(char) - 48)
            else: expression.append(char)
    if len(expression) == 1: return expression[0]

    expressionWithoutMultDiv = [expression[0]]
    for i in range(1, len(expression), 2):
        if expression[i] == '*': expressionWithoutMultDiv[-1] *= expression[i + 1]
        elif expression[i] == '/': expressionWithoutMultDiv[-1] //= expression[i + 1]
        else:
            expressionWithoutMultDiv.append(expression[i])
            expressionWithoutMultDiv.append(expression[i + 1])

    total = expressionWithoutMultDiv[0]
    for i in range(1, len(expressionWithoutMultDiv), 2):
        if expressionWithoutMultDiv[i] == '+': total += expressionWithoutMultDiv[i + 1]
        else: total -= expressionWithoutMultDiv[i + 1]

    return total



assert calculate("3+2*2") == 7
assert calculate(" 3/2 ") == 1
assert calculate(" 3+5 / 2 ") == 5
assert calculate("1-1+1") == 1
assert calculate("0") == 0
assert calculate("2*3+4") == 10