package com.ariqandrean.myapplication190421

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_order.*
import kotlinx.android.synthetic.main.activity_payment.*

class PaymentActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        supportActionBar!!.title = "Pembayaran"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val intent = intent
        val giImage = intent.getIntExtra("iImg", 0)
        val giNamaBrg = intent.getStringExtra("i_NamaBrg")
        val giJumlahOrder = intent.getStringExtra("i_JumlOrder")
        val giTotalHarga = intent.getStringExtra("i_Totharga")

        imgpayment.setImageResource(giImage)

        val pembayaran = findViewById<TextView>(R.id.printBayar)

        pembayaran.text = """
                            Nama Barang : $giNamaBrg
                            
                            Jumlah Order: $giJumlahOrder
                            
                            Total Harga : $giTotalHarga
                            """.trimIndent()
//        pembayaran.text = "Nama Sepatu\n\n\t\t\b "+NSepatu+
//                          "\n\nJumlahOrder\n\n\t\t\b"+JOrder+
//                          "TOtal Harga\n\n\t\t\b"+TotHarga

        val etNamaPemesan = findViewById<EditText>(R.id.et_namaPemesan)
        val etNomorTelp = findViewById<EditText>(R.id.et_noTelp)
        val etEmail = findViewById<EditText>(R.id.et_email)
        val btnConfirm = findViewById<Button>(R.id.btn_Confirm)

        btnConfirm.setOnClickListener{
//            val printPesanan = pembayaran.text.toString()
//            val Npemesan = etNamaPemesan.text.toString()
//            val Ntelp = etNomorTelp.text.toString()
//            val NEmail = etEmail.text.toString()

            val intent = Intent(this, PaymentDoneActivity::class.java)
//            intent.putExtra("P_pesanan", printPesanan)
//            intent.putExtra("N_pemesan", Npemesan)
//            intent.putExtra("N_telp", Ntelp)
//            intent.putExtra("N_email", NEmail)
            startActivities(arrayOf(intent))
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
