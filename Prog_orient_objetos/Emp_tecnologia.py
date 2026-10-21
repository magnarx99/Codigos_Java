class Usuario:

    
    def __init__(self, nombre, identificacion):
        self.nombre = nombre
        self.identificacion = identificacion

    def mostrarInformacion(self):
        print(f"Nombre: {self.nombre}, Identificación: {self.identificacion}")


class Empleado(Usuario):
    def __init__(self, nombre, identificacion, cargo):
        super().__init__(nombre, identificacion)
        self.cargo = cargo

    def mostrarInformacion(self):
        super().mostrarInformacion()
        print(f"información del Empleado: {self.nombre}, {self.identificacion} Cargo: {self.cargo}")


class Desarrollador(Empleado):
    def __init__(self, nombre, identificacion, cargo, lenguaje_programacion):
        super().__init__(nombre, identificacion, cargo)
        self.lenguaje_programacion = [lenguaje_programacion]

    def mostrarInformacion(self):
        super().mostrarInformacion()
        print(f"Nombre: {self.nombre}, Identificación: {self.identificacion}, Cargo: {self.cargo}, Lenguaje de Programación: {', '.join(self.lenguaje_programacion)}")


class Diseñador(Empleado):
    def __init__(self, nombre, identificacion, cargo, herramienta_diseño):
        super().__init__(nombre, identificacion, cargo)
        self.herramienta_diseño = [herramienta_diseño]

    def mostrarInformacion(self):
        super().mostrarInformacion()
        print(f"Nombre: {self.nombre}, Identificación: {self.identificacion}, Cargo: {self.cargo}, Herramienta de Diseño: {', '.join(self.herramienta_diseño)}")


class Cliente(Usuario):
    def __init__(self, nombre, identificacion, correo):
        super().__init__(nombre, identificacion)
        self.correo = correo

    def mostrarInformacion(self):
        super().mostrarInformacion()
        print(f"Nombre: {self.nombre}, Identificación: {self.identificacion}, Correo: {self.correo}")


class Proyecto:
    def __init__(self, nombre, descripcion):
        self.nombre = nombre
        self.descripcion = descripcion
        self.empleados = [Desarrollador, Diseñador]  # Lista de empleados asignados al proyecto

    def mostrarInformacion(self):
        print(f"Nombre del Proyecto: {self.nombre}, Descripción: {self.descripcion}")

    def asignarEmpleado(self, empleado):
        print(f"Empleado {empleado.nombre} asignado al proyecto {self.nombre}")

ev1 = Desarrollador("Carlos Ortega", "1020456", "Desarrollador Senior", "Python")
dis1 = Diseñador("Ana María Silva", "1035789", "Diseñadora UX/UI", "Figma")





