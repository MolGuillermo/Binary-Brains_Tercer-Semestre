# Declaramos una variable

try:
    archivo = open('prueba.txt', 'w') # W = write = escribir
    archivo.write('Programando rehabilitacion temporomandibular, ahora en txt. \n')
    archivo.write('Con esto terminamos')
except Exception as e:
    print(e)
finally: #Siempre se ejecuta
    archivo.close() #Con esto se cierra el archivo aun con error.
