package com.example.flash.ui

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.flash.R
import com.example.flash.data.DataSource

@Composable
fun StartScreen()
{
      val context= LocalContext.current
      LazyVerticalGrid(columns = GridCells.Adaptive(128.dp),
            contentPadding = PaddingValues(10.dp),
            verticalArrangement = Arrangement.spacedBy(5.dp),
            horizontalArrangement = Arrangement.spacedBy(5.dp)
      ){
      items(DataSource.loadCategories()) { CategoryCard(
            context = context,
            stringResourceId = it.stringResourceId, imageResourceId = it.imageResourceId) }
      }
}
@Composable
fun CategoryCard(
      context:Context,
      stringResourceId: Int,
      imageResourceId: Int
)
{
      Card (modifier = Modifier.clickable { Toast.makeText(context, "This card was clicked.", Toast.LENGTH_SHORT).show() }){
            Column(modifier = Modifier.padding(5.dp)){
                  Text(text = stringResource(id = stringResourceId), fontSize = 17.sp, modifier = Modifier.width(150.dp))
                  Image(painter = painterResource(id =imageResourceId), contentDescription = "fruits image",
                        modifier = Modifier.size(150.dp))
            }
      }
}