package com.example.lista_exercicios

import android.app.DatePickerDialog
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import androidx.annotation.RequiresApi
import com.example.lista_exercicios.databinding.ActivityExercicio3Binding
import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter
import java.util.Calendar

class Exercicio3 : AppCompatActivity() {

    private lateinit var binding: ActivityExercicio3Binding
    lateinit var datePicker: DatePicker

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityExercicio3Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val question =  "3. Calcular a idade de uma pessoa, tendo em vista que ela irá digitar o ano do" +
                        "seu nascimento. Evitar que o ano informado seja maior que o ano atual, ou" +
                        "menor que 1900."

        binding.question.text = question

        val editDateOfBirth = binding.editDateOfBirth

        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        datePicker = DatePicker(this)
        datePicker.maxDate = System.currentTimeMillis() // Impede datas futuras
        datePicker.minDate = getMinDate() // Impede datas anteriores a 1900

        editDateOfBirth.setOnClickListener {
            var datePickerDialog = DatePickerDialog(
                this,
                { _: DatePicker, selectedYear: Int, selectedMonth: Int, selectedDay: Int ->
                    val formattedDate = String.format(
                        "%02d/%02d/%04d",
                        selectedDay,
                        selectedMonth + 1,
                        selectedYear
                    )
                    editDateOfBirth.setText(formattedDate)
                },
                year,
                month,
                day
            )
            datePickerDialog.datePicker.maxDate = System.currentTimeMillis() // Impede datas futuras
            datePickerDialog.datePicker.minDate = getMinDate() // Impede datas anteriores a 1900
            datePickerDialog.show()
        }

        val btnCalculateAge = binding.btnCalculateAge

        btnCalculateAge.setOnClickListener {
            val dateOfBirth = editDateOfBirth.text.toString()
            if(dateOfBirth.isEmpty()){
                binding.showAge.text = "Preencha o campo!"
            } else {
                val age = calculateAge(dateOfBirth)
                binding.showAge.text = "Sua idade é $age anos."
            }
        }

    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun calculateAge(dateString: String): Int {
        val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        val birthDate = LocalDate.parse(dateString, formatter)
        val currentDate = LocalDate.now()
        return Period.between(birthDate, currentDate).years
    }

    private fun getMinDate(): Long {
        val calendar = Calendar.getInstance()
        calendar.set(1900, Calendar.JANUARY, 1)
        return calendar.timeInMillis
    }


}