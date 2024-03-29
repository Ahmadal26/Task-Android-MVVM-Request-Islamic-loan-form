package com.example.androidmvvmrequestislamicloanform

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidmvvmrequestislamicloanform.ViewModel.Composable.LoanCalculatorComposable
import com.example.androidmvvmrequestislamicloanform.ViewModel.LoanCalculatorViewModel
import com.example.androidmvvmrequestislamicloanform.ui.theme.AndroidMVVMRequestIslamicLoanFormTheme

class MainActivity : ComponentActivity() {
val viewModel by viewModels<LoanCalculatorViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AndroidMVVMRequestIslamicLoanFormTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {

                      LoanCalculatorComposable(viewModel = viewModel)

                        }
                    }

                }
            }
        }
    }







@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidMVVMRequestIslamicLoanFormTheme {
        Greeting("Android")
    }
}