# 🧑‍💻 Tasca S1.02. Exceptions


## 📄 Descripció

Aquest projecte conté tres exercicis distribuïts en nivells de dificultat, centrats en el tractament d'excepcions, la validació d'entrada per teclat i la gestió de reserves en una sala de cinema.

### 🔹 Nivell 1 – Gestió de vendes i excepcions

- Es crea la classe `Producte` amb atributs `nom` i `preu`.
- La classe `Venda` conté una col·lecció de productes i un atribut `preuTotal`.
- El mètode `calcularTotal()` llança una excepció personalitzada `VendaBuidaException` si no hi ha productes.
- Es mostra el missatge: “Per fer una venda primer has d’afegir productes”.
- També es genera i captura una excepció de tipus `IndexOutOfBoundsException`.

### 🔹 Nivell 2 – Validació d’entrada amb Scanner

- Es crea la classe `Entrada` amb mètodes estàtics per llegir dades des del teclat.
- Es capturen excepcions com `InputMismatchException` i una excepció personalitzada.
- Els mètodes inclouen:
  - `llegirByte(String missatge)`
  - `llegirInt(String missatge)`
  - `llegirFloat(String missatge)`
  - `llegirDouble(String missatge)`
  - `llegirChar(String missatge)`
  - `llegirString(String missatge)`
  - `llegirSiNo(String missatge)` → retorna `true` si l’usuari introdueix “s”, `false` si introdueix “n”.

### 🔹 Nivell 3 – Reserva de seients en cinemes

- Es desenvolupa una aplicació per gestionar la reserva de butaques en una sala de cinema.
- L’usuari introdueix el nombre de files i seients per fila.
- Menú funcional:
  1. Mostrar totes les butaques reservades  
  2. Mostrar les butaques reservades per una persona  
  3. Reservar una butaca  
  4. Anul·lar la reserva d’una butaca  
  5. Anul·lar totes les reserves d’una persona  
  0. Sortir
 
     

## 💻 Tecnologies Utilitzades

- **Java SE 17**  
- **IntelliJ IDEA** com a entorn de desenvolupament  
- **Git & GitHub** per al control de versions  
- **JDK** per a la compilació i execució del codi  
- **Collections Framework** (ArrayList, etc.)  
- **POO**: Classes, herència, interfícies, mètodes abstractes i membres estàtics



## 📋 Requisits

- **Java Development Kit (JDK) 17 o superior**  
- **IntelliJ IDEA** o qualsevol IDE compatible amb Java  
- **Git** instal·lat per clonar el repositori  
- Coneixements bàsics de programació orientada a objectes



## 🛠️ Instal·lació

1. Clona el repositori:
   ```bash
   git clone https://github.com/Viid21/S1_O2_Exceptions.git
