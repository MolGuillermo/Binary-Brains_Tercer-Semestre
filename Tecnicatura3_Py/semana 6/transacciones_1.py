import psycopg2 as bd

conexion = bd.connect(
    user='postgres',
    password='mysecretpassword',
    host='localhost',
    port='5432',
    database='utn'
)
print(conexion)

try:
    # conexion.autocommit = False # Evitamos el guardado de informacion de manera automatica. MALA PRACTICA
    cursor = conexion.cursor()
    sentencia = "INSERT INTO PERSONAS (nombre, apellido, email) VALUES (%s, %s, %s)"
    valores = ("Maria", "Esparza", "mariaesparza@gmail.com")
    cursor.execute(sentencia, valores)
    print('Termina la transaccion.')
    conexion.commit()

except Exception as ex:
    conexion.rollback()
    print(f'Ocurrio un error {ex}')
finally:
    conexion.close()
