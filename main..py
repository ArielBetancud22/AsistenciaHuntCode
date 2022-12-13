''' Bergerat Santiago '''

class Persona2:
    def __init__(self,nombre,apellido,edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f'Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad} ')

    @property # decorador
    def nombre(self): # Método getter
        print('Estamos utilizando  el método get')
        return self._nombre




    ''' Boto Franco''
    @nombre.setter
    def nombre(self,nombre): # Método setter
        print('Estamos utilizando el método set')
        self._nombre = nombre

    @property
    def apellido(self):
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):
        self._Apellido =  apellido

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        return self._edad



    '''Lopez Lucas'''
persona1 = Persona2('Ariel', 'Bentacud', 41)
print(persona1.nombre) #Llamamos al método getter
persona1.nombre = 'Juan Pedro' #Llamamos el método setter
print(persona1.nombre) #Otra vez con el método getter
print(persona1.mostrar_detalles()) #llamamos el mostrar detalles
# Atributo read-only (sólo lectura) seria la edad porque  no tiene el método set
print(persona1.edad)

# Tarea crear tres objetos más, utilizando los métodos getter and setter
#para modificar, y mostrar los cambios con el método mostrar_detalles

#objeto numero1
persona2 = Persona2('Mary','Perez', 27)
persona2.nombre = 'Mariana'
persona2.apellido = 'Perez'
persona2.edad = 22
print(persona2.mostrar_detalles())
print(persona2.apellido)
print(persona2.edad)
print(persona2.mostrar_detalles())

#Objeto numero2
persona3 = Persona2('Ro', 'Suarez', 29)
persona3.nombre = 'Rocio'
persona3.apellido = 'Suarez'
persona3.edad = 35
print(persona3.nombre)
print(persona3.apellido)
print(persona3.edad)
print(persona3.mostrar_detalles())

#Objeto numero3
persona4 = Persona2('Lu', 'Mendo', 45)
persona4.nombre = 'Luciana'
persona4.apellido = 'Mendoza'
persona4.edad = 24
print(persona4.nombre)
print(persona4.apellido)
print(persona4.edad)
print(persona4.mostrar_detalles())

print(__name__)

'''Medina Mayra'''
from os import name

from Persona2 import Persona2
print('Creacion de objetos'.center(50, '-'))
if __name__ == '__main__':
    persona5 = Persona2('Lionel', 'Messi', 35)
    persona5.mostrar_detalles()

    print(__name__)

print('ELiminacion de Objetos'.center(30, '-'))
del persona5

'''Mondon Ricardo'''

from mundo_pc.dispositivo_entrada import DispositivoEntrada


class Raton(DispositivoEntrada):
    contador_ratones = 0

    def int(self, marca, tipo_entrada):
        Raton.contador_ratones += 1
        self._id_raton = Raton.contador_ratones
        super().int(marca, tipo_entrada)

    def str(self):
        return f'iD: {self._id_raton}, Marca: {self._marca}, Tipo Entrada: {self._tipo_entrada}'


# hacemos pruebas
if name == 'main':
    raton1 = Raton('HP', 'USB')
    print(raton1)
    raton2 = Raton('Acer', 'Bluethooth')
    print(raton2)



'''Peñalbe Nicol'''
class Monitor:
    contador_monitores = 0

    def int(self, marca, tamaño):
        Monitor.contador_monitores += 1
        self._id_monitor = Monitor.contador_monitores
        self._marca = marca
        self._tamaño = tamaño

    def str(self):
        return f'Id: {self._id_monitor}, Marca: {self._marca}, Tamaño:{self._tamaño}'


if name == 'main':
    monitor1 = Monitor('HP', '15 pulgadas')
    print(monitor1)
    monitor2 = Monitor('Acer', '27 pulgadas')
    print(monitor2)


    '''Ramirez Andres'''
    from mundo_pc.Orden import Orden
    from mundo_pc.computadora import Computadora
    from mundo_pc.monitor import Monitor
    from mundo_pc.raton import Raton
    from mundo_pc.teclado import Teclado

    teclado1 = Teclado('HP', 'USB')
    monitor1 = Monitor('HP', '15 pulgadas')
    raton1 = Raton('HP', 'USB')
    computadora1 = Computadora('HP', 'teclado1', 'monitor1', 'raton1')

    teclado2 = Teclado('Gamer', 'Bluethooth')
    monitor1 = Monitor('Acer', '27 pulgadas')
    raton1 = Raton('Acer', 'Bluethooth')
    computadora2 = Computadora('Acer', 'teclado2', 'monitor2', 'raton2')

    computadoras1 = [computadora1, computadora2]
    orden1 = Orden(computadoras1)
    print(orden1)

    '''Viñas Juan'''
    from Empleado import Empleado
    from Gerente import Gerente


    def imprimir_detalles(objeto):
        print(type(objeto))
        print(objeto.mostrar_detalles())
        print(objeto.departamento)
        if isinstance(objeto, Gerente):
            print(objeto.departamento)


    empleado = Empleado('Ariel', 50000)
    imprimir_detalles(empleado)

    gerente = Gerente('Natalia', 60000, 'Sistemas')
    imprimir_detalles(gerente)
    
    
    '''Suarez Daiana'''

    from Empleado import Empleado
    from Gerente import Gerente


    def imprimir_detalles(objeto):
        print(type(objeto))
        print(objeto.mostrar_detalles())
        print(objeto.departamento)
        if isinstance(objeto, Gerente):
            print(objeto.departamento)


    empleado = Empleado('Ariel', 50000)
    imprimir_detalles(empleado)

    gerente = Gerente('Natalia', 60000, 'Sistemas')
    imprimir_detalles(gerente)
    


