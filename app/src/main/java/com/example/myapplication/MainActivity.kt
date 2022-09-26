package com.example.myapplication

import android.content.Context
import android.graphics.drawable.RippleDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity(), CallBack {
    private lateinit var btnBatu: ImageView
    private lateinit var btnKertas: ImageView
    private lateinit var btnGunting: ImageView
    private lateinit var btnRefresh: ImageView
    private lateinit var dataStatus: ImageView
    private lateinit var lawanBatu: ImageView
    private lateinit var lawanKertas: ImageView
    private lateinit var lawanGunting: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBatu = findViewById(R.id.batu)
        btnKertas = findViewById(R.id.kertas)
        btnGunting = findViewById(R.id.gunting)
        btnRefresh = findViewById(R.id.refresh)
        dataStatus = findViewById(R.id.versus)
        lawanBatu = findViewById(R.id.batuLawan)
        lawanKertas = findViewById(R.id.kertasLawan)
        lawanGunting = findViewById(R.id.guntingLawan)

        var isClicked = false
        val rumus = LogicMain(this)
        val btn = mutableListOf(btnBatu, btnGunting, btnKertas)

        repeat(btn.size) {
            btnBatu. setOnClickListener {
                if (!isClicked) {
                    isClicked = true
                    val data = mutableListOf("Batu", "Gunting", "Kertas")
                    val index = (0..2).random()
                    Toast.makeText(this, data[index], Toast.LENGTH_SHORT).show()
                    btnBatu.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.batu))
                    btnBatu.background = (ContextCompat.getDrawable(this, R.drawable.select))

                    btnKertas.setBackgroundResource(R.drawable.kertas)
                    btnGunting.setBackgroundResource(R.drawable.gunting)

                    when (index) {
                        0 -> {
                            lawanBatu.setImageDrawable(
                                ContextCompat.getDrawable(
                                    this,
                                    R.drawable.batu
                                )
                            )
                            lawanBatu.background =
                                (ContextCompat.getDrawable(this, R.drawable.select))
                            lawanKertas.setBackgroundResource(R.drawable.kertas)
                            lawanGunting.setBackgroundResource(R.drawable.gunting)
                            rumus.rumusMain(0, 0)
                        }
                        1 -> {
                            lawanGunting.setImageDrawable(
                                ContextCompat.getDrawable(
                                    this,
                                    R.drawable.gunting
                                )
                            )
                            lawanGunting.background =
                                (ContextCompat.getDrawable(this, R.drawable.select))
                            lawanBatu.setBackgroundResource(R.drawable.batu)
                            lawanKertas.setBackgroundResource(R.drawable.kertas)
                            rumus.rumusMain(1, 1)
                        }
                        2 ->{
                            lawanKertas.setImageDrawable(
                                ContextCompat.getDrawable(
                                    this,
                                    R.drawable.kertas
                                )
                            )
                            lawanKertas.background =
                                (ContextCompat.getDrawable(this, R.drawable.select))
                            lawanBatu.setBackgroundResource(R.drawable.batu)
                            lawanGunting.setBackgroundResource(R.drawable.gunting)
                            rumus.rumusMain(0, 2)
                        }
                    }
                } else {
                    Toast.makeText(this, "Harap Tekan Tombol Refresh", Toast.LENGTH_SHORT).show()
                }
            }
            btnGunting.setOnClickListener {
                if (!isClicked) {
                    isClicked = true
                    val data = mutableListOf("Batu", "Gunting", "Kertas")
                    val index = (0..2).random()
                    Toast.makeText(this, "Musuh Memilih ${data[index]}", Toast.LENGTH_SHORT).show()
                    btnGunting.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.gunting))
                    btnGunting.background = (ContextCompat.getDrawable(this, R.drawable.select))

                    btnKertas.setBackgroundResource(R.drawable.kertas)
                    btnBatu.setBackgroundResource(R.drawable.batu)

                    when (index) {
                        0 -> {
                            lawanBatu.setImageDrawable(
                                ContextCompat.getDrawable(
                                    this,
                                    R.drawable.batu
                                )
                            )
                            lawanBatu.background =
                                (ContextCompat.getDrawable(this, R.drawable.select))
                            lawanKertas.setBackgroundResource(R.drawable.kertas)
                            lawanGunting.setBackgroundResource(R.drawable.gunting)
                            rumus.rumusMain(1, 0)
                        }
                        1 -> {
                            lawanGunting.setImageDrawable(
                                ContextCompat.getDrawable(
                                    this,
                                    R.drawable.gunting
                                )
                            )
                            lawanGunting.background =
                                (ContextCompat.getDrawable(this, R.drawable.select))
                            lawanBatu.setBackgroundResource(R.drawable.batu)
                            lawanKertas.setBackgroundResource(R.drawable.kertas)
                            rumus.rumusMain(1, 0)
                        }
                        1 -> {
                            lawanGunting.setImageDrawable(
                                ContextCompat.getDrawable(
                                    this,
                                    R.drawable.gunting
                                )
                            )
                            lawanGunting.background =
                                (ContextCompat.getDrawable(this,R.drawable.select))
                            lawanBatu.setBackgroundResource(R.drawable.batu)
                            lawanKertas.setBackgroundResource(R.drawable.kertas)
                            rumus.rumusMain(1,1)
                        }
                        2 -> {
                            lawanKertas.setImageDrawable(
                                ContextCompat.getDrawable(
                                    this,
                                    R.drawable.kertas
                                )
                            )
                            lawanKertas.background =
                                (ContextCompat.getDrawable(this, R.drawable.select))
                            lawanBatu.setBackgroundResource(R.drawable.batu)
                            lawanGunting.setBackgroundResource(R.drawable.gunting)
                            rumus.rumusMain(1, 2)
                        }
                    }
                } else {
                    Toast.makeText(this, "Harap Tekan Tombol Refresh", Toast.LENGTH_SHORT).show()
                }
            }
            btnKertas.setOnClickListener {
                if (!isClicked) {
                    isClicked = true
                    val data = mutableListOf("Batu", "Gunting", "Kertas")
                    val index = (0..2).random()
                    Toast.makeText(this, data[index], Toast.LENGTH_SHORT).show()
                    btnKertas.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.kertas))
                    btnKertas.background = (ContextCompat.getDrawable(this, R.drawable.select))

                    btnGunting.setBackgroundResource(R.drawable.gunting)
                    btnBatu.setBackgroundResource(R.drawable.batu)

                    when (index) {
                        0 -> {
                            lawanBatu.setImageDrawable(
                                ContextCompat.getDrawable(
                                    this,
                                    R.drawable.batu
                                )
                            )
                            lawanBatu.background =
                                (ContextCompat.getDrawable(this, R.drawable.select))
                            lawanKertas.setBackgroundResource(R.drawable.kertas)
                            lawanGunting.setBackgroundResource(R.drawable.gunting)
                            rumus.rumusMain(2, 0)
                        }
                        1 -> {
                            lawanGunting.setImageDrawable(
                                ContextCompat.getDrawable(
                                    this,
                                    R.drawable.gunting
                                )
                            )
                            lawanGunting.background =
                                (ContextCompat.getDrawable(this, R.drawable.select ))
                            lawanBatu.setBackgroundResource(R.drawable.batu)
                            lawanKertas.setBackgroundResource(R.drawable.kertas)
                            rumus.rumusMain(2, 1)
                        }
                        2 -> {
                            lawanKertas.setImageDrawable(
                                ContextCompat.getDrawable(
                                    this,
                                    R.drawable.kertas
                                )
                            )
                            lawanKertas.background =
                                (ContextCompat.getDrawable(this, R.drawable.select))
                            lawanBatu.setBackgroundResource(R.drawable.batu)
                            lawanGunting.setBackgroundResource(R.drawable.gunting)
                            rumus.rumusMain(2,2)

                        }
                    }
                } else {
                    Toast.makeText(this, "Harap Tekan Tombol Refresh", Toast.LENGTH_SHORT).show()
                }
            }
        }

        btnRefresh.setOnClickListener {
            isClicked = false
            dataStatus.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vs))
            btnBatu.setBackgroundResource(R.drawable.batu)
            btnGunting.setBackgroundResource(R.drawable.gunting)
            btnKertas.setBackgroundResource(R.drawable.kertas)
            lawanBatu.setBackgroundResource(R.drawable.batu)
            lawanGunting.setBackgroundResource(R.drawable.gunting)
            lawanKertas.setBackgroundResource(R.drawable.kertas)
        }
    }

    override fun kirimStatus(status: String) {
        when {
            status.contains("W") -> {
                dataStatus.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.p1menang))
            }
            status.contains("L") -> {
                dataStatus.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.p2menang))
            }
            status.contains("D") -> {
                dataStatus.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.draw))
            }
        }
    }
}