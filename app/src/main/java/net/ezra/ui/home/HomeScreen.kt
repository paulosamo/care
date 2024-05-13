package net.ezra.ui.home

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
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
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_SHOP

import net.ezra.R
import net.ezra.navigation.ROUTE_ADD_STUDENTS
import net.ezra.navigation.ROUTE_BOOKING
import net.ezra.navigation.ROUTE_HOM
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_WOUND
import okhttp3.internal.wait
import java.util.Vector



@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavHostController) {
Box(modifier = Modifier
    .fillMaxSize()
    .fillMaxWidth()
    .background(Color.Black)
    .padding(5.dp),

) {
    Image(painter = painterResource(id = R.drawable.img_5), contentDescription = "")

    Scaffold(
        bottomBar = { BottomBar()},
//        content ={
////                 Box(modifier = Modifier.fillMaxSize().fillMaxWidth().background(color = Color.Blue).padding(50.dp))
//        },

        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Go back")
                },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.ArrowBack, "backIcon")
                    }
                },
//                backgroundColor = MaterialTheme.colors.primary,
//                contentColor = Color.White,
//                elevation = 10.dp
            )

        }, content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                Card (modifier = Modifier.clickable { navController.navigate(ROUTE_HOM){popUpTo(ROUTE_EVENING){inclusive=true} }}){
                    IconButton(onClick = {  }) {

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
                    color = Color.Black
                )

                Card {
                    Column {
                        Text(
                            modifier = Modifier

                                .clickable {
                                    navController.navigate(ROUTE_BOOKING) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }
                                },
                            text = "BOOK AN APPOINTMENT",
                            textAlign = TextAlign.Center,
                            color = MaterialTheme.colorScheme.onSurface


                        )
                        Text(
                            modifier = Modifier

                                .clickable {
                                    navController.navigate(ROUTE_MIT) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }
                                },
                            text = "LOG_IN",
                            textAlign = TextAlign.Center,
                            color = MaterialTheme.colorScheme.onSurface


                        )

                        Text(
                            modifier = Modifier

                                .clickable {
                                    navController.navigate(ROUTE_WOUND) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }
                                },
                            text = "wound details",
                            textAlign = TextAlign.Center,
                            color = MaterialTheme.colorScheme.onSurface


                        )
                        Text(
                            modifier = Modifier

                                .clickable {
                                    navController.navigate(ROUTE_PRODUCTS) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }
                                },
                            text = "WOUND CLEANING STEPS",
                            textAlign = TextAlign.Center,
                            color = MaterialTheme.colorScheme.onSurface


                        )

                        Text(
                            modifier = Modifier

                                .clickable {
                                    navController.navigate(ROUTE_SERVICES) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }
                                },
                            text = "services we offer",
                            textAlign = TextAlign.Center,
                            color = MaterialTheme.colorScheme.onSurface


                        )

                    }
                }

                // Add more text or images as needed for additional content
//                Card (modifier = Modifier
//                    .fillMaxSize()
//
//
//                ){
//                    Column{
//Image(painter = painterResource(id = R.drawable.img_4), contentDescription = "")
//
//
//                    }
//
//                }


            }


        })
}


}
@Composable
fun BottomBar() {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(elevation = 10.dp) {
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Home,""

            )
        },
            label = { Text(text = "Home") }, selected = (selectedIndex.value == 0), onClick = {
                selectedIndex.value = 0
            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Refresh,"")
        },
            label = { Text(text = "Refresh") }, selected = (selectedIndex.value == 1), onClick = {
                selectedIndex.value = 1
            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Person, "")
        },
            label = { Text(text = "Profile") }, selected = (selectedIndex.value == 2), onClick = {
                selectedIndex.value = 2
            })
    }
}




//fun HomeScreen(navController: NavHostController) {
//
//Box(modifier = Modifier.fillMaxSize()){
//    Image(painter = painterResource(id = R.drawable.img_1), contentDescription = "",
//        modifier =Modifier.fillMaxSize())
//
//    Column(
//        modifier = Modifier
//            .fillMaxWidth()
//            .wrapContentHeight()
//            .padding(10.dp)
//            .padding(top = 10.dp)
//
//    ){
//        Card(
//            colors = CardDefaults.cardColors(Color(0xffE52C04)),
//            elevation = CardDefaults.cardElevation(5.dp)
//
//        ) {
//Text(text = "THE WOUND PROS")
//
//
//        }
//
//        Spacer(modifier = Modifier.height(10.dp))
//
//
////        Text(text = stringResource(id = R.string.mit))
//        Text(text = "Homepage")
//
//
//        Text(
//            modifier = Modifier
//                .clickable {
//                    navController.navigate(ROUTE_ABOUT) {
//                        popUpTo(ROUTE_HOME) { inclusive = true }
//                    }
//                },
//            text = "about"
//        )
//
//        Button(onClick = {
//            navController.navigate(ROUTE_ABOUT) {
//                popUpTo(ROUTE_HOME) { inclusive = true }
//            }
//        }) {
//
//            Text(text = "about page")
//
//        }
//
//        Text(
//            modifier = Modifier
//                .clickable {
//                    navController.navigate(ROUTE_CONTACT) {
//                        popUpTo(ROUTE_HOME) { inclusive = true }
//                    }
//                },
//            text = "Contact"
//        )
//
//
//
//        Text(
//            modifier = Modifier
//                .clickable {
//                    navController.navigate(ROUTE_PRODUCTS) {
//                        popUpTo(ROUTE_HOME) { inclusive = true }
//                    }
//                },
//            text = "go to products screen"
//
//        )
//
//        Button(onClick = {
//            navController.navigate(ROUTE_MIT) {
//                popUpTo(ROUTE_HOME) { inclusive = true }
//            }}) {
//
//            Text(text = "GO")
//
//        }
//
//        Text(
//            modifier = Modifier
//
//                .clickable {
//                    navController.navigate(ROUTE_MIT) {
//                        popUpTo(ROUTE_HOME) { inclusive = true }
//                    }
//                },
//            text = "go to mit",
//            textAlign = TextAlign.Center,
//            color = MaterialTheme.colorScheme.onSurface
//        )
//
//        Text(
//            modifier = Modifier
//                .clickable {
//                    navController.navigate(ROUTE_SHOP) {
//                        popUpTo(ROUTE_HOME) { inclusive = true }
//                    }
//                },
//            text = "move to shop screen",
//            textAlign = TextAlign.Center,
//            color = MaterialTheme.colorScheme.onSurface
//        )
//
//        Spacer(modifier = Modifier.height(10.dp))
//
//
//
//        OutlinedButton(onClick = {
//
//            navController.navigate(ROUTE_ADD_STUDENTS) {
//                popUpTo(ROUTE_HOME) { inclusive = true }
//            }
//
//        }) {
//
//            Text(text = "Add Patient")
//
//        }
//
//
//
//
//
//
//
//
//
//
//
//    }
//
//
//}
//}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}

