# 1. Descripción del Problema 
## Problema: Sistema de Control de Órdenes para Tienda de Café
La tienda de café necesita automatizar su sistema de toma de pedidos para calcular los costos de las bebidas. La cafetería ofrece bebidas base (como Expreso y Descafeinado) y permite a los clientes personalizarlas agregando múltiples complementos (como Leche, Soya, Moca y Crema). Cada bebida base y cada complemento tiene un precio distinto que debe sumarse al total.  Si utilizáramos herencia clásica para esto, tendríamos una "explosión de clases" creando combinaciones infinitas (ExpresoConLeche, ExpresoConLecheYMoca, etc.), lo que haría el sistema inmanejable si los precios cambian o si se añaden nuevos ingredientes.
## Solución Aplicada: Patrón Decorator
Para resolver este problema, aplicamos el patrón Decorator. Este patrón de diseño estructural nos permite añadir responsabilidades (los complementos) a un objeto base (el café) de forma dinámica durante la ejecución.  
-Las bebidas base actuarán como nuestros Componentes Concretos.  
-Los complementos actuarán como Decoradores que envuelven a la bebida base, sumando su propio costo al costo de la bebida que están envolviendo.
Esto cumple con el Principio Abierto-Cerrado: el código está abierto a la extensión (podemos crear nuevos complementos) pero cerrado a la modificación (no alteramos el código de los cafés base).

# 2. Diagrama UML
<img width="1536" height="1024" alt="image" src="https://github.com/user-attachments/assets/bfbd7fa8-332b-4220-8f0e-147f5de9fae6" />
