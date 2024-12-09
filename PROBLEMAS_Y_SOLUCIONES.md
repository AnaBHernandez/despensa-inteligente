🚧 Problemas y Soluciones - Proyecto Despensa Inteligente 🚧
📝 Problemas Relacionados con Jira
⚠️ Problema: Estructura Inicial

🔹 No estaba claro cómo organizar épicos, tareas y subtareas.
💡 Solución:
✅ Definir épicos basados en funcionalidades: Gestión de Usuarios, Productos, Inventarios y Alertas.
✅ Dividir épicos en tareas y subtareas.
⚠️ Problema: Sincronización con Ramas de Git

🔹 Las ramas de Git no estaban alineadas con las tareas de Jira.
💡 Solución:
✅ Crear ramas por tarea en el formato: feature/DI-{número}-{descripción}.
📝 Problemas Relacionados con Git
⚠️ Problema: Commits Ausentes o Incorrectos

🔹 Los commits no reflejaban correctamente el trabajo realizado.
💡 Solución:
✅ Ajustar mensajes de commits con comandos como git commit --amend.
⚠️ Problema: Push Incompleto

🔹 Cambios locales no subidos al repositorio remoto.
💡 Solución:
✅ Sincronizar cambios locales utilizando git push.
⚠️ Problema: Confusión en la Rama de Trabajo

🔹 Cambios realizados en ramas equivocadas.
💡 Solución:
✅ Trabajar siempre en la rama principal dev y crear ramas específicas a partir de esta.
📝 Problemas Relacionados con MySQL
⚠️ Problema: Conexión a MySQL

🔹 Error al conectar el proyecto con MySQL.
💡 Solución:
✅ Verificar que MySQL esté corriendo y el puerto 3306 habilitado.
✅ Revisar credenciales y cadena de conexión.
⚠️ Problema: Configuración en application.properties

🔹 Configuración incorrecta en credenciales o URL.
💡 Solución:
✅ Ajustar credenciales en el archivo de configuración.
⚠️ Problema: Tablas de Base de Datos No Detectadas

🔹 Tablas no creadas o no detectadas en MySQL.
💡 Solución:
✅ Confirmar existencia de tablas y revisar anotaciones en entidades.
📝 Problemas Relacionados con PowerShell
⚠️ Problema: Restricciones para Scripts

🔹 PowerShell bloqueaba la ejecución de scripts .ps1.
💡 Solución:
✅ Cambiar la política de ejecución con comandos específicos.
⚠️ Problema: Rutas con Espacios

🔹 PowerShell no reconocía rutas con espacios.
💡 Solución:
✅ Envolver la ruta en comillas dobles para ejecutarlas correctamente.
📝 Problemas Relacionados con Spring Boot
⚠️ Problema: Dependencias Faltantes

🔹 Dependencias esenciales no agregadas al proyecto.
💡 Solución:
✅ Añadir dependencias al archivo pom.xml y actualizar con mvn clean install.
⚠️ Problema: Organización del Proyecto

🔹 La estructura de paquetes no seguía las mejores prácticas.
💡 Solución:
✅ Reorganizar las carpetas dentro de src/main/java.
⚠️ Problema: Cambios de javax a jakarta

🔹 Spring Boot 3.x requiere jakarta.validation.
💡 Solución:
✅ Actualizar dependencias y modificar importaciones.
⚠️ Problema: Error en contextLoads()

🔹 Fallo al cargar el contexto en pruebas.
💡 Solución:
✅ Probar con una base de datos H2 en memoria y limpiar el proyecto.
📝 Problemas Relacionados con UsuarioRepository
⚠️ Problema: Métodos findAll() y save() no encontrados
🔹 El compilador no encontraba los métodos en el repositorio.
💡 Solución:
✅ Extender JpaRepository y confirmar que las entidades tienen las anotaciones correctas (@Entity, @Id).
📝 Problemas Relacionados con Postman
⚠️ Problema: Código 404
🔹 Los endpoints no respondían o devolvían errores 404.
💡 Solución:
✅ Verificar las rutas definidas en los controladores y usar los verbos HTTP correctos.
🎯 Conclusión:
Se identificaron y resolvieron problemas en Jira, Git, MySQL, PowerShell, Spring Boot y Postman, asegurando un flujo de trabajo eficiente y un proyecto funcional. 🌟🚀