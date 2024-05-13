package net.ezra.ui.evening

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_HOM


@Composable
fun WoundCareHomePage(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)

    ) {
Card (modifier = Modifier.clickable { navController.navigate(ROUTE_HOM){popUpTo(ROUTE_EVENING){inclusive=true} }}){
    IconButton(onClick = {  }) {
        Image(painter = painterResource(id = R.drawable.img_8), contentDescription = "")

    }

}

        Text(
            text = "Welcome to Wound Care",
            modifier = Modifier
                .padding(bottom = 16.dp),
            color = Color.Magenta
        )

        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "Wound Care Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentScale = ContentScale.FillWidth
        )

        Text(
            text = "Wound care involves the assessment, treatment, and management of wounds to promote healing and prevent complications." +
                    "It encompasses a range of techniques and interventions, including cleaning, dressing, and protecting the wound site. " +
                    "Proper wound care is essential for preventing infection, reducing pain, and facilitating the healing process.,",
            modifier = Modifier
                .padding(vertical = 16.dp),
            color = Color.Yellow
        )

        // Add more text or images as needed for additional content
        Card {
          Column{
              Row {

                  Image(painter = painterResource(id = R.drawable.lists), contentDescription = "")
                  Spacer(modifier = Modifier.width(20.dp))
                  Image(painter = painterResource(id = R.drawable.search), contentDescription = "")


              }



          }

        }


    }


}


@Preview
@Composable
fun PreviewWoundCareHomePage() {
    WoundCareHomePage(rememberNavController())
}
