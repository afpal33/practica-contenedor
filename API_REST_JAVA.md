1. Crear un nuevo repo en github: practica-contenedor
2. Ingresar a start.spring.io y crear un proyecto.
No olvidar agregar la dependencia WEB.
3. Subir el proyecto del punto 2 al repositorio del punto
4. Agregar un endpoint REST al proyecto Java que
implemente lo siguiente (sin BBDD, todo en memoria).
	GET api/v1/task
	[
	    {
	   	taskId: 1
		name: Hacer mi tarea
		dueDate: 25/12/2023
		status: PENDING
	    }
	]
	POST /api/v1/task
	{
		name: Hacer mi tarea
		dueDate: 25/12/2023
		status: PENDING
	}
	DELETE	 /api/v1/task/1

5. Crear la imagen docker de la aplicación JAVA.
6. exponer la aplicación con un NGINX por delante del JAVA
haciendo Reverse Proxy.