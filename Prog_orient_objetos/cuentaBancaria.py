class CuentaBancaria:

  def __init__(self, numeroCuenta, nombreTitular, saldoDisponible):
    self.numeroCuenta = numeroCuenta
    self.nombreTitular = nombreTitular
    self.saldoDisponible = saldoDisponible

    def depositar (self, monto):
        self.saldoDisponible += monto
    def retirar (self, monto):
        self.saldoDisponible -= monto
        if self.saldoDisponible <= 0:
          return True
        else:
          return False

    def mostrarSaldo (self, saldoDisponible):
        return self.saldoDisponible

    CuentaBancaria = CuentaBancaria("123456789", "Andrés Davila", 1000)
   
    print("Cuenta Bancaria: ", CuentaBancaria.numeroCuenta)
    print("Nombre del Titular: ", CuentaBancaria.nombreTitular)
    print("Saldo Disponible: ", CuentaBancaria.saldoDisponible)