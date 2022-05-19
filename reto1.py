edad= int(input("ingrese la edad del paciente: "))
kilos= float(input("ingrese el peso del paciente en kg: "))
estado = ""
kgs=0
kgd=0
dd=0

while edad >= 5 and edad <= 10: 
        if kilos <= 15:
            estado = "A"
            kgs=22
            kgd = ((2*60.1)-(2*24.4)+(1*30.5))/1000
            dd = int((kgs - kilos)/kgd)+1
            print(f'El estado nutricional del paciente es {estado} y se requieren {dd} dias de dieta para que alcance un peso saludable')
        elif kilos >=29:
            estado = "B"
            kgs=24
            kgd = ((0.6*60.1)-(4*24.4)+(1*30.5))/1000
            dd = int((kgs - kilos)/kgd)+1        
            print(f'El estado nutricional del paciente es {estado} y se requieren {dd} dias de dieta para que alcance un peso saludable')
        else:
            estado = "C"
            kilos_maximo = 28
            kgd = ((0.5*60.1)-(2*24.4)+(0.7*30.5))/1000
            dd = int((kilos_maximo - kilos)/kgd)+1
            print(f'El estado nutricional del paciente es {estado} y se requieren {dd} dias de dieta para que alcance el peso maximo')
while edad >= 11 and edad <= 13:
        if kilos <= 29:
            estado = "A"
            kgs=32
            kgd = ((2*60.1)-(2*24.4)+(1*30.5))/1000
            dd = int((kgs - kilos)/kgd)+1
            print(f'El estado nutricional del paciente es {estado} y se requieren {dd} dias de dieta para que alcance un peso saludable')
        elif kilos >= 51:
            estado = "B"
            kgs=43
            kgd = ((0.6*60.1)-(4*24.4)+(1*30.5))/1000
            dd = int((kgs - kilos)/kgd)+1             
            print(f'El estado nutricional del paciente es {estado} y se requieren {dd} dias de dieta para que alcance un peso saludable')
        else:
            estado = "C"
            kilos_maximo = 50
            kgd = ((0.5*60.1)-(2*24.4)+(0.7*30.5))/1000
            dd = int((kilos_maximo - kilos)/kgd)+1
            print(f'El estado nutricional del paciente es {estado} y se requieren {dd} dias de dieta para que alcance el peso maximo')
while edad >= 14 and edad <=17:
        if kilos <= 51:
            estado = "A"
            kgs=56
            kgd = ((2*60.1)-(2*24.4)+(1*30.5))/1000
            dd = int((kgs - kilos)/kgd)+1
            print(f'El estado nutricional del paciente es {estado} y se requieren {dd} dias de dieta para que alcance un peso saludable')
        elif kilos >= 63:
            estado = "B"
            kgs=58
            kgd = ((0.6*60.1)-(4*24.4)+(1*30.5))/1000
            dd = int((kgs - kilos)/kgd)+1            
            print(f'El estado nutricional del paciente es {estado} y se requieren {dd} dias de dieta para que alcance un peso saludable')
        else:
            estado = "C"
            kilos_maximo = 63
            kgd = ((0.5*60.1)-(2*24.4)+(0.7*30.5))/1000
            dd = int((kilos_maximo - kilos)/kgd)+1
            print(f'El estado nutricional del paciente es {estado} y se requieren {dd} dias de dieta para que alcance el peso maximo')
else:
    edad < 5 and edad > 17
    print("el paciente esta fuera del rango de edad del programa de nutrición")