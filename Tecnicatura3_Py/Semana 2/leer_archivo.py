# Clase 2 de laboratorio 3 10/04/2023 archivo2
#-Video 4 -- 1.3 Lectura de archivos
#agregamos el atributo 'r' a open() que sirve para leer un archivo
# Video 5
#agregamos el atributo 'a' a open() que sirve para anexar texto en un archivo
#agregamos el atributo 'x' a open() que sirve para
#Video 6
# parametro a .read(15) nos dice la cantidad de caracteres que va leer
#.readline() para leer una linea de texto
#Video 7
# 'prueba.txt' si no esta en la misma carpeta hay que poner toda la ruta desde c:\\
# doble diagonal para que no hay conflicto si es necesario
#------------------------------------------------------------------------------------
# open('prueba.txt','r', encoding='utf8')
#       |-- -'r'-->> significa read es decir leer. modo lectura
#       |-- -'a'-->> significa append es decir anexar. se puede escribir agregando a lo existente.
#       |-- -'x'-->> significa crear. crea un archivo
# archivo.read()
#   |--.read()-->>para leer el archivo.
archivo = open('prueba.txt', 'r', encoding='utf8')
# print(archivo.read())
# print(archivo.read(15))
# print(archivo.read(5))
# print(archivo.readline())
# print(archivo.readline())

#Video 8
#vamos a iterar el archivo, cada una de las lineas
#for linea in archivo:
    #print(linea) # iteramos todos los elementos del archivo
#print(archivo.readlines()[11])#accedemos al archivo como si fuera una lista

#video 9
#Anexamos informacion, copiamos a otro
archivo2 = open('copia.txt','w',encoding='utf8')
archivo2.write(archivo.read())
archivo.close()
archivo2.close()

print('Se ha terminado el proceso de leer y copiar archivos')