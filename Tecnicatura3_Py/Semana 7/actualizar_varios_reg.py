import psycopg2

conexion = psycopg2.connect(
    user = 'postgres',
    password = '1004',
    host = '127.0.0.1',
    port = '5432',
    database = 'test_bd'
)
print(conexion)

try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
            valores = (
                        ('Juan', 'Perez', 'rperez@mail.com',4),
                        ('Romina', 'Ayala', 'rayala@mail.com', 5)
                    )#tupla de tuplas
            cursor.executemany(sentencia, valores) #ejecucion de la sentencia
            registros_actualizados = cursor.rowcount
            print(f'Los registros actualizados son: {registros_actualizados}')

except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    conexion.close()