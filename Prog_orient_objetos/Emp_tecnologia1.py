class Usuario:
    def __init__(self, nombre, identificacion):
        self.nombre = nombre
        self.identificacion = identificacion

    def mostrarInformacion(self):
        print(f"Nombre: {self.nombre} | Identificación: {self.identificacion}")


class Empleado(Usuario):
    def __init__(self, nombre, identificacion, cargo):
        super().__init__(nombre, identificacion)
        self.cargo = cargo

    def mostrarInformacion(self):
        super().mostrarInformacion()
        print(f"  └─> Cargo: {self.cargo}")


# Relación 1: Herencia Multinivel (Desarrollador -> Empleado -> Usuario)
class Desarrollador(Empleado):
    def __init__(self, nombre, identificacion, cargo, lenguaje_programacion):
        super().__init__(nombre, identificacion, cargo)
        self.lenguaje_programacion = [lenguaje_programacion]

    def mostrarInformacion(self):
        super().mostrarInformacion()
        print(f"  └─> Lenguajes: {', '.join(self.lenguaje_programacion)}")


# Relación 1: Herencia Multinivel (Diseñador -> Empleado -> Usuario)
class Diseñador(Empleado):
    def __init__(self, nombre, identificacion, cargo, herramienta_diseño):
        super().__init__(nombre, identificacion, cargo)
        self.herramienta_diseño = [herramienta_diseño]

    def mostrarInformacion(self):
        super().mostrarInformacion()
        print(f"  └─> Herramientas: {', '.join(self.herramienta_diseño)}")


class Cliente(Usuario):
    def __init__(self, nombre, identificacion, correo):
        super().__init__(nombre, identificacion)
        self.correo = correo
        self.proyecto_asociado = None  # Relación 3: Proyecto asociado al cliente

    def asociarProyecto(self, proyecto):
        self.proyecto_asociado = proyecto
        print(f"[Cliente] {self.nombre} ha asociado el proyecto '{proyecto.nombre}' a su cuenta.")

    def mostrarInformacion(self):
        super().mostrarInformacion()
        print(f"  └─> Correo: {self.correo}")
        if self.proyecto_asociado:
            print(f"  └─> Proyecto Contratado: {self.proyecto_asociado.nombre}")


class Proyecto:
    def __init__(self, nombre, descripcion):
        self.nombre = nombre
        self.descripcion = descripcion
        self.empleados = []  # CORRECCIÓN: Inicia vacía para recibir objetos reales asignados

    def mostrarInformacion(self):
        print(f"\n================ PROYECTO: {self.nombre} ================")
        print(f"Descripción: {self.descripcion}")
        print(f"Miembros asignados ({len(self.empleados)}):")
        for emp in self.empleados:
            print(f" - {emp.nombre} ({type(emp).__name__})")
        print("=======================================================")

    # Relación 2: Asociación (El proyecto recibe e interactúa con instancias de Empleado)
    def asignarEmpleado(self, empleado):
        self.empleados.append(empleado)
        print(f"[Proyecto] Empleado {empleado.nombre} asignado al proyecto {self.nombre}")


# =====================================================================
# DEMOSTRACIÓN DEL CASO DE ESTUDIO
# =====================================================================
if __name__ == "__main__":
    print("--- 1. CREACIÓN DE INSTANCIAS ---")
    # Crear un Cliente
    cliente1 = Cliente("Tech Solutions Inc", "NIT-900123", "contacto@techsolutions.com")
    
    # Crear un Proyecto
    proyecto1 = Proyecto("App Móvil Bancaria", "Desarrollo de una app financiera nativa")
    
    # Crear un Desarrollador y un Diseñador (Mínimo 2 empleados)
    dev1 = Desarrollador("Carlos Ortega", "1020456", "Desarrollador Senior", "Python")
    dis1 = Diseñador("Ana María Silva", "1035789", "Diseñadora UX/UI", "Figma")

    print("\n--- 2. DEMOSTRACIÓN DE MÉTODOS Y RELACIONES ---")
    # Relación Proyecto <-> Empleados (Asignar los 2 empleados al proyecto)
    proyecto1.asignarEmpleado(dev1)
    proyecto1.asignarEmpleado(dis1)
    
    # Relación Cliente <-> Proyecto (Asociar el proyecto al cliente)
    cliente1.asociarProyecto(proyecto1)

    print("\n--- 3. MOSTRAR INFORMACIÓN DETALLADA ---")
    # Ejecución de los métodos mostrarInformacion de cada entidad
    print("\n--- Información del Cliente ---")
    cliente1.mostrarInformacion()

    print("\n--- Información de los Empleados ---")
    dev1.mostrarInformacion()
    dis1.mostrarInformacion()

    # Resumen estructural del proyecto y su equipo asignado
    proyecto1.mostrarInformacion()
