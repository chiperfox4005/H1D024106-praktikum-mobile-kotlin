package com.example.lamaninformatika

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lamaninformatika.ui.theme.LamanInformatikaTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            LamanInformatikaTheme {
                layoutTentangInformatika()
            }
        }
    }
}

@Composable
fun layoutTentangInformatika() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF121016))
    ) {

        // =========================
        // BANNER
        // =========================
        Image(
            painter = painterResource(
                id = R.drawable.gedung_teknik_foreground
            ),
            contentDescription = "Banner Fakultas Teknik",
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp),
            contentScale = ContentScale.Crop
        )

        // =========================
        // JUDUL
        // =========================
        Text(
            text = "Selamat datang di Prodi Informatika,\n" +
                    "Fakultas Teknik,\n" +
                    "Universitas Jenderal Soedirman",
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 8.dp,
                    end = 8.dp,
                    top = 4.dp
                ),
            color = Color.White,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )

        // =========================
        // JARAK
        // =========================
        Spacer(
            modifier = Modifier.height(6.dp)
        )

        // =========================
        // DESKRIPSI
        // =========================
        Text(
            text = "Program Studi Informatika di Universitas Jenderal Soedirman " +
                    "(Unsoed) berdiri pada tahun 2008, berawal dari kebutuhan " +
                    "yang semakin mendesak akan tenaga ahli di bidang teknologi " +
                    "informasi dan komunikasi. Saat itu, perkembangan teknologi " +
                    "yang pesat di Indonesia dan dunia memerlukan adanya " +
                    "program pendidikan tinggi yang mampu mencetak lulusan " +
                    "dengan kompetensi tinggi di bidang informatika.\n\n" +

                    "Pada tahun tersebut, Fakultas Sains dan Teknik (FST) " +
                    "Unsoed mengambil inisiatif untuk mendirikan Program " +
                    "Studi Informatika. Pembentukan program studi ini bertujuan " +
                    "untuk memenuhi tuntutan masyarakat dan industri yang " +
                    "membutuhkan tenaga profesional dalam bidang teknologi " +
                    "informasi. Kurikulum yang disusun diarahkan untuk " +
                    "memberikan pendidikan berkualitas, menggabungkan aspek " +
                    "praktik dan teoritis dari informatika, seperti pemrograman, " +
                    "sistem informasi, jaringan komputer, dan kecerdasan buatan.",
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 4.dp),
            color = Color.White,
            fontSize = 10.sp,
            lineHeight = 11.sp,
            textAlign = TextAlign.Justify
        )

        // =========================
        // TOMBOL NEXT
        // =========================
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 16.dp,
                    end = 16.dp,
                    top = 4.dp
                ),
            horizontalArrangement = Arrangement.End
        ) {

            Button(
                onClick = {
                    // Aksi tombol NEXT
                },
                modifier = Modifier
                    .width(65.dp)
                    .height(40.dp),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(
                    text = "NEXT",
                    fontSize = 10.sp
                )
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {

    LamanInformatikaTheme {
        layoutTentangInformatika()
    }
}