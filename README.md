## Descripción de la app

Aplicación Android de demostración que usa un **`BroadcastReceiver`** registrado en tiempo de ejecución para escuchar el broadcast del sistema **`Intent.ACTION_USER_PRESENT`**, emitido cuando el usuario desbloquea el dispositivo (pantalla de bloqueo desactivada).

Al detectar ese evento, la app:

- Muestra un **Toast** con el mensaje *“Pantalla desbloqueada detectada”*.
- Abre la aplicación de llamadas mediante un **intent implícito** `ACTION_DIAL` con el número `2664553747` (`tel:`), sin requerir permiso de llamada directa.
