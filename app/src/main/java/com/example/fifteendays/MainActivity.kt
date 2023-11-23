package com.example.fifteendays

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.fifteendays.data.Mineral
import com.example.fifteendays.data.minerales
import com.example.fifteendays.ui.theme.FifteenDaysTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FifteenDaysTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    fifteenDaysApp()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun fifteenDaysApp() {
    Scaffold(
        topBar = {
            MineralTopAppBar()
        }
    ) { contentPadding ->
        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            contentPadding = contentPadding
        ) {
            items(minerales) {
                MineralItem(
                    mineral = it,
                    modifier = Modifier
                        .padding(dimensionResource(id = R.dimen.padding_small))
                )
            }
        }
    }
}


@Composable
fun MineralItem(
    mineral: Mineral,
    modifier: Modifier = Modifier
) {
    Card (modifier = modifier
        .clip(MaterialTheme.shapes.medium)){
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.padding_small))
        ) {
            MineralIcon(mineral.imageResourceId)
            MineralInformation(mineral.name, mineral.hardness, mineral.description)
        }
    }
}

@Composable
fun MineralIcon(
    @DrawableRes mineralIcon: Int,
    modifier: Modifier = Modifier
) {
    Image(
        modifier = modifier
            .size(dimensionResource(R.dimen.image_size))
            .padding(dimensionResource(R.dimen.padding_small))
            .clip(MaterialTheme.shapes.medium),
        contentScale = ContentScale.Crop,
        painter = painterResource(mineralIcon),

        contentDescription = null
    )
}

@Composable
fun MineralInformation(
    @StringRes mineralName: Int,
    mineralAge: Int,
    mineralDescription: Int,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(
            text = stringResource(mineralName),
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(top = dimensionResource(R.dimen.padding_small))
        )
        Text(
            text = stringResource(R.string.hardness, mineralAge),
            style = MaterialTheme.typography.bodyMedium
        )
        Text(text = stringResource(mineralDescription),
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier.padding(top = dimensionResource(R.dimen.padding_small))
        )
    }
}


@Preview
@Composable
fun MineralPreview() {
    FifteenDaysTheme(darkTheme = false) {
        fifteenDaysApp()
    }
}

@Preview
@Composable
fun MineralDarkPreview() {
    FifteenDaysTheme(darkTheme = true) {
        fifteenDaysApp()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MineralTopAppBar(modifier: Modifier = Modifier){
    CenterAlignedTopAppBar(
        title = {
            Row(verticalAlignment = Alignment.CenterVertically){
                Image(
                    modifier = Modifier
                        .size(dimensionResource(id = R.dimen.image_size_top_bar))
                        .padding(dimensionResource(id = R.dimen.padding_small)),
                    painter = painterResource(R.drawable.icon),
                    contentDescription = null
                )
                Text(
                    text = stringResource(id = R.string.app_name),
                    style = MaterialTheme.typography.displayMedium
                )
            }
        }
    )
}

@Preview
@Composable
fun MineralItemPreview(){
    MineralItem(Mineral(R.drawable.mineral10, R.string.mineral10, 2, R.string.mineral_description_1))
}
