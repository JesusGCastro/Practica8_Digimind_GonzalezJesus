package gonzalez.jesus.practica8_digimind_gonzalezjesus

import java.io.Serializable

class Carrito: Serializable {
    var recordatorios = ArrayList<Recordatorio>()

    fun agregar(p: Recordatorio): Boolean{
        return recordatorios.add(p)
    }
}