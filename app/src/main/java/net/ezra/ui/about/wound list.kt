import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import net.ezra.ui.about.WoundDetail

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun WoundCareGuideScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Wound Care Guide") },
                backgroundColor = Color.Blue,
                contentColor = Color.White
            )
        },
        content = {
            WoundCareGuideContent()
        }
    )
}

@Composable
fun WoundCareGuideContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Wound Care Guide",
            fontSize = 20.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        WoundCareStep("Step 1:", "Cleanse the wound with mild soap and water.")
        WoundCareStep("Step 2:", "Apply an antibiotic ointment to prevent infection.")
        WoundCareStep("Step 3:", "Cover the wound with a sterile bandage or gauze.")
        WoundCareStep("Step 4:", "Change the bandage daily and watch for signs of infection.")
        WoundCareStep("Step 5:", "Seek medical attention if the wound does not heal or shows signs of infection.")
    }

    
}

@Composable
fun WoundCareStep(step: String, description: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(vertical = 8.dp)
    ) {
        Text(
            text = step,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.width(60.dp)
        )
        Text(text = description)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    WoundCareGuideScreen()



}
