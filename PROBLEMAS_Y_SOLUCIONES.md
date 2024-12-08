# Problemas y Soluciones - Proyecto Despensa Inteligente

Este archivo documenta los principales problemas enfrentados durante el desarrollo del proyecto "Despensa Inteligente" y las soluciones implementadas.

## Índice
1. [Problemas Relacionados con Jira](#problemas-relacionados-con-jira)
   - [Problema 1: Estructura Inicial](#problema-1-estructura-inicial)
   - [Problema 2: Sincronización con Ramas de Git](#problema-2-sincronización-con-ramas-de-git)
2. [Problemas Relacionados con Git](#problemas-relacionados-con-git)
   - [Problema 1: Commits Ausentes o Incorrectos](#problema-1-commits-ausentes-o-incorrectos)
   - [Problema 2: Push Incompleto](#problema-2-push-incompleto)

## Problemas Relacionados con Jira

### Problema 1: Estructura Inicial
**Descripción**: No estaba claro cómo organizar los epics, tareas y subtareas en Jira. Esto dificultó el seguimiento del progreso.  
**Solución**:
- Se definieron epics basados en funcionalidades clave: Gestión de Usuarios, Productos, Inventarios, Alertas, etc.
- Cada epic se desglosó en tareas específicas y subtareas técnicas.

### Problema 2: Sincronización con Ramas de Git
**Descripción**: Las ramas de Git no estaban alineadas con las tareas de Jira.  
**Solución**:
- Se definió un flujo de trabajo en el que cada tarea de Jira tiene una rama en Git con el formato feature/DI-{número}-{descripción}.

## Problemas Relacionados con Git

### Problema 1: Commits Ausentes o Incorrectos
**Descripción**: Los commits no reflejaban adecuadamente el trabajo realizado.  
**Solución**:
- Se revisaron las ramas y se ajustaron los commits utilizando `git commit --amend` para corregir mensajes y añadir cambios faltantes.

### Problema 2: Push Incompleto
**Descripción**: Algunos commits locales no se habían subido al repositorio remoto.  
**Solución**:
- Se verificaron los commits locales y se realizó el push de los cambios pendientes.