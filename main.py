# @NICOLE PEÑALBE

class Persona2:
    def init(self, nombre, apellido, edad):  self.nombre = nombre, self.apellido = apellido, self.edad = edad


def mostrar_detalles(self):
    print(f'los datos mostrados son los siguientes: {self._nombre} {self.apellido} {self.edad}')


@property  # decorado
def nombre(self):  # Metodo getter
    return self._nombre


@nombre.setter  # metodo setter
def nombre(self, nombre):  # Setter
    print('estamos utilizando el metodo');


"""
    @ANDRÉS RAMÍREZ
"""


class Persona2:
    def init(self, nombre, apellido, edad): self.nombre = nombre, self.apellido = apellido, self.edad = edad

    def mostrar_detalles(self):
        print(f'los datos mostrados son los siguientes: {self._nombre} {self.apellido} {self.edad}')


@property  # decorado
def nombre(self):  # Metodo getter
    return self._nombre;


@nombre.setter  # metodo setter
def nombre(self, nombre):  # Setter
    print('estamos utilizando el metodo');


def nombre(self, nombre):  # Setter
    print('estamos utilizando el metodo setter');
    self._nombre = nombre


"""
@RICARDO MONDÓN
"""
persona1 = Persona2('Ariel', 'Bentacud', '41');
print(persona1.nombre)  # Llamamos al metodo getter
persona1.nombre = 'Juan Pedro';
print(persona1.nombre);
print(persona1.mostrar_detalles());  # metodo setter print(persona1.edad)

persona2 = Persona2('Tomas', 'Gonzales', '43');
print(persona2.nombre);
print(persona2.apellido);
print(persona2.edad);
print(persona2.mostrar_detalles());

"""
@SANTIAGO BERGERAT
"""
persona3 = Persona2('Santiago', 'Gomez', '23');
print(persona3.nombre);
print(persona3.apellido);
print(persona3.edad);
print(persona3.mostrar_detalles());

persona4 = Persona2('Alberto', 'Gutierres', '67');
print(persona4.nombre);
print(persona4.apellido);
print(persona4.edad);
print(persona4.mostrar_detalles());


class Persona:  # Creamos una clase def init(self, nombre, apellido, edad, *args, **kwargs ): #Se llama metodo init dunder self.nombre = nombre
    """
@FRANCO BOTTO
"""



def nombre(self, nombre):  # Setter
    print('estamos utilizando el metodo setter');
    self._nombre = nombre

def mostrar_detalle(self):
    print(
        f'La clase Persona tiene los siguientes datos:{self.nombre} {self.apellido} {self.edad}, la direccion es. {self.args}, los datos importantes son {self.kwargs}')


"""
@VIÑAS JUAN
"""
persona1 = Persona('Ariel', 'Bentacud', 40);
print(persona1.nombre);
print(persona1.apellido);
print(persona1.edad);
persona2 = Persona('Rocio', 'Peñalbe', 19);
print(f"El objeto2 de la clase persona es: {persona2.nombre}, {persona2.apellido} Su edad es: {persona2.edad}");

persona1 = Persona('Nicole', 'Peñalbe', 20);
print(f"El objeto1 de la clase persona es: {persona1.nombre}, {persona1.apellido} Su edad es: {persona1.edad}");
"""
@LUCAS LÓPEZ
"""
persona1.nombre = 'Liliana';
persona1.apellido = 'Sanchez';
persona1.edad = 14;
print(f'el objeto1 modificado de la clase persona es: {persona1.nombre}');
"""
@MAYRA MEDINA
"""
persona1.nombre = 'Liliana';
persona1.apellido = 'Sanchez';
persona1.edad = 14;
print(
    f'el objeto1 modificado de la clase persona es: {persona1.nombre}, {persona1.apellido} Su edad es: {persona1.edad}');

# Los atributos son caracteristicas: #Para nuestros objetos #Los metodos son los comportamientos que va a tener un objeto

persona1.mostrar_detalle(
    persona1)  # La referencia a este caso se paza de manera automatica persona2.mostrar_detalle(persona2)

persona1.telefono = '2345257767';
print('este es el telofono de: {persona1.telefono} ')  # Hemos creado un atributo de un objeto
print(persona3)
