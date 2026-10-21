class Empleados:
    def __init__(self, nombre, identificacion):
        self.nombre = nombre
        self.identificacion = identificacion

    def mostrarInformacion(self):
        print(f"Nombre: {self.nombre}, Identificación: {self.identificacion}")


class Programador(Empleados):
    def __init__(self, nombre, identificacion, lenguaje_programacion):
        super().__init__(nombre, identificacion)
        self.lenguaje_programacion = lenguaje_programacion


    def programar(self):
        print(f"{self.nombre} está programando en {self.lenguaje_programacion}")


class Diseñador(Empleados):
    def __init__(self, nombre, identificacion, herramienta_diseño):
        super().__init__(nombre, identificacion)
        self.herramienta_diseño = herramienta_diseño

    def diseñar(self):
        print(f"{self.nombre} está diseñando con {self.herramienta_diseño}")


        empleado = Empleados("Andrés Davila", "123456789")
        empleado.mostrarInformacion()

        programador = Programador("Ana García", "987654321", "Python")
        programador.programar()

        diseñador = Diseñador("Luis Martínez", "43211234", "Adobe Photoshop")
        diseñador.diseñar()
