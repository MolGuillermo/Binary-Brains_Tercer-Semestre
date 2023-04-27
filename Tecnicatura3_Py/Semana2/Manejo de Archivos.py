# Declaramos una variable
try: # para que no arroje una excepción lo ponemos dentro del bloque try
    # especificar el juego de caracteres agregamos despues de w encoding = 'utf8'
    # no es necesario especificar la ruta en este caso xq esta en la misma carpeta
    # para especificar ponemos c:\\ (las 2 \ se interpretan como una sola,
    # ya que sino lo toma como cararter especial
    archivo = open('C:\\Users\\Usuario\\TecnicaturaGitTamy\\Python\PythonIII\\Excepciones\\Archivos\\Leccion2\\'
                   'prueba.txt', 'w', encoding='utf8')  # La w es de write, escribir
    # vamos a agregar información al archivo
    archivo.write('Programamos con diferentes tipos de archivos, ahora en txt.\n')
    archivo.write('Los acentos son importantes para las palabras\n')
    archivo.write('como por ejemplo: acción, ejecución y producción\n')
    archivo.write('las letras son:\n r read leer, \n a append anexa, \n w write escribe, \n x crea un archivo,\n ')
    archivo.write('t esta es para texto o text, \n b archivos binarios, \n w+ escribe y leer son iguales r+ leer y escribir\n')
    archivo.write('Saludos a Todos los alumnos de la Tecnicatura\n')
    archivo.write('Con esto terminamos')
except Exception as e:
    print(e)
finally:  # siempre se ejecuta
    archivo.close()  # con esto se debe cerrar el archivo aun con error
