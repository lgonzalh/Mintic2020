def solucion(edad,peso):
    estado = ""
    kgs=0
    kgd=0
    dd=0
    edad=int(input("Indicar la edad del paciente: "))
    peso=float(input("Indicar el peso del paciente en kilogramos: "))

    if edad >=5 and edad <=10: 
        if peso <16 and peso <28:
            estado ="A"
            kgs=22
            kgd =((2*60.1)-(2*24.4)+(1*30.5))/1000
            dd = int((kgs - peso)/kgd)+1
            print(f'El estado nutricional del paciente es {estado} y se requieren {dd} dias de dieta para que alcance un peso saludable')
            exit()
        elif peso >=28 and peso <50:
            estado ="B"
            kgs=24
            kgd =((0.6*60.1)-(4*24.4)+(1*30.5))/1000
            dd = int((kgs - peso)/kgd)+1    
            print(f'El estado nutricional del paciente es {estado} y se requieren {dd} dias de dieta para que alcance un peso saludable')
            exit()
        else:
            estado = "C"
            kmax = 28
            kgd = ((0.5*60.1)-(2*24.4)+(0.7*30.5))/1000
            dd = int((kmax - peso)/kgd)+1
            print(f'El estado nutricional del paciente es {estado} y se requieren {dd} dias de dieta para que alcance el peso maximo')
            exit()
    
    if edad >=11 and edad <=13:
        if peso <30 and peso <50:
            estado = "A"
            kgs=32
            kgd = ((2*60.1)-(2*24.4)+(1*30.5))/1000
            dd = int((kgs - peso)/kgd)+1
            print(f'El estado nutricional del paciente es {estado} y se requieren {dd} dias de dieta para que alcance un peso saludable')
            exit()
        elif peso >=50 and peso <63:
            estado = "B"
            kgs=43
            kgd = ((0.6*60.1)-(4*24.4)+(1*30.5))/1000
            dd = int((kgs - peso)/kgd)+1
            print(f'El estado nutricional del paciente es {estado} y se requieren {dd} dias de dieta para que alcance un peso saludable')
            exit()

        else:
            estado = "C"
            kmax = 50
            kgd = ((0.5*60.1)-(2*24.4)+(0.7*30.5))/1000
            dd = int((kmax - peso)/kgd)+1
            print(f'El estado nutricional del paciente es {estado} y se requieren {dd} dias de dieta para que alcance el peso maximo')
            exit()

    if edad >13 and edad <=17:
        if peso <=51:
            estado = "A"
            kgs=56
            kgd = ((2*60.1)-(2*24.4)+(1*30.5))/1000
            dd = int((kgs - peso)/kgd)+1
            print(f'El estado nutricional del paciente es {estado} y se requieren {dd} dias de dieta para que alcance un peso saludable')
            exit()
        elif peso >=63:
            estado = "B"
            kgs=58
            kgd = ((0.6*60.1)-(4*24.4)+(1*30.5))/1000
            dd = int((kgs - peso)/kgd)+1        
            print(f'El estado nutricional del paciente es {estado} y se requieren {dd} dias de dieta para que alcance un peso saludable')
            exit()
        else:
            estado = "C"
            kmax = 63
            kgd = ((0.5*60.1)-(2*24.4)+(0.7*30.5))/1000
            dd = int((kmax - peso)/kgd)+1
            print(f'El estado nutricional del paciente es {estado} y se requieren {dd} dias de dieta para que alcance el peso maximo')
            exit()
    else:
        edad <5 and edad>17
        print("Paciente fuera del rango de edad del programa de nutrición")
        exit()