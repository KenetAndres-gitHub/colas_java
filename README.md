## Cliente - Aplicación de Colas

Esta es una aplicación simple de colas implementada en Java utilizando la interfaz gráfica de usuario proporcionada por `JOptionPane`. Esta aplicación permite al usuario realizar las siguientes operaciones en una cola de máximo 20 elementos:

1. **AGREGAR DATO:** Agrega un dato a la cola.
2. **ELIMINAR DATO:** Elimina un dato de la cola (siguiendo el principio FIFO - First In, First Out).
3. **MOSTRAR DATOS:** Muestra todos los datos almacenados en la cola.
4. **TERMINAR:** Finaliza el programa.

### Instrucciones de Uso

1. Ejecute el programa.
2. Se mostrará un cuadro de diálogo con las opciones disponibles para el usuario.
3. Seleccione una opción ingresando el número correspondiente:
   - **1:** Agregar un dato a la cola.
   - **2:** Eliminar un dato de la cola.
   - **3:** Mostrar todos los datos almacenados en la cola.
   - **4:** Finalizar el programa.
4. Siga las instrucciones proporcionadas por el programa para completar la operación seleccionada.

### Consideraciones

- La cola tiene una capacidad máxima de 20 elementos.
- Se garantiza que los datos ingresados son números enteros.
- El programa muestra mensajes de advertencia si se intenta agregar datos cuando la cola está llena, o si se intenta eliminar datos cuando la cola está vacía o el primer dato ya ha sido eliminado.

