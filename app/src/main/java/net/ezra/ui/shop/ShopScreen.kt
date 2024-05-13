package net.ezra.ui.shop

import android.net.wifi.hotspot2.pps.HomeSp
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Text
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R


@Preview(showBackground = true)

@Composable
fun HomeP() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Wound Care Hub",
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Image(painter = painterResource(id = R.drawable.img_7), contentDescription = "", Modifier.fillMaxWidth())

        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Welcome to our Wound Care Hub! We provide comprehensive information and resources for wound management and treatment.",
            modifier = Modifier.padding(horizontal = 16.dp)
        )
    }
}





@Composable
fun HomP(navController: NavHostController) {    Surface(
    modifier = Modifier.fillMaxSize()
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Wound Care Hub",
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Image(painter = painterResource(id = R.drawable.img_7), contentDescription = "", Modifier.fillMaxWidth())

        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Welcome to our Wound Care Hub! We provide comprehensive information and resources for wound management and treatment.",
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        Text(text = "")
    }
}
}




