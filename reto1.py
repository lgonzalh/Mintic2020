edad = int(input('Indicar la edad del paciente:'))
peso = float(input('Indicar el peso del paciente en kilogramos:'))
dias=0
estado=""

if edad >=5 and edad <=10 and peso>=22 and peso<=24:
    estado = "A"
    print(f'El estado nutricional del paciente es {estado} y se requieren {dias} días de dieta para que alcance el peso máximo') 
elif edad >=5 and edad <=10 and peso>24 and peso<=28:
    estado = "A"
    print(f'El estado nutricional del paciente es {estado} y se requieren {dias} días de dieta para que alcance el peso máximo')
elif edad >=5 and edad <=10 and peso>28:
    estado = "A"
    print(f'El estado nutricional del paciente es {estado} y se requieren {dias} días de dieta para que alcance un peso saludable')
elif edad >5 and edad <=10 and peso<16:
    estado = "A"
    print(f'El estado nutricional del paciente es {estado} y se requieren {dias} días de dieta para que alcance un peso saludable')
elif : 
    exit()

if edad >=10 and edad <=13 and peso>=32 and peso<=43:
    estado = "A"
    print(f'El estado nutricional del paciente es {estado} y se requieren {dias} días de dieta para que alcance el peso máximo') 
elif edad >=10 and edad <=13 and peso>43 and peso<=50:
    estado = "A"
    print(f'El estado nutricional del paciente es {estado} y se requieren {dias} días de dieta para que alcance el peso máximo')
elif edad >=10 and edad <=13 and peso>50:
    estado = "A"
    print(f'El estado nutricional del paciente es {estado} y se requieren {dias} días de dieta para que alcance un peso saludable')
elif edad >10 and edad <=13 and peso>16 and peso<30:
    estado = "A"
    print(f'El estado nutricional del paciente es {estado} y se requieren {dias} días de dieta para que alcance un peso saludable')    
else:
    estado = "A"
    print(f'El estado nutricional del paciente es {estado} y se requieren {dias} días de dieta para que alcance un peso saludable')
    exit()

print("Listo")
#solucion(edad,peso)
#("El estado nutricional del paciente es  y se requieren  días de dieta para que alcance el peso máximo")
#print(f'El estado nutricional del paciente es {estado} y se requieren {dias} días de dieta para que alcance un peso saludable')