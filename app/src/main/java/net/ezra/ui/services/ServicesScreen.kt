package net.ezra.ui.services


import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.ui.theme.AppTheme



@Composable
fun ServicesScreen(navController: NavHostController) {
LazyColumn {
    item {
        Card(modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue)

        ) {
Text(text = "    Assessment: Thorough evaluation of the wound's size, depth, severity, and any underlying conditions that may affect healing.\n" +
        "\n" +
        "    Cleaning and Debridement: Removing dead tissue, foreign debris, and bacteria from the wound to promote healing and prevent infection.\n" +
        "\n" +
        "    Dressing Changes: Application of appropriate wound dressings to maintain a moist wound environment, protect from further injury, and facilitate healing.\n" +
        "\n" +
        "    Infection Management: Monitoring for signs of infection and administering antibiotics or other treatments as necessary.\n" +
        "\n" +
        "    Wound Irrigation: Flushing the wound with a sterile solution to remove contaminants and promote cleanliness.\n" +
        "\n" +
        "    Pressure Offloading: Providing devices or strategies to relieve pressure on wounds, particularly for patients at risk of pressure ulcers.\n" +
        "\n" +
        "    Nutritional Support: Ensuring patients receive adequate nutrition to support the body's healing processes.\n" +
        "\n" +
        "    Education: Providing patients and caregivers with information on wound care techniques, signs of complications, and strategies for prevention.\n" +
        "\n" +
        "    Advanced Therapies: In some cases, advanced therapies such as negative pressure wound therapy, hyperbaric oxygen therapy, or bioengineered skin substitutes may be utilized to promote healing in difficult-to-treat wounds.\n" +
        "\n" +
        "    Follow-up Care: Monitoring the wound's progress over time and adjusting treatment as needed to optimize healing.\n" +
        "\n ")

            Spacer(modifier = Modifier.height(10.dp))
Text(text ="WAYS OF PREVENTING INFECTIONS")
            Card {
                Text(text = "enting wound infection is crucial for proper healing and overall health. Here are some ways to avoid wound infection:\n" +
                        "\n" +
                        "    Cleanliness: Always wash your hands thoroughly with soap and water before and after handling a wound or changing bandages. Keep the wound area clean and dry.\n" +
                        "\n" +
                        "    Sterile Equipment: Use sterile gloves, scissors, and other tools when dressing wounds to prevent introducing bacteria.\n" +
                        "\n" +
                        "    Antiseptic Cleansing: Clean the wound with a mild antiseptic solution, such as hydrogen peroxide or iodine, to reduce the risk of infection. However, avoid using harsh chemicals that may damage healthy tissue.\n" +
                        "\n" +
                        "    Proper Dressing: Cover the wound with a sterile dressing or bandage to protect it from dirt, bacteria, and further injury. Change the dressing regularly according to your healthcare provider's instructions.\n" +
                        "\n" +
                        "    Avoid Moisture: Keep the wound dry, as moisture can create an environment for bacteria to thrive. If the wound must be moistened for cleaning, use sterile saline solution.\n" +
                        "\n" +
                        "    Promote Healing: Support your body's natural healing process by maintaining a healthy diet rich in vitamins and minerals, staying hydrated, and getting enough rest.\n" +
                        "\n" +
                        "    Avoid Irritants: Avoid substances that may irritate the wound, such as harsh chemicals, perfumes, or abrasive materials.\n" +
                        "\n" +
                        "    Avoid Touching: Refrain from touching the wound unnecessarily to minimize the risk of introducing bacteria.\n" +
                        "\n" +
                        "    Monitor for Signs of Infection: Watch for signs of infection, such as increased pain, redness, swelling, warmth, or pus drainage from the wound. If you notice any of these symptoms, seek medical attention promptly.\n" +
                        "\n" +
                        "    Follow Medical Advice: If you have specific instructions from a healthcare provider regarding wound care, medication, or follow-up appointments, be sure to follow them closely.")
                
            }



            
        }
    }
}




}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    ServicesScreen(rememberNavController())
}

