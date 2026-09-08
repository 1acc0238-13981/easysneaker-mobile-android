package pe.edu.upc.easysneaker.features.onboarding.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pe.edu.upc.easysneaker.R
import pe.edu.upc.easysneaker.core.arrowForward
import pe.edu.upc.easysneaker.core.theme.EasySneakerTheme

@Composable
fun OnBoardingScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {

        Image(
            painter = painterResource(R.drawable.background),
            contentDescription = "background"
        )
        Spacer(modifier = Modifier.weight(2f))
        Text(
            text = "Boost Your Style Sense",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Discover, shop, and unlock exclusive sneakers tailored just for you.",
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.weight(1f))

        IconButton(
            onClick = {},
            colors = IconButtonDefaults.iconButtonColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer
            ),
            modifier = Modifier.size(48.dp)

        ) {
            Icon(arrowForward, contentDescription = "forward")
        }

        Spacer(modifier = Modifier.weight(1f))


    }

}

@Preview(showBackground = true)
@Composable
fun OnBoardingScreenPreview() {
    EasySneakerTheme {
        OnBoardingScreen()
    }
}