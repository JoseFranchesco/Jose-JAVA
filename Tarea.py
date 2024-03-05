def evaluar_expresion_postfija(expresion):
    pila = []
    operadores = {'+': lambda x, y: x + y,
                 '-': lambda x, y: x - y,
                 '*': lambda x, y: x * y,
                 '/': lambda x, y: x / y}

    for token in expresion.split():
        if token.isdigit():
            pila.append(int(token))
        elif token in operadores:
            if len(pila) < 2:
                return "Expresión mal formada"
            operand2 = pila.pop()
            operand1 = pila.pop()
            resultado = operadores[token](operand1, operand2)
            pila.append(resultado)   
        else:
            return "Token no reconocido"
    
    if len(pila) == 1:
        return pila[0]
    else:
        return "Expresión mal formada"

expresion = "3 4 + 2 *"
print("Resultado:", evaluar_expresion_postfija(expresion))