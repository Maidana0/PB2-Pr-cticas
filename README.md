# Ejercicios Prácticos de Programación Básica II
Estos ejercicios están enfocados en **reforzar conceptos fundamentales de Java** y **practicar el uso de pruebas unitarias con JUnit**.


## JUnit

### Sala de Cine
Implementa la clase `SalaDeCine` con las siguientes operaciones:

1. **Crear Sala:** Crea la sala con la cantidad de butacas totales y cantidad de filas.
2. **Consultar si la sala está vacía:** Verifica si todas las butacas están desocupadas.
3. **Consultar si una butaca está ocupada:** Determina si una butaca específica (referida por fila y asiento) está ocupada.
4. **Ocupar una butaca:** Ocupar una butaca determinada, siempre que esta no esté previamente ocupada.
5. **Consultar la cantidad total de butacas ocupadas:** Devuelve el número de butacas actualmente ocupadas en la sala.
6. **Consultar si hay espacio para un grupo:** Verifica si es posible acomodar a un grupo de `X` personas, de forma contigua, en la misma fila. 

```java
Boolean hayEspacioPara(Integer cantidadDePersonas)
```

---

## Herencia y Polimorfismo

### **Ejercicio 1**: Sistema de Transporte
Desarrolla un sistema para gestionar diferentes tipos de vehículos en una compañía de transporte. Crea una clase base `Vehiculo` con los atributos `patente`, `pesoMaximo` y `capacidadDeCarga` (Pasajeros). Se le deberán agregar los métodos `cargarPasajeros()`, `obtenerCapacidadMaximaDePasajeros()`, y `obtenerPesoMaximo()`.

Luego, crear las subclases `Colectivo`, `Camion`, y `Coche` con métodos específicos que sobreescriban los métodos de la clase base, para lograr cargar pasajeros según la capacidad de pasajeros (número) y no exceder el peso máximo del vehículo específico.

---

### **Ejercicio 2**: Sistema de Facturación para Productos
Diseña un sistema de facturación para diferentes tipos de productos en una tienda. Crea una clase base `Producto` con atributos como `nombre`, `precio`, y `descripcion`. Luego, crea subclases como `ProductoElectronico`, `ProductoAlimenticio`, y `ProductoRopa` que sobrescriban el método `calcularPrecioFinal()` para incluir descuentos específicos o impuestos según el tipo de producto.

- **Producto Electrónico:** Recargo del 15%.
- **Producto de Ropa:** Comisión del vendedor del 5%.
- **Producto Alimenticio:** Valor fijo de $1000 más un 7.5%.

---

### **Ejercicio 3**: Sistema de Pago en Línea
Crea un sistema para procesar pagos en línea con diferentes métodos de pago. Define una clase base `MetodoPago` con un método `procesarPago(double monto)`. Luego, crea subclases como `TarjetaCredito`, `MercadoPago`, y `TransferenciaBancaria` que sobrescriban el método `procesarPago()` con la lógica específica de cada método de pago.

- **Transferencias Bancarias:** Si superan el monto de $100000, agregan un 1% como costo de transacción.
- **MercadoPago:** Recargo del 12%.
- **Tarjetas de Crédito:** Validan el crédito disponible y agregan un 22.7%.

---

### **Ejercicio 4**: Sistema de Control de Inventario
Desarrolla un sistema de control de inventario para una tienda. Crea una clase base `Producto` con atributos como `nombre`, `cantidad`, y `precioUnitario`. Implementa subclases como `ProductoPerecedero` y `ProductoNoPerecedero`, cada una con atributos adicionales y un método sobrescrito `obtenerPrecio()` que determina el precio del producto:

- **Producto Perecedero:** 5% agregado sobre el precio unitario.
- **Producto No Perecedero:** 7% agregado sobre el precio unitario.

La tienda debe poder informar el valor total de todos los productos que contiene, debiendo obtener el precio unitario de cada producto (con el porcentaje agregado) para acumular y mostrar el precio total.

Además, la tienda debe poder informar el valor total de los productos perecederos y no perecederos que contiene, mostrando el precio total de cada categoría.

---

