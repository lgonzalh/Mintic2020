def es_semestre_valido(p, s):
    if s >= 1 and s <= len(p):
        contenido_semestre = p[s-1]
        return True
    else:
        return False

def es_semestre_vacio(p, s):
    validacion = None
    
    if p[s-1] != {}:
        validacion = False
    else:
        validacion = True
        
    return validacion

def es_materia_valida(p, s, m):
    contenido_semestre = p[s - 1]
    if m not in contenido_semestre:
        return False
    else:
        return True

def modificar_materia(pensum, semestre, materia, nombre, creditos):
    contenido_semestre = {}
    while True:
        if s > 1 or s < len(p):
            contenido_semestre = p[s - 1]
        else:
            mensaje = 'Ingrese una semestre válido'
            break

        if len(contenido_semestre) == 1: 
            mensaje = 'El semestre no tiene materias'
            
        if materia not in contenido_semestre:
            mensaje = 'La materia no existe'
            break

        contenido_semestre[materia]['nombre'] = nombre
        contenido_semestre[materia]['créditos'] = creditos

        mensaje = 'Modificada con éxito'
        break

def eliminar_materia(pensum, semestre, materia):
    contenido_semestre = {}
    if es_semestre_valido(p, s) or es_semestre_vacio(p, s) != True or es_materia_valida(p, s, m):
       contenido_semestre = pensum[semestre - 1]
    del(contenido_semestre[materia])
