package net.ezra.ui.products

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.R
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_SHOP

@Composable
fun ProductsScreen(navController: NavHostController) {


   Box {
       Column(
           modifier = Modifier
               .fillMaxWidth()
               .wrapContentHeight()
               .padding(10.dp)
               .padding(top = 10.dp)

       ){
           Text(text = "product available")

           Text(
               modifier = Modifier
                   .clickable {
                       navController.navigate(ROUTE_HOME) {
                           popUpTo(ROUTE_PRODUCTS) { inclusive = true }
                       }
                   },
               text = "Go home", color = Color(0xff23D342)
           )


           Spacer(modifier = Modifier.height(10.dp))

           Card {
               Column (
                   modifier = Modifier
                       .fillMaxWidth()
                       .wrapContentHeight()
                       .padding(10.dp)
//                       .padding(top = 10.dp)
               ){
                   Row {
                       Image(painter = painterResource(id = R.drawable.img_7), contentDescription = "", Modifier.fillMaxWidth())

                       Spacer(modifier = Modifier.width(10.dp))



                   }
               }




           }

           Spacer(modifier = Modifier.height(15.dp))

           Card {
               Column (
                   modifier = Modifier
                       .fillMaxWidth()
                       .wrapContentHeight()
                       .padding(10.dp)
                       .padding(top = 10.dp)
               ){
                   Row {
                       Image(painter = painterResource(id = R.drawable.img_6), contentDescription = "", Modifier.fillMaxWidth())

                       Spacer(modifier = Modifier.width(10.dp))



                   }
               }




           }

           Spacer(modifier = Modifier.height(15.dp))
LazyColumn {
    item {            Card(){
        Text(text = "\n" +
                "The goal of wound cleaning is to remove debris and contaminants from the wound without damaging healthy tissue. After an initial cleaning, wounds should be cleaned before a new dressing is applied and as needed.\n" +
                "\n" +
                "Step by step\n" +
                "\n" +
                "As you follow these steps, be sure to observe stand ard precautions. Follow facility protocols regarding use of clean or sterile technique.\n" +
                "\n" +
                "Remove the soiled dressing.\n" +
                "Put on clean gloves. Roll or lift an edge of the dressing, and then gently remove it while supporting the surrounding skin. When possible, remove the dressing in the direction of hair growth.\n" +
                "\n" +
                "\n" +
                "Inspect the dressing and wound.\n" +
                "Note the color, amount, and odor of drainage and necrotic debris.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Clean the wound.\n" +
                "Moisten gauze pads either by dipping the pads in wound cleaning solution and wringing out excess or by using a spray bottle to apply solution to the gauze.\n" +
                "\n" +
                "\n" +
                "Dry the wound.\n" +
                "Using the same procedure as for cleaning a wound, dry the wound using dry gauze pads; pat dry; do not rub.\n" +
                "Reassess the condition of the skin and wound.\n" +
                "Note the character of the clean wound bed and surrounding skin.\n" +
                "Wound reassessment algorithm\n" +
                "\n" +
                "\n" +
                "Remove soiled gloves, and replace. Dress the wound, filling dead space if indicated, as ordered.\n" +
                "Cleaning techniques\n" +
                "\n" +
                "To clean a linear-shaped wound (such as an incision), gently wipe from top to bottom in one motion, starting directly over the wound and moving outward, as shown below.\n" +
                "\n" +
                "\n" +
                "\n" +
                "For an open wound (such as a pressure injury/ulcer), gently wipe in concentric circles, starting directly over the wound and moving outward, as shown below.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Choosing a cleaning agent\n" +
                "\n" +
                "The type of cleaning agent you'll use on a wound depends on the wound type and characteristics.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Types of antiseptic solutions\n" +
                "\n" +
                "Acetic acid\n" +
                "Used to treat Pseudomonas infection\n" +
                "Verify active infection by culture before use\n" +
                "0.5% to 5% strength depending on order\n" +
                "Sodium hypochlorite (Dakin's solution)\n" +
                "Used to kill Gram-negative bacteria per culture\n" +
                "Slightly dissolves necrotic tissue\n" +
                "Must be freshly prepared every 48 hours and away from sunlight\n" +
                "Povidone-iodine\n" +
                "Used to kill broad spectrum of bacteria\n" +
                "May dry and stain the surrounding skin; protect from contact\n" +
                "Toxic with prolonged use or over large areas\n" +
                "Avoid use in patients with thyroid disease\n" +
                "Chlorhexidine\n" +
                "Used to kill Gram-positive and Gram-negative bacteria\n" +
                "Must be diluted\n" +
                "Do not use on face, or mucous membranes\n" +
                "Creating a top-notch wound care app requires features like:\n" +
                "\n" )


    } }
}

       }

   }
}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    ProductsScreen(rememberNavController())
}

