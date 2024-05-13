package net.ezra.ui.about

import android.annotation.SuppressLint
import android.icu.text.ListFormatter.Width
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.ui.home.BottomBar
import net.ezra.ui.home.HomeScreen



@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun WoundDetail(navController: NavHostController) {
Box (modifier = Modifier
    .fillMaxSize()
    .fillMaxWidth()
    .background(Color.Black)
    .padding(1.dp)


){

    Scaffold(
        bottomBar = { BottomBar()},

        topBar = {
            TopAppBar(
                title = { Text("Wound Detail") }
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(text = "Open or Closed")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Open wounds are the wounds with exposed underlying tissue/ organs and open to the outside environment, for example, penetrating wounds. On the other hand, closed wounds are the wounds that occur without any exposure to the underlying tissue and organs.")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "")
            Row {
                Card {
                    Image(painter = painterResource(id = net.ezra.R.drawable.img_2), contentDescription ="" )
                }
                Spacer(modifier = Modifier.width(20.dp))

                Card {
                    Image(painter = painterResource(id = net.ezra.R.drawable.img_4), contentDescription ="" )
                }
Text(text = "")
            }

        }
        // Add more details if needed
    }

}




    }


            @Composable
            fun BottomBar(navController: NavHostController) {
                BottomAppBar(
                    backgroundColor = Color.Blue, // Change color as needed
                    contentColor = Color.White, // Change content color as needed
                    modifier = Modifier.fillMaxWidth()
                ) {
                    BottomNavigationItem(
                        icon = {
                            Icon(
                                imageVector = Icons.Default.Home,
                                contentDescription = "Home"
                            )
                        },
                        selected = true,
                        onClick = {}
                    )

                    BottomNavigationItem(
                        icon = {
                            Icon(
                                imageVector = Icons.Default.Refresh,
                                contentDescription = "Refresh"
                            )
                        },
                        selected = false,
                        onClick = {}
                    )

                    BottomNavigationItem(
                        icon = {
                            Icon(
                                imageVector = Icons.Default.Person,
                                contentDescription = "Profile"
                            )
                        },
                        selected = false,
                        onClick = {}
                    )
                }

            }





@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    WoundDetail(rememberNavController())

}


