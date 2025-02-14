# Reutilización de Software - UNIR

Este repositorio contiene los ejercicios y ejemplos desarrollados para la asignatura de Reutilización de Software de la Universidad Internacional de La Rioja (UNIR), cuatrimestre 2024/25.

## Estructura del Proyecto

El proyecto está organizado en diferentes módulos, cada uno demostrando la implementación de diversos patrones de diseño y conceptos de reutilización de software.

### Actividades Principales

#### Actividad 1: Alineaciones de Equipos
Implementación de un sistema de alineaciones deportivas utilizando herencia y extensión de clases.
- `alineaciones_misma_jerarquia`: Implementación base para equipos de fútbol y LoL
- `alineaciones_misma_jerarquia_extension`: Extensión que incluye equipos de baloncesto

#### Actividad 2: Sistema de Telescopio
Demostración del patrón Adapter para compatibilidad entre sistemas de localización.
- `telescopio_clase`: Implementación usando adaptador de clase
- `telescopio_objeto`: Implementación usando adaptador de objeto

#### Actividad 3: Sistema de Precios de Carburantes
Implementación del patrón Observer para monitoreo de precios.
- `version1`: Implementación básica
- `version2`: Implementación extendida con funcionalidad adicional

### Patrones de Diseño Adicionales

#### Patrón Adapter
- `Adapter_Composicion`: Implementación usando composición
- `Adapter_Herencia`: Implementación usando herencia
Ejemplo práctico de adaptación entre Pilas y Listas.

#### Patrón Builder
Implementación para la construcción de documentos en diferentes formatos (HTML, JSON).

#### Patrón Decorator
Sistema de reservas de aventuras con complementos adicionales:
- Actividades base: Rafting, Espeleología
- Decoradores: Tirolinas, Reportaje, Seguro, etc.

#### Patrón Interpreter
Evaluador de expresiones booleanas con operadores AND/OR y paréntesis.

#### Patrón MVC (Model-View-Controller)
Implementación de una calculadora con:
- Modelo de datos
- Vistas (Consola y Ventana)
- Controlador

#### Patrón Observer
Sistema de monitoreo meteorológico con actualización en tiempo real.

#### Patrón Command (Orden)
Mini-mando para control de dispositivos domésticos:
- Control de alarma
- Control de calefacción

#### Patrón Proxy
Implementación de un proxy de protección para ejecución de comandos.

## Requisitos

- Java 8 o superior
- IDE compatible con proyectos Java (recomendado: IntelliJ IDEA)

## Ejecución

Cada módulo contiene su propia clase principal (Main o Cliente) que demuestra la funcionalidad implementada. Los proyectos pueden ser importados y ejecutados individualmente en un IDE compatible con Java.

## Estructura de Carpetas

```
.
├── Actividad1/
│   └── src/
│       ├── alineaciones_misma_jerarquia/
│       └── alineaciones_misma_jerarquia_extension/
├── Actividad2/
│   └── src/
│       ├── telescopio_clase/
│       └── telescopio_objeto/
├── Actividad3/
│   └── src/
│       └── preciosCarburantes/
└── [Módulos de Patrones de Diseño]
```

