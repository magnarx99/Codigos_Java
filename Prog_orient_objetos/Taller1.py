# Clase base que engloban todas las sub clases que del caso para usuarios sistema de salud

class usuario:
    
    def __init__(self, nombre, identificacion):
        self.nombre = nombre
        self.identificacion = identificacion

    def iniciar_sesion(self):
        print(f"[Usuario] {self.nombre} ha iniciado sesión.")

# Clase derivada de usuario para profesionales de la salud 
# incluye médicos y enfermeros, que heredan de la clase usuario

class ProfesionalesSalud(usuario):
    
    def __init__(self, nombre, identificacion, especialidad):
        super().__init__(nombre, identificacion)
        self.especialidad = especialidad

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Nombre: {self.nombre}, Identificación: {self.identificacion}, Especialidad: {self.especialidad}")

# Clase derivada que deriva de ProfesionalesSalud para médicos, que heredan de la clase ProfesionalesSalud

class Medico(ProfesionalesSalud):
    
    def __init__(self, nombre, identificacion, especialidad, profesion):
        super().__init__(nombre, identificacion, especialidad)
        self.profesion = profesion

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Nombre: {self.nombre}, Identificación: {self.identificacion}, Especialidad: {self.especialidad}, Profesión: {self.profesion}")
    
    def asociar_historial(self, historial):
        self.historial_clinico = historial
        print(f"[Médico] {self.nombre} ha asociado el historial clínico '{historial.nombre}' a su registro.")
    
    def crear_prescripcion(self, paciente, medicamento):
        self.prescripcion = prescripciones(f"Prescripción de {paciente.nombre}", f"Prescripción para {paciente.nombre} con el medicamento {medicamento.nombre}")
        print(f"[Médico] {self.nombre} ha creado una prescripción para el paciente '{paciente.nombre}' con el medicamento '{medicamento.nombre}'.")

# Clase que representa el historial clínico de un paciente, que hereda de la clase usuario y que solo puede generar el medico

class historial_clinico:
    
    def __init__(self, nombre, descripcion, informacion):
        self.nombre = nombre
        self.descripcion = descripcion
        self.informacion = informacion

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Edad: {self.edad}")
        if self.historial_clinico:
            print(f"Historial Clínico Asociado: {self.historial_clinico.nombre}")

    def atender_paciente(self, paciente):
        print(f"[Historial Clínico] Atendiendo al paciente '{paciente.nombre}' con identificación '{paciente.identificacion}'.")

# Clase derivada que deriva de ProfesionalesSalud para enfermeros, que heredan atributos de la clase ProfesionalesSalud

class Enfermero(ProfesionalesSalud):
    
    def __init__(self, nombre, identificacion, especialidad, profesion):
        super().__init__(nombre, identificacion, especialidad)
        self.profesion = profesion

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Profesión: {self.profesion}")

    def atender_paciente(self, paciente):
        print(f"[Enfermero] {self.nombre} está atendiendo al paciente '{paciente.nombre}' con identificación '{paciente.identificacion}'.")

# Clase que representa las prescripciones médicas, que hereda de la clase usuario y que solo puede generar el medico
class prescripciones:
    
    def __init__(self, nombre, descripcion):
        self.nombre = nombre
        self.descripcion = descripcion
    
    def mostrar_info(self):
        print(f"Nombre: {self.nombre}, Descripción: {self.descripcion}")
 # Clase que respresenta los medicamentos, que hereda de la clase prescripciones y que solo puede generar el medico

class Medicamento:
    
    def __init__(self, nombre, descripcion, medicamento):
        self.nombre = nombre
        self.descripcion = descripcion
        self.medicamento = medicamento

    def mostrar_info(self):
        print(f"Nombre: {self.nombre}, Descripción: {self.descripcion}, Medicamento: {self.medicamento}")

# Clase que representa a los pacientes, que heredan de la clase usuario y tiene una dependencia con la clase sistema y una asociación con el historial clinico
class paciente(usuario):
    
    def __init__(self, nombre, identificacion, edad):
        super().__init__(nombre, identificacion)
        self.edad = edad
        self.historial_clinico = None  # Relación 3: Historial clínico asociado al paciente

    def agendar_cita(self, fecha, hora):
        self.cita = self.citas_medicas(f"Cita de {self.nombre}", f"Cita para {self.nombre} el {fecha} a las {hora}")
        print(f"[Paciente] {self.nombre} ha agendado una cita para el {fecha} a las {hora}.")

# Esta clase tiene una composicion con el sistema debido a que depende fuertemente de esta para obtener una cita

class citas_medicas:
    
    def __init__(self, nombre, descripcion):
            super().__init__(nombre, descripcion)

    def agendar_cita(self, fecha, hora):
            self.fecha = fecha
            self.hora = hora
            print(f"[Cita Médica] Cita agendada para el {self.fecha} a las {self.hora}.")

    def cancelar_cita(self):
            print(f"[Cita Médica] Cita cancelada para el {self.fecha} a las {self.hora}.")

# Esta sub clase contiene una composición debido a que depende de los usuarios que van a ser pacientes 

class SistemaSalud:
    
    def __init__(self):
        self.usuarios = []

    def agregar_usuario(self, usuario):
        self.usuarios.append(usuario)
        print(f"[Sistema de Salud] Usuario '{usuario.nombre}' agregado al sistema.")

    def mostrar_usuarios(self):
        print("[Sistema de Salud] Lista de usuarios:")
        for usuario in self.usuarios:
            usuario.mostrar_info()

    def agendar_cita(self, paciente, fecha, hora):
        super().agendar_cita(paciente, fecha, hora)

