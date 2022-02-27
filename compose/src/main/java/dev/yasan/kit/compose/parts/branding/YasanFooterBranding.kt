package dev.yasan.kit.compose.parts.branding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import dev.yasan.kit.compose.R
import dev.yasan.kit.compose.foundation.grid

/**
 * YASAN branding footer composable. Shows YASAN logo in form of a footer.
 */
@Composable
fun YasanBrandingFooter(
    modifier: Modifier = Modifier,
    spacerTop: Dp = grid(8),
    spacerBottom: Dp = grid(8),
    logoHeight: Dp = grid(6),
    crossFade: Boolean = true,
) {

    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (spacerTop > 0.dp) {
            Spacer(Modifier.requiredHeight(spacerTop))
        }
        Image(
            rememberImagePainter(
                data = R.drawable.ic_yasan_logo_text2_color,
                builder = {
                    crossfade(crossFade)
                }
            ),
            contentDescription = null,
            modifier = Modifier.requiredHeight(logoHeight)
        )
        if (spacerBottom > 0.dp) {
            Spacer(Modifier.requiredHeight(spacerBottom))
        }
    }

}