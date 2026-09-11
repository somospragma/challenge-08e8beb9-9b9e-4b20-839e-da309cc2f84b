# Implementación de DDD en un Sistema de Gestión de Pagos

La empresa Pragma necesita un sistema robusto para gestionar pagos en su plataforma fintech. El sistema debe manejar transacciones de manera eficiente, asegurando la consistencia de los datos y la fiabilidad del servicio. Necesitamos que diseñes y desarrolles un módulo que integre los principios de Diseño Guiado por el Dominio (DDD) para gestionar estas transacciones.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Dominio del Diseño Guiado por el Dominio |
| **Nivel** | senior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 8-10 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Modelado del Dominio

**Objetivo:** Definir los agregados y entidades clave para el manejo de transacciones en el sistema.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identifica las entidades clave en el dominio de los pagos (ej. Transacción, Cuenta, Cliente).
- Define los agregados y sus raíces para asegurar la consistencia del modelo.
- Establece las relaciones entre entidades y agregados.

**Entregable:** Diagrama de modelo de dominio y descripción de agregados y entidades.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en cómo las transacciones se relacionan con las cuentas y los clientes.
- Recuerda que un agregado debe tener una raíz que garantice su consistencia.

</details>

### Fase 2: Implementación de Servicios del Dominio

**Objetivo:** Crear servicios del dominio que encapsulen la lógica de negocio para las transacciones.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Implementa servicios que manejen la creación, actualización y eliminación de transacciones.
- Asegura que los servicios respeten las reglas de negocio definidas en el modelo de dominio.

**Entregable:** Código de servicios del dominio con pruebas unitarias.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que los servicios del dominio deben encapsular la lógica de negocio.
- Utiliza pruebas unitarias para validar el comportamiento de los servicios.

</details>

### Fase 3: Integración con Repositorios

**Objetivo:** Integrar los servicios del dominio con repositorios para persistir las transacciones.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Crea repositorios que interactúen con la base de datos para guardar y recuperar transacciones.
- Asegura que los repositorios sigan el patrón de repositorio y respeten las reglas de negocio.

**Entregable:** Código de repositorios con pruebas de integración.

<details>
<summary>Pistas de conocimiento</summary>

- Recuerda que los repositorios deben seguir el patrón de repositorio.
- Utiliza pruebas de integración para validar la interacción con la base de datos.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un agregado en el contexto de DDD y cómo se relaciona con las transacciones en el sistema?
- **paraQueSirve**: ¿Para qué sirve un servicio del dominio en el manejo de transacciones y cómo se asegura que respete las reglas de negocio?
- **comoSeUsa**: ¿Cómo se utiliza un repositorio en DDD para persistir transacciones y qué patrones se deben seguir?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar DDD en un sistema de gestión de pagos y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica la elección de un agregado raíz en el modelo de dominio y cómo afectan al sistema?

## Criterios de Evaluacion

- Definir correctamente los agregados y entidades en el modelo de dominio.
- Implementar servicios del dominio que encapsulen la lógica de negocio.
- Integrar servicios del dominio con repositorios para persistir transacciones.
- Escribir pruebas unitarias y de integración para validar el comportamiento del sistema.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
