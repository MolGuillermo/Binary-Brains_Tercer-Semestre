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
    with conexion:
        with conexion.cursor() as cursor:
            sentenciaInsert = "INSERT INTO PERSONAS (nombre, apellido, email) VALUES (%s, %s, %s)"
            valoresInsert = ("Alex", "rojas", "alex@mail.com")

            sentenciaUpdate = "UPDATE personas SET nombre=%s, apellido=%s, email=%s WHERE id_personas=%s"
            valoresUpdate = ("Alexis", "rojas", "alex@mail.com", 25)

            cursor.execute(sentenciaUpdate, valoresUpdate)
            print("Actualizado el registro")

except Exception as ex:
    print(f'Ocurrio un error {ex}')
finally:
    conexion.close()
