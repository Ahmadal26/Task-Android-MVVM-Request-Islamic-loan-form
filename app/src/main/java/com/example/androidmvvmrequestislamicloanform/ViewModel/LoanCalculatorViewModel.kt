package com.example.androidmvvmrequestislamicloanform.ViewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import java.time.temporal.TemporalAmount

class LoanCalculatorViewModel: ViewModel() {
    var amount by mutableStateOf(0)
        private set
    var period by mutableStateOf(0)
        private set
    var monthlyInstallment by mutableStateOf(0.0)
        private set

    fun calculateMonthlyInstallment(amount: Double, period: Int) {
        monthlyInstallment = amount / period


    }
    fun LoanCalculatorViewModel.calculateLoanPeriod(salary:Double){
        monthlyInstallment = 0.4 *salary

        period = amount/monthlyInstallment.toInt()

    }
}