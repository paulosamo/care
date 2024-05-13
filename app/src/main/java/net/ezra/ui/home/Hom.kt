package net.ezra.ui.hom




import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")

@Preview
@Composable
fun Text(){

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    androidx.compose.material.Text(text = "sdsdsd")
                },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.ArrowBack, "backIcon")
                    }
                },

                )
        },

        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                //all contents of your screen must be placed within this column













            }

        },

        bottomBar = { BottomBar()  }

    )


}



@Composable
fun BottomBar() {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(elevation = 10.dp) {
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Home,"")
        },
            label = { androidx.compose.material.Text(text = "Home") }, selected = (selectedIndex.value == 0), onClick = {
                selectedIndex.value = 0
            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Favorite,"")
        },
            label = { androidx.compose.material.Text(text = "Favorite") }, selected = (selectedIndex.value == 1), onClick = {
                selectedIndex.value = 1
            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Person, "")
        },
            label = { androidx.compose.material.Text(text = "Profile") }, selected = (selectedIndex.value == 2), onClick = {
                selectedIndex.value = 2
            })
    }
}


//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.layout.wrapContentHeight
//import androidx.compose.material3.Button
//import androidx.compose.material3.Card
//import androidx.compose.material3.CardDefaults
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.OutlinedButton
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.ColorFilter
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.rememberNavController
//import com.google.firebase.annotations.concurrent.Background
//import net.ezra.R
//import net.ezra.navigation.ROUTE_ABOUT
//import net.ezra.navigation.ROUTE_ADD_STUDENTS
//import net.ezra.navigation.ROUTE_CONTACT
//import net.ezra.navigation.ROUTE_HOME
//import net.ezra.navigation.ROUTE_MIT
//import net.ezra.navigation.ROUTE_PRODUCTS
//import net.ezra.navigation.ROUTE_SHOP
//
//@Composable
//fun HomScreen(navController: NavHostController) {
//    Box(modifier = Modifier.fillMaxSize()){
////        Image(painter = painterResource(id = R.drawable.img_5), contentDescription = "",
////            modifier =Modifier.fillMaxSize())
//
//        Column(
//            modifier = Modifier
//                .fillMaxWidth()
//                .wrapContentHeight()
//                .padding(10.dp)
//                .padding(top = 10.dp)
//
//        ){
//
//            Text(text = "welcome to wound care")
//
//            Text(
//                modifier = Modifier
//                    .clickable {
//                        navController.navigate(ROUTE_HOME) {
//                            popUpTo(ROUTE_PRODUCTS) { inclusive = true }
//                        }
//                    },
//                text = "Go home", color = Color(0xff23D342)
//            )
//
//            Spacer(modifier = Modifier.height(10.dp))
//
//            Card {
//               Column (
//                   modifier = Modifier
//                       .fillMaxWidth()
//                       .wrapContentHeight()
//                       .padding(10.dp)
//                       .padding(top = 10.dp)
//               ){
//                   Row {
//                       Image(painter = painterResource(id = R.drawable.img), contentDescription = "", Modifier.fillMaxWidth())
//
//                       Spacer(modifier = Modifier.width(10.dp))
//
//
//
//                   }
//               }
//
//
//
//
//            }
//
//            Spacer(modifier = Modifier.height(15.dp))
//
//
//            Card {
//                Column (
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .wrapContentHeight()
//                        .padding(10.dp)
//                        .padding(top = 10.dp)
//                ){
//                    Row {
//                        Image(painter = painterResource(id = R.drawable.img_4), contentDescription = "", Modifier.fillMaxWidth())
//
//                        Spacer(modifier = Modifier.width(10.dp))
//
//
//
//                    }
//                }
//
//
//
//
//            }
//
//            Spacer(modifier = Modifier.height(15.dp))
//
//
//            Card {
//                Column (
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .wrapContentHeight()
//                        .padding(10.dp)
//                        .padding(top = 10.dp)
//                ){
//                    Row {
//                        Image(painter = painterResource(id = R.drawable.img_1), contentDescription = "", Modifier.fillMaxWidth())
//
//                        Spacer(modifier = Modifier.width(10.dp))
//
//
//
//                    }
//                }
//
//
//
//
//            }
//            Spacer(modifier = Modifier.height(15.dp))
//
//            OutlinedButton(onClick = {
//
//                navController.navigate(ROUTE_ADD_STUDENTS) {
//                    popUpTo(ROUTE_HOME) { inclusive = true }
//                }
//
//            }) {
//
//                Text(text = "Add Patient")
//
//            }
//
//
//
//
//
//
//
//
//        }
//
//    }
//
//}

//@Preview(showBackground = true)
//@Composable
//fun HomScreen() {
//    HomScreen(rememberNavController())
//}