package com.example.reciceviewex

class TasklistProvider {
    companion object{
        val tasklist = listOf<TaskClass>(
            TaskClass("Estudiar", "Tengo que estudiar"),
            TaskClass("Cenar", "Espaguetis"),
            TaskClass(
                "Actividades del día",
                "Ir al centro de salud,luego ir al taxi,luego ir a la cumbre,luego buscar los zapatos"
            )
        )
    }
}