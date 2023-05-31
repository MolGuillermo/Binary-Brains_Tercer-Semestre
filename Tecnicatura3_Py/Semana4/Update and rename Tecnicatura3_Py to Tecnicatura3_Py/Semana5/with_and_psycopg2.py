import psycopg2

conexion = psycopg2.connect(
    user='postgres',
    password='password',
    host='localhost',
    port='5432',
    database='utn'
)
print(conexion)

try:
    with conexion:
        with conexion.cursor() as cursor:
        sentencia = 'SELECT * FROM personas'
        cursor.execute(sentencia)
        todos_los_registros = cursor.fetchall()
        print(todos_los_registros)
except Exception as ex :
    print(f'Ocurrio un error {ex}')
finally:
    conexion.close()
