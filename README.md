# AsistenciaHuntCode

@NICOLE PEÑALBE

class Persona2:
    def __init__(self, nombre, apellido, edad):
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad

    def mostrar_detalles(self):
        print(f'los datos mostrados son los siguientes: {self._nombre} {self.apellido} {self.edad}')
