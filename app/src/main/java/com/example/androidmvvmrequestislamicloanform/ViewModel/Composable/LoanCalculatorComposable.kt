package com.example.androidmvvmrequestislamicloanform.ViewModel.Composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androidmvvmrequestislamicloanform.ViewModel.LoanCalculatorViewModel

@Composable
fun LoanCalculatorComposable(viewModel: LoanCalculatorViewModel) {


    var loanAmount by remember {
        mutableStateOf(0.0)
    }
    var loanperiod by remember {
        mutableStateOf(0)
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {

        TextField(value = loanAmount.toString(),
            onValueChange = { loanAmount = it.toDoubleOrNull() ?: 0.0 },
            label = { Text(text = "Loan Amount") }

        )
        TextField(value = loanperiod.toString(),
            onValueChange = { loanperiod = it.toIntOrNull() ?: 0 },
            label = { Text(text = "Loan period in months") }

        )
        Button(onClick = { viewModel.calculateMonthlyInstallment(loanAmount,loanperiod) })

        {
Text("Calculate")
        }
        Text("Monthly Installment: ${viewModel.monthlyInstallment}")
    }
}
