def calcular_promedio_y_cuadro_honor(grupo):
    suma_notas = 0
    notas = set()
    cuadro_honor = {
        1:[],
        2:[],
        3:[]
    }

    for estudiante in grupo:
        suma_notas += estudiante["nota_fundamentos"]
        notas = notas.union([estudiante["nota_fundamentos"]])
    notas = list(notas)
    notas.sort()
    notas = notas[-3:]
    for estudiante in grupo:
        if estudiante["nota_fundamentos"] == notas[0]:
            cuadro_honor[3].append(estudiante["cédula"])
        elif estudiante["nota_fundamentos"] == notas[1]:
            cuadro_honor[2].append(estudiante["cédula"])
        elif estudiante["nota_fundamentos"] == notas[2]:
            cuadro_honor[1].append(estudiante["cédula"])
    return suma_notas/len(grupo),cuadro_honor