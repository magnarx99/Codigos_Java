# Clase base para todos los actores que interactúan con la plataforma
class usuario:
    
    def __init__(self, nombre, identificacion):
        self.nombre = nombre
        self.identificacion = identificacion

    def iniciar_sesion(self):
        print(f"[Usuario] {self.nombre} ha iniciado sesión.")


# Clase que representa a los clientes, que heredan de la clase usuario y realizan pedidos
class Cliente(usuario):
    
    def __init__(self, nombre, identificacion, direccion):
        super().__init__(nombre, identificacion)
        self.direccion = direccion

    def mostrar_info(self):
        print(f"Cliente: {self.nombre}, Identificación: {self.identificacion}, Dirección: {self.direccion}")


# Clase que controla el stock de forma atómica para evitar pedidos sin existencias
class Inventario:
    
    def __init__(self):
        # Inventario inicial simulado en la plataforma
        self.productos = {"Laptop": 3, "Mouse": 5}

    def verificar_y_reservar(self, producto, cantidad):
        if self.productos.get(producto, 0) >= cantidad:
            self.productos[producto] -= cantidad
            print(f"[Inventario] OK: Reservadas {cantidad} unidades de '{producto}'. Stock restante: {self.productos[producto]}")
            return True
        print(f"[Inventario] RECHAZADO: Stock insuficiente para '{producto}'. Disponibles: {self.productos.get(producto, 0)}")
        return False

    def liberar_reserva(self, producto, cantidad):
        self.productos[producto] += cantidad
        print(f"[Inventario] RESTAURADO: Se liberaron {cantidad} unidades de '{producto}'. Nuevo stock: {self.productos[producto]}")


# Clase base para los diferentes medios de pago del sistema

class MedioPago:
    
    def __init__(self, nombre_metodo):
        self.nombre_metodo = nombre_metodo

    def procesar_pago(self, monto):
        print(f"[Pago] Procesando cobro de ${monto} con {self.nombre_metodo}...")
        return True


# Clase derivada de MedioPago para tarjetas de crédito, que hereda de la clase MedioPago

class TarjetaCredito(MedioPago):
    
    def __init__(self, nombre_metodo, nro_tarjeta, simular_exito=True):
        super().__init__(nombre_metodo)
        self.nro_tarjeta = nro_tarjeta
        self.simular_exito = simular_exito  # Permite forzar fallos en las pruebas

    def procesar_pago(self, monto):
        super().procesar_pago(monto)
        if not self.simular_exito:
            print(f"[Pago Tarjeta] ERROR: Fondos insuficientes en tarjeta ****{self.nro_tarjeta[-4:]}.")
            return False
        print(f"[Pago Tarjeta] ÉXITO: Cobro aprobado en tarjeta ****{self.nro_tarjeta[-4:]}.")
        return True


# Clase base para las modalidades de entrega del sistema

class ModalidadEntrega:
    
    def __init__(self, tipo_entrega):
        self.tipo_entrega = tipo_entrega

    def programar_despacho(self, direccion):
        print(f"[Despacho] Iniciando logística para modalidad: {self.tipo_entrega}")


# Clase derivada de ModalidadEntrega para envíos express en motocicleta, que hereda de ModalidadEntrega

class EnvioExpress(ModalidadEntrega):
    
    def __init__(self, tipo_entrega, zona_cobertura):
        super().__init__(tipo_entrega)
        self.zona_cobertura = zona_cobertura

    def programar_despacho(self, direccion):
        super().programar_despacho(direccion)
        print(f"[Envío Express] ¡ALERTA MOTORIZADO! Asignada entrega prioritaria en {self.zona_cobertura}.")
        print(f"[Envío Express] Ruta trazada hacia: {direccion}")
        return f"GUIA-EXPRESS-MOTO"


# Clase que representa el historial y línea de tiempo de un despacho

class SistemaRastreo:
    
    def __init__(self, codigo_guia):
        self.codigo_guia = codigo_guia
        self.eventos = []

    def registrar_evento(self, descripcion):
        self.eventos.append(descripcion)
        print(f"[Rastreo] Nuevo evento registrado: {descripcion}")

    def mostrar_historial(self):
        print(f"\n--- HISTORIAL DE RASTREO (Guía: {self.codigo_guia}) ---")
        for evento in self.eventos:
            print(f" > {evento}")


# Esta clase tiene una composición con el inventario y una asociación con los usuarios y pedidos
class SistemaEcommerce:
    
    def __init__(self):
        self.inventario = Inventario()
        self.usuarios = []

    def agregar_usuario(self, usuario):
        self.usuarios.append(usuario)
        print(f"[Sistema E-commerce] Usuario '{usuario.nombre}' registrado en la plataforma.")

    def procesar_compra(self, cliente, producto, cantidad, total, medio_pago, modalidad_entrega):
        print(f"[Sistema] PROCESANDO PEDIDO DE: {cliente.nombre}")
        

        # PASO 1: Controlar existencias de inmediato para evitar pedidos fantasma
        
        if not self.inventario.verificar_y_reservar(producto, cantidad):
            print(f"[Sistema] PEDIDO RECHAZADO: Compra cancelada por falta de stock.")
            return

        # PASO 2: Procesar el dinero
        
        pago_exitoso = medio_pago.procesar_pago(total)

        # PASO 3: Tomar decisiones operativas según el resultado del pago
        
        if pago_exitoso:
            print("[Sistema] Pago confirmado. Preparando paquete...")
            
            # PASO 4: Despachar usando la estrategia seleccionada
            
            codigo_guia = modalidad_entrega.programar_despacho(cliente.direccion)
            
            # PASO 5: Inicializar el rastreo del paquete
            
            rastreo = SistemaRastreo(codigo_guia)
            rastreo.registrar_evento("El paquete salió de la bodega central.")
            rastreo.mostrar_historial()
        
        else:
            
            # Si el pago falla, el inventario se auto-recupera de inmediato
            
            print("[Sistema] PEDIDO RECHAZADO: El pago falló.")
            self.inventario.liberar_reserva(producto, cantidad)


if __name__ == "__main__":
    
    # Creamos la plataforma central
    
    plataforma = SistemaEcommerce()

    # Registramos un cliente en el sistema
    
    cliente1 = Cliente("Carlos Pérez", "ID-9988", "Av. Santander #12-34")
    plataforma.agregar_usuario(cliente1)

    # CASO 1: Compra exitosa utilizando envío Express
    
    pago_valido = TarjetaCredito("Tarjeta Visa", "4555-1234-5678-9999", simular_exito=True)
    entrega_rapida = EnvioExpress("Entrega en Moto", "Zona Norte")

    plataforma.procesar_compra(
        cliente=cliente1,
        producto="Laptop",
        cantidad=1,
        total=1200.00,
        medio_pago=pago_valido,
        modalidad_entrega=entrega_rapida
    )

    # CASO 2: Compra fallida por pago rechazado (El inventario se protege y se devuelve)
    
    pago_invalido = TarjetaCredito("Tarjeta Master", "5412-0000-1111-2222", simular_exito=False)
    
    plataforma.procesar_compra(
        cliente=cliente1,
        producto="Laptop",
        cantidad=1,
        total=1200.00,
        medio_pago=pago_invalido,
        modalidad_entrega=entrega_rapida
    )
