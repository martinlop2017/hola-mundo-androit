# App «Hola Mundo» para Android

Una app con un botón: al pulsarlo aparece «¡Hola mundo!». Este proyecto se
compila solo en GitHub (gratis) y te deja descargar el archivo `.apk` para
instalarlo en tu tablet.

## Pasos

1. **Cuenta en GitHub.** Entra en https://github.com y crea una cuenta gratuita
   (si ya tienes una, inicia sesión).
2. **Repositorio nuevo.** Pulsa el botón **+** (arriba a la derecha) →
   **New repository**. Ponle un nombre (por ejemplo `holamundo`), déjalo en
   **Private** y pulsa **Create repository**.
3. **Subir los archivos.** Descomprime este zip en tu ordenador. En la página
   del repositorio pulsa **uploading an existing file** y arrastra **todo el
   contenido de la carpeta** (no el zip). Comprueba que aparece la carpeta
   `.github`. Abajo pulsa **Commit changes**.
   - Si `.github` no se ha subido: **Add file → Create new file**, escribe como
     nombre `.github/workflows/build.yml`, pega el contenido de ese archivo y
     pulsa **Commit changes**.
4. **Esperar la compilación.** Entra en la pestaña **Actions**. Verás una
   ejecución llamada «Compilar APK». Tarda entre 3 y 6 minutos; cuando salga
   una marca verde ya está lista. (Si GitHub pide activar Actions, acepta.)
5. **Descargar el APK.** Pulsa sobre la ejecución y, abajo, en **Artifacts**,
   descarga **HolaMundo-apk**. Es un zip que contiene `app-debug.apk`.
6. **Instalar en la tablet.** Copia `app-debug.apk` a la tablet (o haz los pasos
   4 y 5 directamente desde ella). Ábrelo; Android te pedirá permiso para
   «instalar apps desconocidas» desde ese navegador o gestor de archivos:
   actívalo y vuelve atrás. Si Play Protect avisa, elige **Instalar de todos
   modos**.

## Si algo falla

Si la ejecución sale con una cruz roja, abre el paso que falló, copia las
últimas líneas del error y envíaselas a Claude.
