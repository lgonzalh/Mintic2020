import numpy as np
import random


texto = 'Today is Caturday!'

def encriptado(texto):
    
    clave = []
    list_unicode = []
    desordenada = []
    n = pow(len(texto),0.5)
    if (n // 1) != n : n = int((n // 1)) + 1  
    for i in range(len(texto), n*n): texto += "_" 
    for letra in texto: list_unicode.append(ord(letra))
    for i in texto: list_unicode.append(ord(i)) 
    for i in range(len(list_unicode)): clave.append(i) 
    random.shuffle(clave) 
    for i in clave: desordenada.append(list_unicode[i]) 
    array_final = np.array(desordenada).reshape(n,-1) 
    
    return array_final, clave

resultado = encriptado(texto)
print(resultado) 

def desencriptado(array_final, clave):
       
    lista_matriz = array_final.flatten().tolist() 
    list_unicode_ordenada = []
    lista_ordenada = []
    for i in range(len(lista_matriz)): 
        posicion = clave.index(i) 
        list_unicode_ordenada.append(lista_matriz[posicion]) 
 
    for code in list_unicode_ordenada: 
        lista_ordenada.append(chr(code)) 
    texto = ''.join(lista_ordenada) 
    texto = texto.replace('_','') 
   
    return texto

resulta = desencriptado(resultado[0], resultado[1])
print(resulta)